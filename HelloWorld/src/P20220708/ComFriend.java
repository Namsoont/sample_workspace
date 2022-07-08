package P20220708;

public class ComFriend extends Friend {
	private String company;
	private String departmnt;
	public ComFriend(String name, String phone, String company, String departmnt) {
		super(name, phone);
		this.company = company;
		this.departmnt = departmnt;
	}
	@Override
	public String toString() {
		return "회사친구: [이름: " + getName() + ", 연락처: " + getPhone() + ", 회사: " + company + ", 부서: "
				+ departmnt + "]";
	
  }
	@Override
	public void showInfo() {
		System.out.printf("회사: [직원=" + getName() + ", phone=" + getPhone() +", 회사: " + company + ", 부서: "
				+ departmnt + "]");
		
	}
}
