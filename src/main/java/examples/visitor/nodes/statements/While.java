package examples.visitor.nodes.statements;

import examples.visitor.nodes.booleanexpression.BooleanExpression;
import examples.visitor.visitor.ASTVisitor;

public class While extends Statement{
	public BooleanExpression expression;
	public Begin begin;
	
	public While(BooleanExpression expression, Begin begin, Statement nextStatement) {
		this.expression = expression;
		this.begin = begin;
		this.nextStatement = nextStatement;
	}
	
	public void accept(ASTVisitor visitor) {
		if (visitor == null) {
			throw new IllegalArgumentException();
		}
		visitor.visit(this);
	}
}
