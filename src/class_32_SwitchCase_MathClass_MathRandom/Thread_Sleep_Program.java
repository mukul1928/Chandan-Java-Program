package class_32_SwitchCase_MathClass_MathRandom;

public class Thread_Sleep_Program {

	public static void main(String[] args) throws InterruptedException {

		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}

}
