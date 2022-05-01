package examples.visitor;

public class Var{
	char name;
	double value;
	Var nextVar;
	
	public Var(char name, double value, Var nextVar) {
		this.name = name;
		this.value = value;
		this.nextVar = nextVar;
	}
}
