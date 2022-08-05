package com.yedam.student;

import java.util.Scanner;

public class StudentService {
	Scanner scn = new Scanner(System.in);
	//학생 등록
	public void insertStudent(StudentDTO std) {
	int	result = StudentManage.getInsteance().insertStudent(std);
	if(result == 1) {
		System.out.println("학생 정보 입력 성공");
	} else {
		System.out.println("학생 정보 입력 실패");
	}	
	}
	
	public void insertSubject(StudentDTO std) {
		//1.성적 입력 -> 1. 국어 2. 영어 3. 수학
		int menu = 0;
		System.out.println("=============성적 입력=============");
		System.out.println("1.국어 | 2.영어 | 3.수학");
		menu = Integer.parseInt(scn.nextLine());
		
		
		System.out.println("입력 : ");
		
		if(menu == 1) {
			int kor = Integer.parseInt(scn.nextLine());
			//국어점수 입력
			std.setStudentkor(kor);			
			chekResult(StudentManage.getInsteance().insertKor(std));
//			StudentManage.getInsteance().insertKor(std);
			
		} else if(menu == 2) {			
			//영어점수 입력
			int eng = Integer.parseInt(scn.nextLine());
			std.setStudentEng(eng);	
			
			int result = StudentManage.getInsteance().insertEng(std);
			chekResult(result);
			
		} else if(menu == 3) {
			//수학 점수
			int math = Integer.parseInt(scn.nextLine());
			std.setStudentMath(math);;			
			chekResult(StudentManage.getInsteance().insertMath(std));
		}
		
		
	}
	
	public void updateTel() {
		
		StudentDTO std = new StudentDTO();
		
		System.out.println("ID 입력 : ");
		int id = Integer.parseInt(scn.nextLine());
		System.out.println("변경할 전화번호 입력 : ");
		String tel = scn.nextLine();
		
		std.setStudentId(id);
		std.setStudentTel(tel);
		
		int result = StudentManage.getInsteance().updateTel(std);
		chekResult(result);
		
	}
	//학생 정보 조회
	public StudentDTO getStuduent(StudentDTO std) {
		
		
//		StudentDTO std = StudentManage.getInsteance().getStudent(id);
//		return std;
		
		return StudentManage.getInsteance().getStudent(std.getStudentId());
		
	}
	
	
	
	
	
	public void chekResult(int value) {
		if(value == 1) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
