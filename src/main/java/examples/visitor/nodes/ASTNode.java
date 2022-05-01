package examples.visitor.nodes;

import examples.visitor.visitor.ASTVisitor;

public abstract class ASTNode {
	public final void accept(ASTVisitor visitor) {
		if (visitor == null) {
			throw new IllegalArgumentException();
		}
		accept0(visitor);
	}
	
	public abstract void accept0(ASTVisitor visitor);
}
