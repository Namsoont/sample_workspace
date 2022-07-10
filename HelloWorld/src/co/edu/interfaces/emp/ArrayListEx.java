package co.edu.interfaces.emp;

import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {
		
		//array 기본 문법
		Employee[] empAry = new Employee[10];
		empAry[0] = new Employee(); //추가
		empAry[0] = null;
		empAry[0] = new Employee(); // 변경
		System.out.println(empAry[0]);
		
		for (int i = 0; i < empAry.length; i++) {
			System.out.println("empAry{" + i + "]");
		}
		ArrayList<Employee> empList = new ArrayList<Employee>(); //배열생성자 선언.
		empList.add(new Employee()); //추가
//		empList.remove(0);		//삭제
		empList.set(0, new Employee()); // 변경: 0번쨰 위치에 바꿈
		empList.add(new Employee()); //추가
		empList.get(0);
		System.out.println(empList.get(0));
		
		for (int i = 0; i < empList.size(); i++) {  
			System.out.println("empList{" + i + "]");
		}
	
		
		
		
	}
}
