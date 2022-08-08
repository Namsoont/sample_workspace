package com.yedam.coffee;

import java.util.List;
import java.util.Scanner;

public class CoffeeService {

	Scanner scn = new Scanner(System.in);

	public void getCoffee() {
		List<Coffee> list = CoffeeDAO.getInstance().getCoffee();
		for (Coffee coffee : list) {
			System.out.println("=============================");
			System.out.println("메뉴 : " + coffee.getcoffeeMenu());
			System.out.println("가격 : " + coffee.getCoffeePrice());
			System.out.println("=============================");
		}
	}

	public void getDetailCoffee() {
		List<Coffee> list = CoffeeDAO.getInstance().getDetailCoffee();
		for (Coffee coffee : list) {
			System.out.println("*****************************");
			System.out.println("메뉴 입력> " + coffee.getcoffeeMenu() + " *");
			System.out.println("가격 입력> " + coffee.getCoffeePrice() + " *");
			System.out.println("설명 입력> " + coffee.getCoffeeExplain() + " *");
			System.out.println("*****************************");
		}
	}

	public void insertCoffee() {
		Coffee coffee = new Coffee();

		System.out.println("메뉴 입력> ");
		String coffeeMenu = scn.nextLine();
		System.out.println("가격 입력> ");
		int coffeePrice = Integer.parseInt(scn.nextLine());
		System.out.println("설명 입력> ");
		String coffeeExplain = scn.nextLine();

		coffee.setcoffeeMenu(coffeeMenu);
		coffee.setCoffeePrice(coffeePrice);
		coffee.setCoffeeExplain(coffeeExplain);

		int result = CoffeeDAO.getInstance().insertCoffee(coffee);

		if (result == 1) {
			System.out.println("등록 성공");
		} else {
			System.out.println("등록 실패");
		}
	}

	public void deleteCoffee() {
		System.out.println("메뉴 입력>");
		String coffeeMenu = scn.nextLine();

		int result = CoffeeDAO.getInstance().deleteCoffee(coffeeMenu);
		if (result == 1) {
			System.out.println("삭제 완료");
		} else {
			System.out.println("삭제 실패");
		}
	}

	// 매출
	public void calCoffee() {
		List<Coffee> list = CoffeeDAO.getInstance().getDetailCoffee();
		int sum = 0;
		for (Coffee coffee : list) {
			System.out.println("#######################");
			System.out.println("메뉴 : " + coffee.getcoffeeMenu());
			System.out.println("판매갯수 : " + coffee.getcoffeeSales());
			System.out.println("판매금액 : " + coffee.getCoffeePrice() * coffee.getcoffeeSales());
			System.out.println("#######################");
			sum += coffee.getCoffeePrice() * coffee.getcoffeeSales();
		}
		System.out.println("총 매출액 : " + sum + "원");
	}

	public void salesCoffee() {
		
		

		System.out.println("메뉴 입력> ");
		String coffeeMenu = scn.nextLine();
		int result = CoffeeDAO.getInstance().getSalesCoffee(coffeeMenu);



		
		if (result == 1) {
			System.out.println("판매 완료");
		} else {
			System.out.println("판매 실패");
		}
	}

}
