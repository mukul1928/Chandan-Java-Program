package assignments;

interface one {
	void add();

	void substract();

}

abstract class Abc implements one {
	void sub() {
		System.out.println();
	}

	static void mul() {

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

	}

	void division() {

	}

	public static void main(String[] args) {

	}

	public void add() {

	}

	public void substract() {

	}

	void add1() {

	}

	void sub1() {

	}

	void div() {

	}

	void mod() {

	}
}
