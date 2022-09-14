package examples.visitor.nodes.booleanexpression;

import examples.visitor.visitor.ASTVisitor;

public class BooleanValue extends BooleanExpression{
	public boolean value;
	
	public BooleanValue(boolean value) {
		this.value = value;
	}
	
	public void accept(ASTVisitor visitor) {
		if (visitor == null) {
			throw new IllegalArgumentException();
		}
		visitor.visit(this);
	}
}
