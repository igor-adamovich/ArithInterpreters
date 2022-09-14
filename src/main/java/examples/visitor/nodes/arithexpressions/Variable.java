package examples.visitor.nodes.arithexpressions;

import examples.visitor.visitor.ASTVisitor;

public class Variable extends ArithExpression{
	public char name;

	public Variable(char name) {
		this.name = name;
	}
	
	public void accept(ASTVisitor visitor) {
		if (visitor == null) {
			throw new IllegalArgumentException();
		}
		visitor.visit(this);
	}
}
