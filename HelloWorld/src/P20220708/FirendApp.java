package P20220708;

import java.util.Scanner;

/*
 * 등록, 조회, 목록
 */
public class FirendApp {
	// 생성자 기본생성자 사용.

	Friend[] Friends = new Friend[10];
	int friendNum;
	Scanner scn = new Scanner(System.in);

	public void start() {
		while (true) {
			int selectNo= 0;
			System.out.println("1.등록 2.조회 3.목록 9.종료");
			System.out.println("선택 >");
			try {
				 selectNo = Integer.parseInt(scn.nextLine());
			} catch (Exception e) {
				System.out.println("1,2,3 번중에 선택하세요");
			}

//			timerShow("1.등록 2.조회 3.목록 9.종료");


			if (selectNo == 1) {
				add();

			} else if (selectNo == 2) {
				search();

			} else if (selectNo == 3) {
				list();

			} else if (selectNo == 9) {
 			System.out.println("프로그램 종료 합니다.");
//				timerShow("프로그램을 종료합니다.");
				break;
			}
		}
		System.out.println("프로그램 종료.");
//		timerShow("프로그램 종료.");
	}// end of start()

	private void add() {

		System.out.println("1.학교 2.회사 3.친구");
//		timerShow("1.학교 2.회사 3.친구 ");
		System.out.print("선택> ");
//		timerShow("선택>");
		int choice = 0;
		
		try { 
			choice = Integer.parseInt(scn.nextLine());
		} catch(Exception e) {
			System.out.println("숫자를 입력하세요");
//			timerShow("숫자를 입력하세요");
		}
	
		System.out.println("이름: ");
		String name = scn.nextLine();
		System.out.println("연락처: ");
		String phone = scn.nextLine();

		if (choice == 1) {
			System.out.println("학교이름: ");
			String univ = scn.nextLine();
			System.out.println("전공> ");
			String major = scn.nextLine();

			Friends[friendNum++] = new UnivFriend(name, phone, univ, major);

		} else if (choice == 2) {
			System.out.println("회사이름");
			String company = scn.nextLine();
			System.out.println("부서> ");
			String departmnt = scn.nextLine();

			Friends[friendNum++] = new ComFriend(name, phone, company, departmnt);
		} else if (choice == 3) {
			Friends[friendNum++] = new Friend(name, phone);
		}

	}

	private void search() {
		// 친구이름 입력 => 친구상세정보: showInfo()
		System.out.println("검색할 이름을 입력: ");
		String search = scn.nextLine();
		for (int i = 0; i < friendNum; i++) {
			if (search.equals(Friends[i].getName())) {

				Friends[i].showInfo();

			} else if (i == friendNum - 1) {
				System.out.println("잘못입력하였습니다.");
			}

		}
	}

	private void list() {
		for (int i = 0; i < friendNum++; i++) {
			System.out.println(Friends[i].toString());
			break;
		}

	}

//	private void timerShow(String msg) {
//		String[] message = msg.split("");
//		for (int i = 0; i < message.length; i++) {
//			System.out.print("message[i");
//			
//			try {
//				Thread.sleep(10);
//				
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//		System.out.println();
//		
//								
//}
}