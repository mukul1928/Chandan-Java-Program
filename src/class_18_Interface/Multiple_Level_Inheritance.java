package class_18_Interface;

interface Parent1 {
	void auth();

	void authentication();
}

interface Parent2 {
	void username();

	void password();
}

public class Multiple_Level_Inheritance implements Parent1, Parent2 {

	public static void main(String[] args) {

		Multiple_Level_Inheritance m1 = new Multiple_Level_Inheritance();
		m1.auth();
		m1.authentication();
		m1.username();
		m1.password();

	}

	public void username() {
		System.out.println("mukulpandey89_Username");
	}

	public void password() {
		System.out.println("chandankikhushboo_143_password");
	}

	public void auth() {
		System.out.println("authority_given in auth");
	}

	public void authentication() {
		System.out.println("authentication required by user is given by the admin");
	}

}
