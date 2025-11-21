package class_33_Polymorphism_Encapsulation;

class Senstitive_Info {
	private String un = "customer@info.com"; // un is global variable

	public void setUn(String un) // un is local variable
	{
		this.un = un;
	}

	public String getUn() {
		return un;
	}

	private int age = 18;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		Senstitive_Info s1 = new Senstitive_Info();
		s1.setUn("chandanpandey1928@gmail.com");
		System.out.println(s1.getUn());

		s1.setAge(20);
		System.out.println(s1.getAge());
	}

}
