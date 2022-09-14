package examples.visitor.nodes.arithexpressions;

import examples.visitor.visitor.ASTVisitor;

public class Abs extends ArithExpression {
	public ArithExpression expr;
	
	public Abs(ArithExpression expr) {
		this.expr = expr;
	}
	
	public void accept(ASTVisitor visitor) {
		if (visitor == null) {
			throw new IllegalArgumentException();
		}
		visitor.visit(this);
	}
}
