package P20220708;

public class Friend {
	private String name;
	private String phone;
	
	public Friend(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

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

	@Override
	public String toString() {
		return "Friend [친구=" + name + ", phone=" + phone + "]";
	}
	public void showInfo() {
		System.out.println("친구 [학교친구=" + name + ", phone=" + phone + "]");
		
	}
	
	
}
