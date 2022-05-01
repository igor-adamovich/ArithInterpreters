package examples.visitor.nodes.arithexpressions;

import examples.visitor.visitor.ASTVisitor;

public class Variable extends ArithExpression{
	public char name;
	
	public void accept0(ASTVisitor visitor) {
		visitor.visit(this);
	}

	public Variable(char name) {
		this.name = name;
	}	
}
