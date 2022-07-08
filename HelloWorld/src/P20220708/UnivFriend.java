package P20220708;
/*
 * 학교친구
 */
public class UnivFriend extends Friend {
	private String univ;
	private String major;
	
	public UnivFriend(String name, String phone, String univ, String major) {
		super(name, phone);
		this.univ =univ;
		this.major = major;
	}

	@Override
	public String toString() {
		return "학교친구: [이름: " + getName() + ", 연락처: " + getPhone() + ", 학교: " + univ + ", 전공: "
				+ major + "]";
	}
	
	@Override
	public void showInfo() {
		System.out.println("company [name=" + getName() + ", phone=" + getPhone() +"  학교: " + univ + ", 전공: "
				+ major + "]");
		
	}
	
	
}
