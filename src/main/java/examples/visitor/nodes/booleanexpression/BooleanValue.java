package examples.visitor.nodes.booleanexpression;

import examples.visitor.visitor.ASTVisitor;

public class BooleanValue extends BooleanExpression{
	public boolean value;
	
	public void accept0(ASTVisitor visitor) {
		visitor.visit(this);
	}

	public BooleanValue(boolean value) {
		this.value = value;
	}
}
