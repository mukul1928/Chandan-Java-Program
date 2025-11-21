package assignments;

interface one {
	void add();

	void substract();
}

abstract class Abc implements one {
	void sub() {
		System.out.println("sub in Abc");
	}

	static void mul() {
		System.out.println("mul in Abc");
	}

	abstract void div();

	abstract void mod();
}

abstract class def extends Abc {
	abstract void add1();

	abstract void sub1();
}

public class MultipleLevel_Inheritance extends def {
	static void multiply() {
		System.out.println("multiply in multiplelevelinheritance");
	}

	void division() {
		System.out.println("division in multiplelevelinheritance");
	}

	public static void main(String[] args) {
		mul();
		multiply();
		MultipleLevel_Inheritance i = new MultipleLevel_Inheritance();
		i.sub();
		i.add();
		i.add1();
		i.div();
		i.division();
		i.mod();
		i.sub1();
		i.substract();

	}

	public void add() {
		System.out.println("add in Interface");
	}

	public void substract() {
		System.out.println("substract in Interface");
	}

	void add1() {
		System.out.println("add1 in defclass");
	}

	void sub1() {
		System.out.println("sub1 in defclass");
	}

	void div() {
		System.out.println("div in abstract class Abc");
	}

	void mod() {
		System.out.println("mod in abstract class Abc");
	}
}
