package P20220711;

import java.util.Scanner;

import P20220708.MainExample;

public class MoringEx {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] fruits = {"딸기", "바나나", "오렌지", "파인애플" };
		
		boolean isExist = false;
		System.out.println("값을 일력하세요>");
		String fruit = scn.nextLine();
		for(int i = 0; i < fruits.length; i++) {
			if(fruits[i].equals(fruit)) {
				System.out.println((i+1) + "번쨰 위치.");
				isExist = true;
				break;
			}
			
		}
		if(!isExist) {
			System.out.println("찾는 과일이 없습니다.");
		}
		
		
		}
	}

