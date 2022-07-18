package P20220713;

import java.util.Scanner;

public class SoccerMember extends Member{
	Scanner scn = new Scanner(System.in);
	// 축구반의 코치이름.
	private String sconame;
	// 락커룸의 이름.(A, B, C, D)
	private String scoclass;
	// 정보출력시 => 코치이름: 홍길동, 락커룸: A 
	
	public SoccerMember(int memberId, String memberName, String phone, String sconame, String scoclass) {
		super(memberId, memberName, phone);
		this.sconame = sconame;
		this.scoclass = scoclass;
	}

	@Override
	public String toString() {
		
		return super.toString() + ", 축구코치 : " + sconame + ", 락커룸: " + scoclass;
	}

	public String getSconame() {
		return sconame;
	}

	public void setSconame(String sconame) {
		this.sconame = sconame;
	}

	public String getScoclass() {
		return scoclass;
	}

	public void setScoclass(String scoclass) {
		this.scoclass = scoclass;
	}
	 
	
	
}
