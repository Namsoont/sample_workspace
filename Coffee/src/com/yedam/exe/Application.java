package com.yedam.exe;

import java.util.Scanner;

import com.yedam.coffee.CoffeeService;

public class Application {
	
	Scanner scn = new Scanner(System.in);
	CoffeeService ps = new CoffeeService();
	
	public Application() {
		start();
	}
	
	private void start() {
		while (true) {
			System.out.println("1. 메뉴 조회 | 2. 메뉴 상세 조회 | 3. 메뉴 등록 | 4. 판매 | 5. 메뉴 삭제 | 6. 매출 | 7. 종료");
			int menuNo = Integer.parseInt(scn.nextLine());
			
			if(menuNo == 1) {
				ps.getCoffee();
			}else if (menuNo == 2) {
				ps.getDetailCoffee();
			}else if (menuNo == 3) {
				ps.insertCoffee();
			}else if (menuNo == 4) {
				ps.salesCoffee();
			}else if (menuNo == 5) {
				ps.deleteCoffee();
			}else if (menuNo == 6) {
				ps.calCoffee();
			}else if (menuNo == 7) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}
