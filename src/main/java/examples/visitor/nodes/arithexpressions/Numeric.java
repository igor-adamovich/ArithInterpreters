package examples.visitor.nodes.arithexpressions;

import examples.visitor.visitor.ASTVisitor;

public class Numeric extends ArithExpression {
	public double value;
	
	public void accept0(ASTVisitor visitor) {
		visitor.visit(this);
	}

	public Numeric(double value) {
		this.value = value;
	}
}
