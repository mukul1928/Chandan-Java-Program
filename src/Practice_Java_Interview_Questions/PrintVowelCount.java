package Practice_Java_Interview_Questions;

public class PrintVowelCount {
	public static void main(String[] args) {
		String s = "welcome to java class today";
		char[] ch = s.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
					|| c == 'U') {
				count++;
			}
		}
		System.out.println(count);
	}
}
