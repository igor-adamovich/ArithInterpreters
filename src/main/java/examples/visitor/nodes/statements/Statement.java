package examples.visitor.nodes.statements;

import examples.visitor.nodes.ASTNode;

public abstract class Statement extends ASTNode{
	public Statement nextStatement;
}
