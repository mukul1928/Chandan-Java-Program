package class_32_SwitchCase;

public class SwitchCase_Class {
	public static void main(String[] args) {

		switch (10) // if I have written 10 here and my cases are lesser than 10 for that reason we
					// can have
					// default(keyword) statement and this will execute then
		{
		case 1:
			System.out.println("Your logic 1 will be here");
			break; // It will break my execution after writing 1 in switch and then putting break
					// here
					// only my case 1 will execute
		case 2:
			System.out.println("Your logic 2 will be here");
			break;
		case 3:
			System.out.println("Your logic 3 will be here");
			break;
		case 4:
			System.out.println("Your logic 4 will be here");
			break;
		default:
			System.out.println("The selection you have made is wrong");

		}

	}

}
