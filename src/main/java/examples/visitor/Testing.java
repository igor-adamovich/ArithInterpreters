package examples.visitor;

public class Testing {

	public static void main(String[] args) {
		test();
	}
	static void test() {
		double eps = 0.01;
		
		double origRes =  examples.visitor.ArithExample.sqrt(8, eps);
		System.out.println("Result of original program = " + origRes);
	
		double specRes =  examples.visitor.spec.ArithExample.sqrt(8, eps);
		System.out.println("Specialized result =" + specRes);
		
		System.out.println("Results are equal = " + (origRes == specRes));
	}
}
