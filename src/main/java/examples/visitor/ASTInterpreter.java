package examples.visitor;

import examples.visitor.nodes.arithexpressions.*;
import examples.visitor.nodes.booleanexpression.*;
import examples.visitor.nodes.statements.*;
import examples.visitor.visitor.ASTVisitor;

public class ASTInterpreter extends ASTVisitor {
	Var vars;
	
	public double currentValue = 0.0;
	public boolean currentConditionValue = false;
	
	public ASTInterpreter(Var vars) {
		this.vars = vars;
	}

	@Override
	public void visit(Assignment st) {
		Var var = lookup(st.left);
		st.right.accept(this);
		var.value = currentValue;
	}

	@Override
	public void visit(Begin st) {
		int i = 0;
		double result = 0;
		Statement stsIter = st.statements;
		while (i < st.size) {
			stsIter.accept(this);
			result = currentValue;
			stsIter = stsIter.nextStatement;
			i++;
		}	
		currentValue = result;
	}

	@Override
	public void visit(While st) {
		double result = currentValue;
		st.expression.accept(this);
		while(currentConditionValue) {
			st.begin.accept(this);
			result = currentValue;
			st.expression.accept(this);	
		}
		currentValue = result;
	}

	@Override
	public void visit(Abs expr) {
		expr.expr.accept(this);
		currentValue = Math.abs(currentValue);
	}

	@Override
	public void visit(Numeric expr) {
		currentValue = expr.value;
	}

	@Override
	public void visit(Variable expr) {
		currentValue = lookup(expr.name).value;
	}


	@Override
	public void visit(BooleanValue expr) {
		currentConditionValue = expr.value;
	}

	private final Var lookup(char name) {
		Var varIter = vars;
		while(varIter.name != name) {
			varIter = varIter.nextVar;
		}
		return varIter;
	}

	@Override
	public void visit(Div expr) {
		expr.left.accept(this);
		double left = currentValue;
		expr.right.accept(this);
		double right = currentValue;
		currentValue = left / right;
	}

	@Override
	public void visit(Minus expr) {
		expr.left.accept(this);
		double left = currentValue;
		expr.right.accept(this);
		double right = currentValue;
		currentValue = left - right;
	}

	@Override
	public void visit(Mult expr) {
		expr.left.accept(this);
		double left = currentValue;
		expr.right.accept(this);
		double right = currentValue;
		currentValue = left * right;
	}

	@Override
	public void visit(Sum expr) {
		expr.left.accept(this);
		double left = currentValue;
		expr.right.accept(this);
		double right = currentValue;
		currentValue = left + right;
	}

	@Override
	public void visit(Equals expr) {
		expr.left.accept(this);
		double left = currentValue;
		expr.right.accept(this);
		double right = currentValue;
		currentConditionValue = left == right;
	}

	@Override
	public void visit(Greater expr) {
		expr.left.accept(this);
		double left = currentValue;
		expr.right.accept(this);
		double right = currentValue;
		currentConditionValue = left > right;
	}

	@Override
	public void visit(GreaterEquals expr) {
		expr.left.accept(this);
		double left = currentValue;
		expr.right.accept(this);
		double right = currentValue;
		currentConditionValue = left >= right;
	}

	@Override
	public void visit(Less expr) {
		expr.left.accept(this);
		double left = currentValue;
		expr.right.accept(this);
		double right = currentValue;
		currentConditionValue = left < right;
	}

	@Override
	public void visit(LessEquals expr) {
		expr.left.accept(this);
		double left = currentValue;
		expr.right.accept(this);
		double right = currentValue;
		currentConditionValue = left <= right;
	}
}
