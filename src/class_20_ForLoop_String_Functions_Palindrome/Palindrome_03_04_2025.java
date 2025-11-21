package class_20_ForLoop_String_Functions_Palindrome;

public class Palindrome_03_04_2025 {
	public static void main(String[] args) {
		String name = "ChandanPandey";
		String reverse = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			char answer = name.charAt(i);
			reverse = reverse + answer;
		}
		System.out.println(reverse);
		boolean value = name.equals(reverse);
		System.out.println(value);

		if (value == true) {
			System.out.println("The given String is a Palindrome");
		} else {
			System.out.println("The given String is not a Palindrome");
		}
	}
}
