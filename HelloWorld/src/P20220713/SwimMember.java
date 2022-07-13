package P20220713;

public class SwimMember extends Member {
	
	private String swname;
	// 수영등급(A,B,C,D)
	private String swclass;
	// 정보출력시 => 강사이름: 홍길동, 등급: A 
	
	public SwimMember(int memberId, String memberName, String phone, String swname, String swclass) {
		super(memberId, memberName, phone);
		this.swname = swname;
		this.swclass = swclass;
		
		
		
	}

	@Override
	public String toString() {
		
		return super.toString() + ", 축구코치 : " + swname + ", 락커룸: " + swclass;
	}

	public String getSwname() {
		return swname;
	}

	public void setSwname(String swname) {
		this.swname = swname;
	}

	public String getSwclass() {
		return swclass;
	}

	public void setSwclass(String swclass) {
		this.swclass = swclass;
	}
	
	}
	

