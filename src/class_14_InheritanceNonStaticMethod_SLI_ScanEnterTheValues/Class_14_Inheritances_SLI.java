package class_14_InheritanceNonStaticMethod_SLI_ScanEnterTheValues;

 	class Parent_Class {
	static void multiplication(int a, int b) {
		System.out.println(a * b);
	}
}

public class Class_14_Inheritances_SLI extends Parent_Class {
	static void add(int a, int b) {
		System.out.println(a + b);
	}

	static void sub(int a, int b) {
		System.out.println(a - b);
	}

	public static void main(String[] args) {
		add(47, 42);
		sub(78, 24);
		multiplication(23*22, 20);

	}

}
