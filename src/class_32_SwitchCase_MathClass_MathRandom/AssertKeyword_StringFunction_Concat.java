package class_32_SwitchCase_MathClass_MathRandom;

public class AssertKeyword_StringFunction_Concat {

	public static void main(String[] args) {

		String name = "I am Student";
		System.out.println(name.length());

		assert name.length() > 10 : "Seems like the given String length is lesser than 21";

		for (int i = 0; i < name.length(); i++) {
			System.out.println(name.concat(" of batch AB 39"));
		}

	}

}
