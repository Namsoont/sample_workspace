package com.bank.member;

import java.util.Scanner;

public class MemberService {
	
	public static Member memberInfo = null;
	Scanner scn = new Scanner(System.in);
	
	//로그인
	public void doLogin() {
		Member member = new Member();
		
		System.out.println("ID : ");
		
		String id = scn.nextLine();
		
		System.out.println("PW : ");
		
		String pw = scn.nextLine();
				
		// 1개 row
		// id/ pw... member안에 정보 다들어있음
		member = MemberManage.getInstance().loginInfo(id);
		
		if(member.getMemberPw().equals(pw)) {
			memberInfo = member;
		} else {
			System.out.println("로그인 실패");
		}
	}
	
	//로그아웃
	public void logout() {
		if(memberInfo != null)
		memberInfo = null;
	}
	//고객 등록
	public void registerCustomer() {
		Member member = new Member();
		
		System.out.println("고객 ID : ");
		String id = scn.nextLine();
		System.out.println("고객 PW : ");
		String pw = scn.nextLine();
		System.out.println("고객 이름 : ");
		String name = scn.nextLine();
		
		member.setMemberId(id);
		member.setMemberPw(pw);
		member.setMemberName(name);
		member.setRole("0");
		
		int result = MemberManage.getInstance().registCustomer(member);
		
		if(result == 1) {
			System.out.println("고객 정보 등록 완료");
		} else {
			System.out.println("고객 정보 등록 실패");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
