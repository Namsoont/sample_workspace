package co.edu;

import java.util.Scanner;

public class yedam12 {
	public static void main(String[] args) {
		// 문제) 다음은 키보드로부터 학생수와 각 학생들의 점수를 입력받아서, 최고 점수 및 평균 점수를 구하는 프로그램입니다.
		//		 실행결과를 보고, 알맞게 작성해보세요.
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		double avg = 0;
		Scanner scn = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.println("선택> ");
			int selectNo = Integer.parseInt(scn.nextLine());
			
			switch(selectNo) {
			case 1:
				System.out.printf("학생수 입력 : ");
				studentNum = Integer.parseInt(scn.nextLine());
				scores = new int[studentNum];
				break;
				
			case 2:
				for(int i = 0; i <  studentNum; i++) {
				System.out.print(" scores[" + i + "]> ");
				scores[i] = Integer.parseInt(scn.nextLine());
				}break;
				
				case 3:
				for (int i = 0; i < studentNum; i++) {
				System.out.print(" scores [" + i + "]> " + scores[i] + "\n" );
				
				}break;
				case 4:
					int max = scores[0];
					for (int i = 0; i < studentNum; i++) {
						if(max < scores[i] ) {
							max = scores[i];
							
						}
						
					}System.out.println("최고 점수: " +  max );
					for (int i = 0; i < studentNum; i++) {
						avg += scores[i];
					} System.out.println("평균점수: " + avg/studentNum);
					break;
				case 5:
					System.out.println("프로그램 종료");
					run = false;
					break;
				}
			
			} 
		   
		} 
	} 


