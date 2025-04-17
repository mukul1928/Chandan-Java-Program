package class_33_Polymorphism_Encapsulation;

class Sensititive_Info {
	private String un = "studentinfo@gmail.com";
	private String pwd = "test@1234";
	private int age = 13;
	private int otp = 12324;

	public String getUn() {
		return un;
	}

	public void setUn(String un) {
		this.un = un;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getOtp() {
		return otp;
	}

	public void setOtp(int otp) {
		this.otp = otp;
	}

}

public class Encapsulation_New {

	public static void main(String[] args) {
		Sensititive_Info s1 = new Sensititive_Info();
		s1.setUn("mukul@gmail.com");
		System.out.println(s1.getUn());
		s1.setPwd("hunk@143loveyou");
		System.out.println(s1.getPwd());
		s1.setAge(25);
		System.out.println(s1.getAge());
		s1.setOtp(643454);
		System.out.println(s1.getOtp());
	}

}
