package co.edu01;
/*
 * 이름, 연락처, email, 생일, 키, 몸무게: 
 */
public class Friend {
	
	//생성자: 기본생성자를 생성.
	// 필드. 명명규칙(소문자, camelcase, 영문, )
	//private Sting name; (private)< - 외부접근제한(숨김)
	String name;
	String phone;
	String email;
	double ke;
	double a;
	int b;
	
	public Friend() {
		System.out.println();
	}
	
	// 메소드.
		// 이름, 연락처를 보여주는 showInfo()
	public void showInfo()	{
		System.out.println("이름: " + name + "\n" + "연락처 : " + phone + "\n" + "email: " + email + "\n" + "키: " + ke );
	}
//}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getKe() {
		return ke;
	}

	public void setKe(double ke) {
		this.ke = ke;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}


	

	public void setname(String name) {
		this.name = name;
	}
	public String getname() {
		return name;
	}
	public void setpone(String pone) {
		this.phone = phone;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public String getemail() {
		return email;
	}
	public String getPhoen() {
		return phone;
	}
	public void setb(int b) {
		if(b < 0 ) {
			System.out.println("잘못된 값이 입력 됐습니다.");
			this.b = 23;
		} else {
			this.b = b;
		
		}
	}
	
	public void seta(double a) {
		if(a < 0) {
			System.out.println("잘못된 값이 입력 됐습니다.");
			this.a = 83.3;
		} else {
			this.a = a;
}
	
	}
	}
	