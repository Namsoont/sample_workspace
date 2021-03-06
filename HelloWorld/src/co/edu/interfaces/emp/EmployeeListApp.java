package co.edu.interfaces.emp;

import java.util.Scanner;

public class EmployeeListApp {
	public static void main(String[] args) {

		EmployeeArrayList app = EmployeeArrayList.getInstanc();

		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("1.사원수(초기화) 2.사원입력 3.사원리스트 4.상세검색 9.종료");
			System.out.println("선택 > ");

			int selectNo = scn.nextInt();
			if (selectNo == 1) {
				app.init();
				
			} else if (selectNo == 2) {

				app.input();

			} else if (selectNo == 3) {
				app.printList();

			} else if (selectNo == 4) {
				System.out.print("검색할 사번을 입력: ");
				int empId = scn.nextInt();
				Employee emp = app.search(empId);
				if (empId == emp.getEmployeeId()) {
					System.out.println("입력 하신 사번은:"+ emp.getDetailInfo());
				}
				else {
					System.out.println("해당 정보는 없는 사번입니다.");
				}
				
			} else if (selectNo == 9) {
				System.out.println("프로그램 종료.");
				break;
			}
		}
		
	}
}
