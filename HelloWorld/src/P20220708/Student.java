package P20220708;



public class Student {
	private String studentNum;
	Student(String studentNum)	{
		this.studentNum = studentNum;
	}
	private String getStudentNum()	{
		return studentNum;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			if(studentNum.equals(getStudentNum())) {
				return true;
			}
		}
		return false;
	}
	
	
	
}
