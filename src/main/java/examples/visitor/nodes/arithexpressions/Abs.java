package examples.visitor.nodes.arithexpressions;

import examples.visitor.visitor.ASTVisitor;

public class Abs extends ArithExpression {
	public ArithExpression expr;
	
	public void accept0(ASTVisitor visitor) {
		visitor.visit(this);
	}

	public Abs(ArithExpression expr) {
		this.expr = expr;
	}
}
