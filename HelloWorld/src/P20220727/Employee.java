package P20220727;


public class Employee {
		public String name;
		public int salary;
		
		public Employee() {
			
		}
		
		public Employee(String name, int salary) {
			this.name = name;
			this.salary = salary;
		}
		
		public String getName() {
			return name;
		}

		public int getSalary() {
			return salary;
		}	
		public void getlnformation() {
			System.out.println("이름 : " + name + "연봉 : " + salary);
		}
					
		public void print() {
			System.out.print("수퍼클래스 ");
		}
		
		

}
