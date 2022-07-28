package co.edu;

import java.util.Scanner;

public class yedam13 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		 boolean run = true;
	      int a = 0;
	      String[] b = null;
	      int[] price = null;
	    

	      while (run) {
	         System.out.println("--------------------------------------------");
	         System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
	         System.out.println("--------------------------------------------");
	         System.out.print("선택 : ");
	         int selectNo = Integer.parseInt(scn.nextLine());

	         switch (selectNo) {
	         case 1:
	            
	            System.out.print("상품 수 :");
	            a = Integer.parseInt(scn.nextLine());
	            b = new String[a];
	            price = new int[a];
	            break;
	         case 2:
	            
	            System.out.println("상품 및 가격입력 :");
	            for (int i = 0; i < a; i++) {
	               b[i] = scn.nextLine();
	               price[i] = Integer.parseInt(scn.nextLine());
	            }
	            break;
	         case 3:
	            
	            System.out.println("제품별 가격>>");
	            for (int i = 0; i < b.length; i++) {
	               System.out.println("[" + i + "] > "+"상품명 " + price[i] +" : "+"가격 "+ price[i]);
	            }
	            break;
	         case 4:
	            
	            int max = price[0];
	            int sum = 0;
	            String maxproduct = " ";
	            System.out.println(" 분석 : ");
	            for (int i = 0; i < price.length; i++) {
	               if (price[i] > max) {
	                  max = price[i];
	                  maxproduct = b[i];
	               }
	            }
	            System.out.println("제품명 : " + maxproduct);

	            for (int i = 0; i < price.length; i++) {
	               if(price[i] != max) {
	                  sum += price[i];
	               }
	            }
	            System.out.println("최고가격을 제외한 제품가격 총합 : " + sum);
	            break;

	         case 5:
	            
	            System.out.println("프로그램을 종료.");
	            run = false;
	            break;
	         }
	      }
	   }
	}