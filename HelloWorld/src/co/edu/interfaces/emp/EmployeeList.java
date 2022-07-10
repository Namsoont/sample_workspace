package co.edu.interfaces.emp;

/*
 * 기능 정의(선언) 부분.
 * Interface는 장치가 사이에 서로서로 정보 주고 받고 해주는 역할 < 쉽게 생각하면 택배 상하차 장소 
 */
public interface EmployeeList {

	// 배열 초기화.
	public void init();

	// 사원정보 입력.
	public void input();

	// 사번에 해당하는 정보를 조회.
	public Employee search(int empId);

	// 전체 출력.
	public void printList();

}
