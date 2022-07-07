package P20220707;

public class Course {
	private String tname;
	private String bname;
	private Student[] students;

	// 생성자.
	public Course() {
	}

	public Course(String tname) {
		this.tname = tname;
	}

	public Course(String tname, String bname, int studentNum) {
		this.tname = tname;
		this.bname = bname;
		this.students = new Student[studentNum];
	}

	// 메소드
	public String getTname() {
		return tname;
	}

	public String getbname() {
		return bname;
	}

	public void getStudents() {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				students[i].showInfo();
			}
		}
	}

	// 학생정보 등록.
	public void addStudent(Student student) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = student;
				break;
			}
		}

	}

	// 점수가 제일 높은 학생의 정보 반환.
	public Student getmaxStudent() {
		int max = 0;
		Student student = null;
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getscore() > max) {
				max = students[i].getscore();
				student = students[i];
			}
		}
		return student;
	}

	// 반 평균 반환. getAvg
	public double getAvgScore() {
		int sum = 0;
		int cnt = 0; // 점수 합산한 사람 몇명인지 카운트
		double avg = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				sum += students[i].getscore();
				cnt++;
			}
		}
		avg = (double) sum / cnt;
		return avg;
	}

}
