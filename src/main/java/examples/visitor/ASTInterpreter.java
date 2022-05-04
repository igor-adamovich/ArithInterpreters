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
	public void visit(Assignment assignment) {
		Var var = lookup(assignment.left);
		assignment.right.accept(this);
		var.value = currentValue;
	}

	@Override
	public void visit(Begin begin) {
		int i = 0;
		double result = 0;
		Statement stsIter = begin.statements;
		while (i < begin.size) {
			stsIter.accept(this);
			result = currentValue;
			stsIter = stsIter.nextStatement;
			i++;
		}	
		currentValue = result;
	}

	@Override
	public void visit(While wh) {
		double result = currentValue;
		wh.expression.accept(this);
		while(currentConditionValue) {
			wh.begin.accept(this);
			result = currentValue;
			wh.expression.accept(this);	
		}
		currentValue = result;
	}

	@Override
	public void visit(Abs abs) {
		abs.expr.accept(this);
		currentValue = Math.abs(currentValue);
	}

	@Override
	public void visit(Numeric value) {
		currentValue = value.value;
	}

	@Override
	public void visit(Variable variable) {
		currentValue = lookup(variable.name).value;
	}


	@Override
	public void visit(BooleanValue boolValue) {
		currentConditionValue = boolValue.value;
	}

	private final Var lookup(char name) {
		Var varIter = vars;
		while(varIter.name != name) {
			varIter = varIter.nextVar;
		}
		return varIter;
	}

	@Override
	public void visit(Div div) {
		div.left.accept(this);
		double left = currentValue;
		div.right.accept(this);
		double right = currentValue;
		currentValue = left / right;
	}

	@Override
	public void visit(Minus minus) {
		minus.left.accept(this);
		double left = currentValue;
		minus.right.accept(this);
		double right = currentValue;
		currentValue = left - right;
	}

	@Override
	public void visit(Mult mult) {
		mult.left.accept(this);
		double left = currentValue;
		mult.right.accept(this);
		double right = currentValue;
		currentValue = left * right;
	}

	@Override
	public void visit(Sum sum) {
		sum.left.accept(this);
		double left = currentValue;
		sum.right.accept(this);
		double right = currentValue;
		currentValue = left + right;
	}

	@Override
	public void visit(Equals equals) {
		equals.left.accept(this);
		double left = currentValue;
		equals.right.accept(this);
		double right = currentValue;
		currentConditionValue = left == right;
	}

	@Override
	public void visit(Greater greater) {
		greater.left.accept(this);
		double left = currentValue;
		greater.right.accept(this);
		double right = currentValue;
		currentConditionValue = left > right;
	}

	@Override
	public void visit(GreaterEquals greaterEquals) {
		greaterEquals.left.accept(this);
		double left = currentValue;
		greaterEquals.right.accept(this);
		double right = currentValue;
		currentConditionValue = left >= right;
	}

	@Override
	public void visit(Less less) {
		less.left.accept(this);
		double left = currentValue;
		less.right.accept(this);
		double right = currentValue;
		currentConditionValue = left < right;
	}

	@Override
	public void visit(LessEquals lessEquals) {
		lessEquals.left.accept(this);
		double left = currentValue;
		lessEquals.right.accept(this);
		double right = currentValue;
		currentConditionValue = left <= right;
	}
}
