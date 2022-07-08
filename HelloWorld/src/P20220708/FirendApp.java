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

			System.out.println("1.등록 2.조회 3.목록 9.종료");
			System.out.println("선택 >");

			int selectNo = Integer.parseInt(scn.nextLine());
			if (selectNo == 1) {
				add();

			} else if (selectNo == 2) {
				search();

			} else if (selectNo == 3) {
				list();

			} else if (selectNo == 9) {
				System.out.println("프로그램 종료 합니다.");
				break;
			}
		}
		System.out.println("프로그램 종료.");
	}// end of start()

	private void add() {

		System.out.println("1.학교 2.회사 3.친구");
		System.out.print("선택> ");
		int choice = Integer.parseInt(scn.nextLine());

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
}