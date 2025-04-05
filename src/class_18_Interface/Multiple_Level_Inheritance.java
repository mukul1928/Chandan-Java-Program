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

	public void username() {

	}

	@Override
	public void password() {

	}

	@Override
	public void auth() {

	}

	@Override
	public void authentication() {

	}

}
