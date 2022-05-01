package examples.descend;

import ru.psiras.spec.annotations.Specialize;
import examples.descend.arithexpressions.*;
import examples.descend.booleanexpression.BooleanExpression;
import examples.descend.booleanexpression.BooleanOperator;
import examples.descend.statements.*;

public class ArithExample {

	@Specialize
	public static final double sqrt(double a, double dEps) {
		Var vars = new Var();
		vars.name = 'a';
		vars.value = a;
		vars.nextVar = new Var();
		vars.nextVar.name = 'x';
		vars.nextVar.value = 1.0; 
		vars.nextVar.nextVar = new Var();
		vars.nextVar.nextVar.name = 'e';
		vars.nextVar.nextVar.value = dEps;
		vars.nextVar.nextVar.nextVar = new Var();
		vars.nextVar.nextVar.nextVar.name = 'd';
		vars.nextVar.nextVar.nextVar.nextVar = null;
		
		
		/* d = a
		 * x = 0.5 * (x + a/x)
		 * while (eps < abs(x - d)) begin
		      d = x
		      x = 0.5 * (x + a/x) 
		 */
		
		Begin begin = new Begin();
		begin.size = 3;
		
		// d = a
		Assignment initDAssignment = new Assignment();
		initDAssignment.type = ASTInterpreter.ASSIGNMENT;
		begin.statements = initDAssignment;
		initDAssignment.left = 'd';
		
		Variable aRight = new Variable();
		aRight.type = ASTInterpreter.VARIABLE;
		aRight.name = 'a';
		initDAssignment.right = aRight;
		
		// x = 0.5 * (x + a/x)
		Assignment initXAssignment = new Assignment();
		initXAssignment.type = ASTInterpreter.ASSIGNMENT;
		initDAssignment.nextStatement = initXAssignment;
		initXAssignment.left = 'x';

		// 0.5 * (x + a/x)
		ArithOperator initMult = new ArithOperator();
		initXAssignment.right = initMult;
		initMult.type = ASTInterpreter.OPERATOR;
		initMult.opType = ASTInterpreter.MULT;

		// 0.5
		Numeric initMultLeft = new Numeric();
		initMult.left = initMultLeft;
		initMultLeft.type = ASTInterpreter.VALUE;
		initMultLeft.value = 0.5;

		// (x + a/x)
		ArithOperator initSumMultRight = new ArithOperator();
		initMult.right = initSumMultRight;
		initSumMultRight.type = ASTInterpreter.OPERATOR;
		initSumMultRight.opType = ASTInterpreter.SUM;

		Variable initXSumLeft = new Variable();
		initSumMultRight.left = initXSumLeft;
		initXSumLeft.type = ASTInterpreter.VARIABLE;
		initXSumLeft.name = 'x';

		ArithOperator initDivSumRight = new ArithOperator();
		initSumMultRight.right = initDivSumRight;
		initDivSumRight.type = ASTInterpreter.OPERATOR;
		initDivSumRight.opType = ASTInterpreter.DIV;

		Variable initADivLeft = new Variable();
		initDivSumRight.left = initADivLeft;
		initADivLeft.type = ASTInterpreter.VARIABLE;
		initADivLeft.name = 'a';

		Variable initXDivRight = new Variable();
		initDivSumRight.right = initXDivRight;
		initXDivRight.type = ASTInterpreter.VARIABLE;
		initXDivRight.name = 'x';
		
		
		While whileSt = new While();
		whileSt.type = ASTInterpreter.WHILE;
		whileSt.begin = new Begin();
		whileSt.begin.size = 2;
		initXAssignment.nextStatement = whileSt;
		whileSt.nextStatement = null;
		
		BooleanOperator cond = new BooleanOperator();
		cond.type = ASTInterpreter.OPERATOR;
		cond.opType = ASTInterpreter.LESS;
		Variable eps =  new Variable();
		eps.type = ASTInterpreter.VARIABLE;
		eps.name ='e';
		cond.left = eps;
		
		Abs absXminusD = new Abs();
		absXminusD.type = ASTInterpreter.ABS;
		cond.right = absXminusD;
		
		ArithOperator minus = new ArithOperator();
		absXminusD.expr = minus;
		minus.type = ASTInterpreter.OPERATOR;
		minus.opType = ASTInterpreter.MINUS;
		
		Variable xInAbs =  new Variable();
		xInAbs.type = ASTInterpreter.VARIABLE;
		xInAbs.name = 'x';
		minus.left = xInAbs;
		
		Variable dInAbs =  new Variable();
		dInAbs.type = ASTInterpreter.VARIABLE;
		dInAbs.name = 'd';
		minus.right = dInAbs; 
		
		whileSt.expression = cond;
		
		// d = x
		Assignment dAssignment = new Assignment();
		dAssignment.type = ASTInterpreter.ASSIGNMENT;
		whileSt.begin.statements = dAssignment;
		dAssignment.left = 'd';
		
		//x
		Variable xRight = new Variable();
		xRight.type = ASTInterpreter.VARIABLE;
		xRight.name = 'x';
		dAssignment.right = xRight;
		
		
		// x = 0.5 * (x + a/x)
		Assignment xAssignment = new Assignment();
		xAssignment.type = ASTInterpreter.ASSIGNMENT;
		dAssignment.nextStatement = xAssignment;
		xAssignment.left = 'x';
		//1. Should work without null
		//2. left hand side access shouldnt generate an object that should be replaced by null
		xAssignment.nextStatement = null;
		
		// 0.5 * (x + a/x)
		ArithOperator mult = new ArithOperator();
		xAssignment.right = mult;
		mult.type = ASTInterpreter.OPERATOR;
		mult.opType = ASTInterpreter.MULT;
		
		// 0.5
		Numeric multLeft = new Numeric();
		mult.left = multLeft;
		multLeft.type = ASTInterpreter.VALUE;
		multLeft.value = 0.5;
		
		// (x + a/x)
		ArithOperator sumMultRight = new ArithOperator();
		mult.right = sumMultRight;
		sumMultRight.type = ASTInterpreter.OPERATOR;
		sumMultRight.opType = ASTInterpreter.SUM;
		
		Variable xSumLeft = new Variable();
		sumMultRight.left = xSumLeft;
		xSumLeft.type = ASTInterpreter.VARIABLE;
		xSumLeft.name = 'x';
		
		ArithOperator divSumRight = new ArithOperator();
		sumMultRight.right = divSumRight;
		divSumRight.type = ASTInterpreter.OPERATOR;
		divSumRight.opType = ASTInterpreter.DIV;
		
		Variable aDivLeft = new Variable();
		divSumRight.left = aDivLeft;
		aDivLeft.type = ASTInterpreter.VARIABLE;
		aDivLeft.name = 'a';
		
		Variable xDivRight = new Variable();
		divSumRight.right = xDivRight;
		xDivRight.type = ASTInterpreter.VARIABLE;
		xDivRight.name = 'x';
		
		return ASTInterpreter.execute(begin, vars);
	}
}
