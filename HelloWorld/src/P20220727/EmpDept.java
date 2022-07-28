package P20220727;


public class EmpDept extends Employee {
	
	String deparatment;
	
	public EmpDept() {
		
	}
	
	public EmpDept(String name, int salary, String department) {
		super.name = name; 
		super.salary = salary;
		this.deparatment = department;
		
	}
	@Override
	public void getlnformation() {
		System.out.printf("이름 : %s 연봉 : %d 부서 : %s \n",getName(),getSalary(),deparatment );
		
	}
	@Override
	public void print() {
		System.out.print("수퍼클래스\n서브클래스");
	}
	
}
