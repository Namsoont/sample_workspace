package P20220707;

public class StudentMain {
	public static void main(String[] args) {
		//필드
//		private static String name;
		
		//메소드
		Student kim = new Student();
		kim.setSno("22-001");
		kim.setName("김민수");
		kim.setScore(80);

		System.out.println("이름: " + kim.getname());
		System.out.println("학번: " + kim.getSno());
		kim.showInfo();

		Student park = new Student("22-002", "박희수", 85); // 생성자 초기화
		park.showInfo();
		// 학생추가.
		Student nam = new Student("22-003", "남순탁", 90);
		nam.showInfo();

		Course course = new Course("김철수", "1-3", 25);
		System.out.println("선생님: " + course.getTname());
		System.out.println("반 정보: " + course.getbname());
//		Student stu = course.getmaxStudent(); 
//		System.out.println("제일 높은 학생: " + course.getmaxStudent());  이 위치에 있으면 못찾음

		// 학생등록
		course.addStudent(park);
		course.addStudent(kim);
		course.addStudent(nam);
		// 학생리스트 보기.
		course.getStudents();
		
		Student stu = course.getmaxStudent();
		System.out.println("제일 높은 학생: " + course.getmaxStudent().getname()); //name 까지 넣어야 이름이뜸. 안넣으면 주소 값만 뜸.

		Student maxStudent = course.getmaxStudent();
		maxStudent.showInfo();
		course.getStudents();

		// 반평균.
		System.out.println("반 평균: " + course.getAvgScore());
	}
}
