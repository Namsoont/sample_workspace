package co.edu;

import java.util.Scanner;

public class yedam8 {
	public static void main(String[] args) {
    //문제3) switch문을 이용하여 가위, 바위, 보 중 하나가 주어졌을 때 사용자 어떤 값을 가져야 이길 수 있는 지를 출력하도록
	// 구현하세요.
	// 예를 들어, 가위가 주어졌을 때 "이기기 위해선 바위를 내야합니다." 라고 출력하도록 하세요.
	// 한 단어를 입력받을 경우 Scanner객체의 next() 함수를 사용하면 됩니다.
		int user=0;
		int com=(int)(Math.random()*3); // 0,1,2
		Scanner scn = new Scanner(System.in);
		System.out.println("===가위바위보 게임을 시작합니다==");
		System.out.println("가위(0), 바위(1), 보(2) 입력 : ");
		user = scn.nextInt();
		
		
		switch (com) {
		case 0:
			switch(user)
			{
			case 0:
				System.out.println("컴퓨터 : 가위,  사용자 : 가위");
				System.out.println("비겼습니다.");
				System.out.println("이기기 위해 바위를 내야합니다.");
				break;
			case 1:
				System.out.println("컴퓨터 : 가위,  사용자 : 바위");
				System.out.println("사용자 Win!!");
				break;
			case 2:
				System.out.println("컴퓨터 : 가위,  사용자 : 보");
				System.out.println("컴퓨터 Win!!");
				break;
			}
			break;
        case 1:
        	switch(user)
			{
			case 0:
				System.out.println("컴퓨터 : 바위,  사용자 : 가위");
				System.out.println("컴퓨터 Win!!");
				break;
			case 1:
				System.out.println("컴퓨터 : 바위,  사용자 : 바위");
				System.out.println("비겼습니다.");
				System.out.println("이기기 위해 보를 내야합니다.");
				break;
			case 2:
				System.out.println("컴퓨터 : 바위,  사용자 : 보");
				System.out.println("사용자 Win!!");
				break;
			}
			break;	
        case 2:
        	switch(user)
			{
			case 0:
				System.out.println("컴퓨터 : 보,  사용자 : 가위");
				System.out.println("사용자 Win!!");
				break;
			case 1:
				System.out.println("컴퓨터 : 보,  사용자 : 바위");
				System.out.println("컴퓨터 Win!!");
				break;
			case 2:
				System.out.println("컴퓨터 : 보,  사용자 : 보");
				System.out.println("비겼습니다.");
				System.out.println("이기기 위해 가위를 내야합니다.");
				break;
			}
			break;	
		default:
			System.out.println("잘못된 숫자를 입력하였습니다.");
			break;
		}
		System.out.println("==가위바위보 게임을 종료합니다==");
        	}
	
	}

