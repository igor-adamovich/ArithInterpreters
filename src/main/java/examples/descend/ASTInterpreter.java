package examples.descend;

import examples.descend.arithexpressions.Abs;
import examples.descend.arithexpressions.ArithExpression;
import examples.descend.arithexpressions.ArithOperator;
import examples.descend.arithexpressions.Numeric;
import examples.descend.arithexpressions.Variable;
import examples.descend.booleanexpression.BooleanExpression;
import examples.descend.booleanexpression.BooleanOperator;
import examples.descend.booleanexpression.BooleanValue;
import examples.descend.statements.Assignment;
import examples.descend.statements.Begin;
import examples.descend.statements.Statement;
import examples.descend.statements.While;
import ru.psiras.spec.annotations.SpecInline;

public class ASTInterpreter {
	
	final static int ASSIGNMENT = 0;
	final static int WHILE = 1;
	
	final static int BOOLEANVALUE = 2;
	final static int OPERATOR = 3;
	final static int VALUE = 4;
	final static int VARIABLE = 5;
	final static int ABS = 6;
	
	final static int EQUALS = 7;
	final static int LESS = 8;
	final static int GREATER = 9;
	final static int LESSQUALS = 10;
	final static int GREATEREQUALS = 11;
	
	final static int SUM = 12;
	final static int MINUS = 13;
	final static int MULT = 14;
	final static int DIV = 15;
	
	public static final double execute(Begin begin, 
									 Var vars) {
		int i = 0;
		double result = 0;
		Statement stsIter = begin.statements;
		while (i < begin.size) {
			result = executeStatement(stsIter, vars);
			stsIter = stsIter.nextStatement;
			i++;
		}	
		return result;
	}
	
	public static final double executeStatement(Statement st, 
							   Var vars) {		
		double result = 0;
		if (st.type == ASSIGNMENT) {
			return processAssignment(st, vars);
		} else if (st.type == WHILE){
			return processWhile(st, vars);
		}
		return result;
	}

	private static double processAssignment(Statement st, Var vars) {
		Assignment assignment = (Assignment) st;
		Var varIter = lookup(vars, assignment.left);
		varIter.value = executeArithExpression(assignment.right, 
												 vars);
		return varIter.value;
	}
	
	private static double processWhile(Statement st, Var vars) {
		While wh = (While) st;
		double result = 0;
		boolean iterExpression = executeBoolExpression(wh.expression, vars);
		while(iterExpression) {
			result = execute(wh.begin, vars);
			iterExpression = executeBoolExpression(wh.expression, vars);
		}
		return result;
	}
	
	private static final Var lookup(Var vars, char name) {
		Var varIter = vars;
		while(varIter.name != name) {
			varIter = varIter.nextVar;
		}
		return varIter;
	}
	
	public static final boolean 
	executeBoolExpression(BooleanExpression expression,
			              Var vars) {
		if (expression.type == BOOLEANVALUE) {
			BooleanValue value = (BooleanValue) expression;
			return value.value;
		} else if (expression.type == OPERATOR) {
			BooleanOperator operator = (BooleanOperator) expression;
			boolean result = executeBoolOperator(operator, vars);
			return result;
		}
		return false;
	}
	
	public static final boolean 
	executeBoolOperator(BooleanOperator operator,
                        Var vars) {
		if (operator.opType == EQUALS) {
			return equals(operator, vars);
		} else if (operator.opType == LESS) {
			return less(operator, vars);
		} else if (operator.opType == GREATER) {
			return greater(operator, vars);
		} else if (operator.opType == LESSQUALS) {
			return lessEquals(operator, vars);
		} else if (operator.opType == GREATEREQUALS) {
			return greaterEquals(operator, vars);
		}
		return false;
	}

	private static boolean equals(BooleanOperator operator, Var vars) {
		double left = executeArithExpression(operator.left, vars);
		double right = executeArithExpression(operator.right, vars);
		return left == right;
	}

	private static boolean less(BooleanOperator operator, Var vars) {
		double left = executeArithExpression(operator.left, vars);
		double right = executeArithExpression(operator.right, vars);
		return left < right;
	}

	private static boolean greater(BooleanOperator operator, Var vars) {
		double left = executeArithExpression(operator.left, vars);
		double right = executeArithExpression(operator.right, vars);
		return left > right;
	}

	private static boolean lessEquals(BooleanOperator operator, Var vars) {
		double left = executeArithExpression(operator.left, vars);
		double right = executeArithExpression(operator.right, vars);
		return left <= right;
	}

	private static boolean greaterEquals(BooleanOperator operator, Var vars) {
		double left = executeArithExpression(operator.left, vars);
		double right = executeArithExpression(operator.right, vars);
		return left >= right;
	}
	
	public static final double 
	executeArithExpression(ArithExpression expression,
			               Var vars) {
		if (expression.type == VALUE) {
			return value(expression);
		} else if (expression.type == OPERATOR) {
			return operator(expression, vars);
		} else if (expression.type == VARIABLE) {
			return variable(expression, vars);
		}  else if (expression.type == ABS) {
			return abs(expression, vars);
		}
		return 0;		
	}

	private static double value(ArithExpression expression) {
		Numeric value = (Numeric) expression;
		return value.value;
	}

	private static double operator(ArithExpression expression, Var vars) {
		ArithOperator operator = (ArithOperator) expression;
		double result = executeArithOperator(operator, vars);
		return result;
	}

	private static double variable(ArithExpression expression, Var vars) {
		Variable variable = (Variable) expression;
		Var var = lookup(vars, variable.name);
		return var.value;
	}

	private static double abs(ArithExpression expression, Var vars) {
		Abs abs = (Abs) expression;
		double result;
		result = executeArithExpression(abs.expr, vars);
		return Math.abs(result);
	}
	
	public static final double 
	executeArithOperator(ArithOperator operator,
                        Var vars) {
		if (operator.opType == SUM) {
			return sum(operator, vars);
		} else if (operator.opType == MINUS) {
			return sub(operator, vars);
		} else if (operator.opType == MULT) {
			return mult(operator, vars);
		} else if (operator.opType == DIV) {
			return div(operator, vars);
		}
		return 0;
	}
	
	private static double sum(ArithOperator operator, Var vars) {
		double left = executeArithExpression(operator.left, vars);
		double right = executeArithExpression(operator.right, vars);
		return left + right;
	}
	
	private static double sub(ArithOperator operator, Var vars) {
		double left = executeArithExpression(operator.left, vars);
		double right = executeArithExpression(operator.right, vars);
		return left - right;
	}
	
	private static double mult(ArithOperator operator, Var vars) {
		double left = executeArithExpression(operator.left, vars);
		double right = executeArithExpression(operator.right, vars);
		return left * right;
	}
	
	private static double div(ArithOperator operator, Var vars) {
		double left = executeArithExpression(operator.left, vars);
		double right = executeArithExpression(operator.right, vars);
		return left / right;
	}
}
