package basicsofjava;

public class Arithmetic_Operators {
	static void addition() {
		int a = 100;// 1st variable
		int b = 200;// 2nd variable
		int sum = a + b;// addition
		System.out.println(sum);
	}

	static void substraction() {
		int a = 190;
		int b = 143;
		int substract = a - b;
		System.out.println(substract);
	}

	static void multiply() {
		int a = 322;
		int b = 342;
		int multiply = a * b;
		System.out.println(multiply);
	}

	static void division() {
		double a = 54324;
		double b = 224;
		double division = a / b;
		System.out.println(division);
	}

	static void modulas() {
		double a = 4590;
		double b = 4750;
		double modulas = a % b;
		System.out.println(modulas);
	}

	public static void main(String[] args) {
		addition();
		substraction();
		multiply();
		division();
		modulas();
	}

}
