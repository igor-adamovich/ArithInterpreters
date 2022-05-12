package examples.visitor.visitor;

import examples.visitor.nodes.arithexpressions.*;
import examples.visitor.nodes.booleanexpression.*;
import examples.visitor.nodes.statements.*;

public abstract class ASTVisitor {
	public abstract void visit(Assignment assignment);
	public abstract void visit(Begin begin);
	public abstract void visit(While wh);
	
	public abstract void visit(Abs abs);
	public abstract void visit(Numeric value);
	public abstract void visit(Variable variable);
	public abstract void visit(Div div);
	public abstract void visit(Minus minus);
	public abstract void visit(Mult mult);
	public abstract void visit(Sum sum);
	
	public abstract void visit(BooleanValue boolValue);
	public abstract void visit(Equals equals);
	public abstract void visit(Greater greater);
	public abstract void visit(GreaterEquals greaterEquals);
	public abstract void visit(Less less);
	public abstract void visit(LessEquals lessEquals);
}
