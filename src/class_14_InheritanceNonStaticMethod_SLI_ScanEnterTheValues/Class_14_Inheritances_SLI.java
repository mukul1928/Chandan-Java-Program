package class_14_InheritanceNonStaticMethod_SLI_ScanEnterTheValues;

<<<<<<< HEAD
 	class Parent_Class {
=======
class Parent_Class {
>>>>>>> d0a908e75bd5e2697b5d1ef593cd7e8a01b29d6f
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
<<<<<<< HEAD
		multiplication(23*22, 20);
=======
		multiplication(34, 65);
>>>>>>> d0a908e75bd5e2697b5d1ef593cd7e8a01b29d6f

	}

}
