package class_15_constructors_calling;

class Grand_Parent {
	void add() {
		System.out.println("add 2 no.s");
	}

	void sub() {
		System.out.println("sub 2 no.s");
	}
}

class Parent_Class extends Grand_Parent {
	void mul() {
		System.out.println("mul 2 no.s");
	}

	void div() {
		System.out.println("div 2 no.s");
	}
}

public class Class15_Multi_Level_Inheritance_Child extends Parent_Class {
	void mod() {
		System.out.println("mod of 2 no.s");
	}

	public static void main(String[] args) {
		Class15_Multi_Level_Inheritance_Child i1 = new Class15_Multi_Level_Inheritance_Child();
		i1.add();
		i1.sub();
		i1.mul();
		i1.div();
		i1.mod();
	}
}
