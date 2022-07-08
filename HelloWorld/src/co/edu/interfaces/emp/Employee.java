package co.edu.interfaces.emp;

public class Employee {

   private int employeeId; // 사번
   private String name; // 이름
   private int salary; // 급여
   private int departmentId; // 부서번호 10 : 인사 | 20 : 개발 | 30 : 영업(기본값)
   private String departmentName; // 부서명
   private String email; // 이메일

   public Employee() { // 기본 생성자
   }

   public Employee(int employeeId, String name, int salary, int departmentId) { // 생성자 오버로딩
      this.employeeId = employeeId; // this : 필드값
      this.name = name;
      this.salary = salary;
      this.departmentId = departmentId;
      if (departmentId == 10) {
         departmentName = "인사";
      } else if (departmentId == 20) {
         departmentName = "개발";
      } else {
         departmentName = "영업";
      }
   }

   public Employee(int employeeId, String name) { // 사번, 이름 초기화
      this(employeeId, name, 100, 30); // this : 다른 생성자 호출 시에도 사용 가능
   }

   public Employee(int employeeId, String name, int salary) { // 사번, 이름, 급여 초기화
      this(employeeId, name, salary, 30);
   }

   public int getEmployeeId() {
      return employeeId;
   }

   public void setEmployeeId(int employeeId) {
      this.employeeId = employeeId;
   }
   
   // 상세정보 반환기능
   public String getDetailInfo() {
      // 사원번호, 이름, 급여, 부서정보
      String info = "사원번호 : " + employeeId + " | 이름 : " + name + " | 급여 : " + salary;
      info += " | 부서정보 : " + departmentName;
      return info;
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
      return salary;
   }

   public void setSalary(int salary) {
      this.salary = salary;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

}