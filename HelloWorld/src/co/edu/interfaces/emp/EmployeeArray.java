package co.edu.interfaces.emp;

import java.util.Scanner;

/*
 *  배열기반 기능 구현(implement).
 *  list 배열 !!!! 햇갈리지 말기
 */
public class EmployeeArray implements EmployeeList {
	// 싱글톤 기반.
	  private static EmployeeArray instance = new EmployeeArray();
	   private EmployeeArray() {}
	   public static EmployeeArray getInstance() {
	      return instance;
	   }
	   
	   Employee[] list; // 사원정보 배열
	   int empNum; // 사원수를 편하게
	   Scanner scn = new Scanner(System.in);
	   
	   @Override
	   public void init() {
	      System.out.print("초기화");
	      int num = Integer.parseInt(scn.nextLine());
	      list = new Employee[num];
	   }

	   @Override
	   public void input() {
	      System.out.printf("%d 사번 >> ", empNum);
	      int no = Integer.parseInt(scn.nextLine());
	      
	      System.out.print("이름 >> ");
	      String name = scn.nextLine();
	      
	      System.out.print("급여 >> ");
	      int sal = Integer.parseInt(scn.nextLine());
	      
	      list[empNum++] = new Employee(no, name, sal);
	   }

	   @Override
	   public Employee search(int empId) {
	      for (int i = 0; i < empNum; i++) {
	         if (list[i].getEmployeeId() == empId);
	         return list[i];
	      }
	      return null; // 루틴을 다 돌아보고 없으면 null 값 return
	   }

	   @Override
	   public void printList() {
	      for (int i = 0; i < empNum; i++) {
	         System.out.printf("%d | %s | %d\n", list[i].getEmployeeId(), list[i].getName(), list[i].getSalary());
	      }
	   }

	}

