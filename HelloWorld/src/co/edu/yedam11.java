package co.edu;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class yedam11 {
	public static void main(String[] args) {
		
		//주어진 배열을 이용하여 다음 내용을 구현하세요.
				int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };
				
				//문제1. 주어진 배열 중에서 값이 60인 곳의 인덱스를 출력해보자.
				for(int i = 0; i < arr1.length; i++) {
					if (arr1[i] == 60) {
						System.out.println(i);
					}	
					       
				}
				
				//문제2. 주어진 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력해보자.
				
				for(int i = 0; i < arr1.length; i++) {
					if(i == 4) {
						continue;
					}
					
					System.out.println("arr1[" + i + "]" + arr1[i]);
				}
				
				//문제3. 주어진 배열 안의 변경하고 싶은 값의 인덱스 번호를 입력받아, 그 값을 1000으로 변경해보자.
		  		//   입력) 인덱스: 3 ->   {10, 20, 30, 1000, 3, 60, -3}
				int choice = Integer.parseInt(JOptionPane.showInputDialog("바꾸고 싶은 배열의 인덱스 번호를 입력하세요."));
		        arr1[choice] = 1000;
		        
		        String msg = "";
		        for (int i = 0; i < arr1.length; i++) {
		            msg += arr1[i] + " ";
				
		        }
		        JOptionPane.showMessageDialog(null, msg);
				
		        //문제4. 주어진 배열의 요소에서 최대값과 최소값을 구해보자.
				int max = arr1[0];
				int min = arr1[0];
				for(int i = 0; i < arr1.length; i++) {
					if(max < arr1[i]) {
						max = arr1[i];
					
					} 
					if (min > arr1[i]) {
						min = arr1[i];
					}
						
					
				}
				System.out.println("최대값은: " + max);
				System.out.println("최소값은: " + min);
				
				//문제5. 별도의 배열을 선언하여 양의 정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력해보자.
				System.out.println("양의 정수 10개 입력 : ");
				Scanner scn = new Scanner(System.in);
				int[] a = new int[10];
				
				for(int i = 0; i < a.length; i++) {
					a[i] = scn.nextInt();
					
				}
				for(int i = 0; i < a.length; i++) {
					if(a[i] %3 == 0) {
						System.out.println(a[i] + " ");
					}
				}
				
	}
}
