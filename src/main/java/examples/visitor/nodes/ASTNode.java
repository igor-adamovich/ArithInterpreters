package examples.visitor.nodes;

import examples.visitor.visitor.ASTVisitor;

public abstract class ASTNode {
	public abstract void accept(ASTVisitor visitor);
}
