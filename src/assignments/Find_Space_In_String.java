package assignments;

public class Find_Space_In_String {

	public static void main(String[] args) {
		String name = "Chandan Pandey";

		char c1[] = name.toCharArray();

		for (int i = 0; i < name.length(); i++) {
			boolean answer = Character.isSpaceChar(c1[i]);

			if (answer == true) {
				System.out.println("The given String has a space in it");
			}
		}

	}
}
