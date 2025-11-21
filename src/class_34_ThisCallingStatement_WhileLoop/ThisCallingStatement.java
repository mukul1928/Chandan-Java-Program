package class_34_ThisCallingStatement_WhileLoop;

public class ThisCallingStatement {
	ThisCallingStatement() {
		this(100);
		System.out.println("constructor 1");
	}

	ThisCallingStatement(int a) {
		this(23.42, 43);
		System.out.println("constructor 2");
	}

	ThisCallingStatement(double a, int b) {
		this("chandan");
		System.out.println("constructor 3");
	}

	ThisCallingStatement(String s) {
		this('M');
		System.out.println("constructor 4");
	}

	ThisCallingStatement(char c) {

		System.out.println("constructor 5");
	}

	public static void main(String[] args) {
		ThisCallingStatement t = new ThisCallingStatement();

	}

}
