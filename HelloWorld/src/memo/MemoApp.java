package memo;

import java.util.Scanner;

public class MemoApp {
	public static void main(String[] args) {
		
		MemoManager memo = MemoManager.getInstance();
		
		Scanner scn = new Scanner(System.in);
		int selectNo;
		boolean run = true;
		
		while (run) {
			System.out.println("1.등록 2.조회 3.삭제 4.종료");
			System.out.println("메뉴 선택: ");
			selectNo = Integer.parseInt(scn.nextLine());
			
			switch(selectNo) {
			case 1:
				memo.inputData(); break;
			case 2:
				memo.search(); break;
			case 3:
				memo.deletData(); break;
			case 4:
				memo.storeToFile();
				run = false;
			}
			
		}
		System.out.println("프로그램 종료........");
	}
}

//int selectNo = scn.nextInt();
//
//if (selectNo == 1) {
//	memo.inputData();
//	
//} else if (selectNo == 2) {
//	memo.search();
//	
//
//} else if (selectNo == 3) {
//	System.out.println("삭제: ");
//	memo.deletData();
//
//}  else if (selectNo == 4) {
//	memo.storeToFile();
//	System.out.println("프로그램 종료");
//	break;
//}
//
//
//