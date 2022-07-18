package P20220713;

import java.util.Scanner;

public class BookMember extends Member {
	Scanner scn = new Scanner(System.in);
	// 도서반의 반장이름.
	   // 도서반의 강의실정보.(지혜실, 지식실, 모험실)
	   private String asName;
	   private String psName;

	   public BookMember(int memberId, String memberName, String phone, String asName, String psName) {
	      super(memberId, memberName, phone);
	      this.asName = asName;
	      this.psName = psName;
	   }

	   // 정보출력시 => 반장이름: 홍길동, 강의실: 모험실

	   @Override
	   public String toString() {
	      return super.toString() + ", 반장이름 : " + asName + ", 강의실 : " + psName;
	   }

	   public String getAsName() {
	      return asName;
	   }

	   public void setAsName(String asName) {
	      this.asName = asName;
	   }

	   public String getPsName() {
	      return psName;
	   }

	   public void setPsName(String psName) {
	      this.psName = psName;
	   }
	}

