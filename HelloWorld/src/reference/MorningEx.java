package reference;

import java.util.Scanner;

public class MorningEx {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0; // 학생수
		int[] scores = null; // 참조변수
		int max = 0;
		double hi = 0;
		Scanner scn = new Scanner(System.in);

		while (run) {

			System.out.println("-------------------------------------------------------");
			System.out.println("\n 1. 학생수 | 2. 점수 입력 | 3. 점수 리스트 | 4. 분석 | 5. 종료");
			System.out.println("-------------------------------------------------------");
			System.out.println("선택 >> ");

			int selectNo = Integer.parseInt(scn.nextLine()); // nextInt() => int  //studentNum; scores.length;

			if (selectNo == 1) {
				System.out.print(" 학생 수 입력 >> ");
				studentNum = Integer.parseInt(scn.nextLine());
				scores = new int[studentNum];
				System.out.println("정상적으로 처리되었습니다.");

			} else if (selectNo == 2) {
				for (int i = 0; i < studentNum; i++) {
					System.out.print(" scores[" + i + "]> ");
					scores[i] = Integer.parseInt(scn.nextLine());
					
				}

			} else if (selectNo == 3) {
				for (int i = 0; i < studentNum; i++) {
					System.out.print(" scores [" + i + "]> " + scores[i] + "\n");
				}

			} else if (selectNo == 4) {
				for (int i = 0; i < studentNum; i++) {
					if (max < scores[i]) {
						max = scores[i];
					}

				}
				System.out.print("최고 점수는 " + max);
				for (int i = 0; i < studentNum; i++) {
					hi += scores[i];
					
				} System.out.println("평균 점수는" +  hi/ studentNum);
					
			} else if (selectNo == 5) {
				System.out.println(" 프로그램을 종료 합니다. >> ");
				run = false;

			}
		}
		System.out.println("프로그램 종료");
		
	}

}
