package class_37_MainMethodOverLoading;

public class MainMethodOverloading {

	public static void main(String[] args) {
			main();
			main(12,43);
	}

	public static void main() {

		System.out.println("This is main method without arguments");
	}

	public static void main(int a, int b) {

		System.out.println("This is my main method with arguments");
	}

}
