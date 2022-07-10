package co.edu.interfaces.emp;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 컬렉션 기반으로 기능구현.
 */
public class EmployeeArrayList implements EmployeeList {

	private static EmployeeArrayList instance = new EmployeeArrayList();

	private EmployeeArrayList() {}
	

	public static EmployeeArrayList getInstanc() {
		return instance;
	}

	ArrayList<Employee> list;
	int empNum; // 안써도됨
	Scanner scn = new Scanner(System.in);

	@Override
	public void init() {
		list = new ArrayList<Employee>();
		System.out.println(list +"초기화 되었습니다.");
		
	}

	@Override
	public void input() {
		System.out.print("사번> ");
		int no = Integer.parseInt(scn.nextLine());

		System.out.print("이름 > ");
		String name = scn.nextLine();

		System.out.print("급여>  ");
		int sal = Integer.parseInt(scn.nextLine());

		list.add(new Employee(no, name, sal));
		
	}

	@Override
	public Employee search(int empId) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getEmployeeId() == empId);	
			return list.get(i);
		}
		return null;
	}

	@Override
	public void printList() {
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%d %s %d\n", list.get(i).getEmployeeId(), list.get(i).getName(),
					list.get(i).getSalary());
		}

	}

}
