package class_18_Interface;

interface one {
	void add();

	void subtract();
}

interface Two extends one {
	void add1();

	void add2();
}

public class Child_Class implements Two {
	void circle() {
		System.out.println("circle ");
	}

	static void rectangle() {
		System.out.println("rectangle ");
	}

	public static void main(String[] args) {

	}

	public void add() {
		System.out.println("add");
	}

	public void subtract() {
		System.out.println("subtract");
	}

	public void add1() {
		System.out.println("add_1");
	}

	public void add2() {
		System.out.println("add_2");
	}
}
