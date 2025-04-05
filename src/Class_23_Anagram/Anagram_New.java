package Class_23_Anagram;

import java.util.Arrays;

public class Anagram_New {
	public static void main(String[] args) {
		String name1 = "state";
		String name2 = "taste";
		if (name1.length() != name2.length())

		{
			System.out.println("They are anagrams");
		} else {
			char[] n1 = name1.toCharArray();
			char[] n2 = name2.toCharArray();
			Arrays.sort(n1);
			Arrays.sort(n2);
			// System.out.println(Arrays.toString(n1));//not required to print in front of
			// the interviewer
			// System.out.println(Arrays.toString(n2));//not required to print in front of
			// the interviewer

			boolean answer = Arrays.equals(n1, n2);
			System.out.println(answer);

			if (answer == true) {
				System.out.println("The given string is anagram");
			} else {
				System.out.println("They are not anagrams");
			}
		}
	}

}
