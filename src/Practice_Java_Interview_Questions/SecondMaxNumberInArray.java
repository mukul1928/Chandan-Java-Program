package Practice_Java_Interview_Questions;

public class SecondMaxNumberInArray {

	public static void main(String[] args) {

		int[] ar = new int[5];
		ar[0] = 100;
		ar[1] = 200;
		ar[2] = 500;
		ar[3] = 400;
		ar[4] = 800;

		for (int i = 0; i < ar.length; i++) {

			for (int j = i; j < ar.length; j++) {
				if (ar[i] > ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		System.out.println(ar[1]);
	}

}
