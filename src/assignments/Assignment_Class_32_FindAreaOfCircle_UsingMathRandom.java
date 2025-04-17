package assignments;

public class Assignment_Class_32_FindAreaOfCircle_UsingMathRandom {
	public static void main(String[] args) {

		double pi = Math.PI;
		for (int i = 1; i < 11; i++) {
			double r = Math.random();
			System.out.println(pi * r * r);
		}

	}
}
