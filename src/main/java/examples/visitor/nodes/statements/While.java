package examples.visitor.nodes.statements;

import examples.visitor.nodes.booleanexpression.BooleanExpression;
import examples.visitor.visitor.ASTVisitor;

public class While extends Statement{
	public BooleanExpression expression;
	public Begin begin;
	
	public void accept0(ASTVisitor visitor) {
		visitor.visit(this);
	}

	public While(BooleanExpression expression, Begin begin, Statement nextStatement) {
		this.expression = expression;
		this.begin = begin;
		this.nextStatement = nextStatement;
	}
}
