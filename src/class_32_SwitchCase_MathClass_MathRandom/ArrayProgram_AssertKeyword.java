package class_32_SwitchCase_MathClass_MathRandom;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayProgram_AssertKeyword {
	public static void main(String[] args) {
		int age[] = new int[3];
		age[0] = 12;
		age[1] = 14;
		age[2] = 16;

		int ageofparents[] = new int[3];
		ageofparents[0] = 74;
		ageofparents[1] = 96;
		ageofparents[2] = 85;

		assert Array.getLength(age) > 10;

		boolean answer = Arrays.equals(age, ageofparents);// equals we are using for what values are present in the two
															// array for checking those values we need to use equals

		System.out.println(answer);
	}

}
