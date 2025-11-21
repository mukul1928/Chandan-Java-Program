package class_18_Interface;

interface Sample {

	void add();// abstract methods

	void subtract();// abstract methods
}

public class Interface_Class implements Sample {

	void areaofrectangle() {
		System.out.println("area of rectangle");

	}

	static void areaofcircle() {
		System.out.println("area of circle");
	}

	public static void main(String[] args) {

	}

	public void add() {

		System.out.println("The real logic");
	}

	public void subtract() {

		System.out.println("The real logic can be here");
	}
}
