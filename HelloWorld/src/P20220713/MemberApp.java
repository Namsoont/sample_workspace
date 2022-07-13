package P20220713;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberApp implements MemberService {

	List<Member> members = new ArrayList<Member>();
	Scanner scn = new Scanner(System.in);
	public void execute() {
		// 메뉴: 1.등록 2.수정 3.전체리스트 9.종료
		// 1)도서반=>기본정보+도서반장,강의실이름
		// 축구반=>기본정보+코치이름,락커룸이름
		// 수영반=>기본정보+강사이름,수영등급
		
		
		
		while (true) {
			System.out.println("1.등록 2.수정 3.전체리스트 9.종료");
			System.out.println("메뉴 선택:");
			int selectNo = Integer.parseInt(scn.nextLine());
			
			if (selectNo == 1) {
				System.out.println("1. book 2. soccer 3. swim");
				System.out.println("선택하세요 >");
				selectNo = Integer.parseInt(scn.nextLine());
				if (selectNo == 1) {
				System.out.print("회원아이디: ");
				int Id = Integer.parseInt(scn.nextLine());
				System.out.print("회원 이름: ");
				String Name = scn.nextLine();
				System.out.print("회원 번호 : ");
				String Phone = scn.nextLine();
				System.out.print("반장 : ");
				String topname = scn.nextLine();
				System.out.print("강의실 : ");
				String psname = scn.nextLine();
				Member member = new BookMember(Id, Name, Phone, topname, psname);
				addMember(member);
				} else if(selectNo == 2) {
					System.out.print("회원아이디: ");
					int Id = Integer.parseInt(scn.nextLine());
					System.out.print("회원 이름: ");
					String Name = scn.nextLine();
					System.out.print("회원 번호 : ");
					String Phone = scn.nextLine();
					System.out.print("코치 : ");
					String topname = scn.nextLine();
					System.out.print("락커룸 : ");
					String psname = scn.nextLine();
					Member member = new SoccerMember(Id, Name, Phone, topname, psname);
					addMember(member);
				} else if(selectNo == 3) {
					System.out.print("회원아이디: ");
					int Id = Integer.parseInt(scn.nextLine());
					System.out.print("회원 이름: ");
					String Name = scn.nextLine();
					System.out.print("회원 번호 : ");
					String Phone = scn.nextLine();
					System.out.print("강사 : ");
					String topname = scn.nextLine();
					System.out.print("등급 : ");
					String psname = scn.nextLine();
					Member member = new SwimMember(Id, Name, Phone, topname, psname);
					addMember(member);
				} 
						
			} else if (selectNo == 2) {
				System.out.println("수정 하실 번호 : ");
				int search = Integer.parseInt(scn.nextLine());
				Member member = new Member();
				for (Member mem : members) {
					if(mem.getMemberId() == search) {
						member = mem;
						modifyMember(member);
					}
				}
				
			} else if (selectNo == 3) {
				for (int i = 0; i < members.size(); i++) {
					System.out.println(members.get(i).toString());
				}
			} else if (selectNo == 9) {
				System.out.println("프로그램을 종료 합니다...");
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

	@Override
	public void addMember(Member member) { //등록
		members.add(member);
	}

	@Override
	public void modifyMember(Member member) { //수정
		System.out.println("수정할 전화번호: ");
		String phone = scn.nextLine();
		member.setPhone(phone);
		
//		for (int i = 0; i < members.size(); i++) {
//			if (member.getMemberId() == members.get(i).getMemberId()) {
//				members.get(i).setPhone(member.getPhone());
//			}
//		}
//		
		
		
	}

	@Override
	public List<Member> memberList() { //목록
		
		return members;
	}
}
