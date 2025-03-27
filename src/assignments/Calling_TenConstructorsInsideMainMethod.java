package assignments;

public class Calling_TenConstructorsInsideMainMethod {

	Calling_TenConstructorsInsideMainMethod() {
		System.out.println("one");
	}

	Calling_TenConstructorsInsideMainMethod(int a) {
		System.out.println("first 1");
	}

	Calling_TenConstructorsInsideMainMethod(double b) {
		System.out.println("second 2");
	}

	Calling_TenConstructorsInsideMainMethod(char c) {
		System.out.println("third 3");
	}

	Calling_TenConstructorsInsideMainMethod(long d) {
		System.out.println("fourth 4");
	}

	Calling_TenConstructorsInsideMainMethod(String e) {
		System.out.println("fifth 5");
	}

	Calling_TenConstructorsInsideMainMethod(float f) {
		System.out.println("sixth 6");
	}

	Calling_TenConstructorsInsideMainMethod(byte g) {
		System.out.println("seventh 7");
	}

	Calling_TenConstructorsInsideMainMethod(boolean h) {
		System.out.println("eight 8");
	}

	Calling_TenConstructorsInsideMainMethod(short i) {
		System.out.println("nineth 9");
	}

	Calling_TenConstructorsInsideMainMethod(String chandu, char c) {
		System.out.println("tenth 10");
	}

	public static void main(String[] args) {
		Calling_TenConstructorsInsideMainMethod c = new Calling_TenConstructorsInsideMainMethod();
		new Calling_TenConstructorsInsideMainMethod(10);
		new Calling_TenConstructorsInsideMainMethod(100000.19);
		new Calling_TenConstructorsInsideMainMethod('M');
		new Calling_TenConstructorsInsideMainMethod(109090909);
		new Calling_TenConstructorsInsideMainMethod("Chandan Pandey");
		new Calling_TenConstructorsInsideMainMethod(16.12345f);
		new Calling_TenConstructorsInsideMainMethod(127);
		new Calling_TenConstructorsInsideMainMethod(false);
		new Calling_TenConstructorsInsideMainMethod(-32768);
		new Calling_TenConstructorsInsideMainMethod("Mukul", 'C');
	}

}
