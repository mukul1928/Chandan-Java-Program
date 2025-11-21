package class_31_Exceptional_Handling_With_Array;

public class Exceptional_Handling {

	public static void main(String[] args) {

		// Scanner s1 = new Scanner(System.in);
		// int a = s1.nextInt();

		int age[] = new int[3];
		age[0] = 12;
		age[1] = 15;
		age[2] = 50;
		try {
			age[3] = 5;
		} catch (ArrayIndexOutOfBoundsException a1) {
			System.out.println("exceptional is handled please continue..");// first this will execute
		}

		System.out.println("Chandan is a martial artist with black belt");// second this will execute
	}

}
