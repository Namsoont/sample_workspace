package co.edu01;
/*
 * 사원정보 : 복합적인 데이터 유형.
 */
public class Employee {
	//필드
	private int  employeeId;        //사번
	private String name;            //이름
	private int departmentId;      //부서번호 10:인사부서 20: 개발부서 30 : 개발부서(영업,기본값)
	private String departmentName; //부서명
	private int Salary;            // 급여
	private String email;	      //이메일
	
	//생성자
	public Employee() {}
	public Employee(int employeeId, String name, int salary, int departmentId) {
		this.employeeId = employeeId;
		this.name = name;
		this.Salary = salary;
		this.departmentId = departmentId;
		if(departmentId == 10) {
			departmentName = "인사";
		} else if (departmentId == 20) {
			departmentName = "개발";
		} else { //{if (departmentID == 30) // 30넘어도 영업.
			departmentName = "영업";
		}
		//상세정보를 반환가능.
		
	}
	
	public String getDetailInfo() {
		//사원번호, 이름, 급여, 부서정보
		String info = "사원번호: %5d" + employeeId + ",이름: " + name + ",급여:  " + Salary;
		info += ", 부서정보: " + departmentName;
		return info;
		
	}
	
		//사번, 이름 초기화.
	public Employee(int empaloyeeId, String name) {
		this(empaloyeeId, name, 100, 30); //기본생성자 호출 this 다른 생성자를 호출할수도있다.
	}
		
	//사번, 이름, 급여
	public Employee(int empaloyeeId, String name, int salary) {
		this(empaloyeeId, name, salary, 30);
	}
	
	//get
	public int  employeeId() {
		return employeeId;
	}
	//set
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getEmpaloyeeId() {
		return employeeId;
	}
	
	public void setEmpaloyeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		this.Salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	} 
	
	
}
