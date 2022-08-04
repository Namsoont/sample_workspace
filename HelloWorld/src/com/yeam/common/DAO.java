package com.yeam.common;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAO {
	//싱글톤
	
	
//	//자기 자신으로 만든 인스턴스
//	private static DAO dao = null;
//	//생성자
//	private DAO() {
//		
//	}
//	//3. 1번에 만든 인스턴스 사용
//	public static DAO getInstance() {
//		if(dao == null) {
//			return new DAO();
//		} else 
//			return new DAO();
//	
//	}
	
	//DAO
	//Data access Object <-데이터 접속할 정의
	
	
	//Connection 자바랑 DB랑 연결할때 쓰는 객체.
	protected Connection  conn = null;
	//ResultSet 모아놓은 집합(DB) [Select(조회) 결과 값 반환 받는 객체]
	protected ResultSet  rs = null;
	//PreparedStatement [Query문을 담고 Query문을 실행가는 객체]
	protected PreparedStatement pstmt = null;
	protected Statement stmt = null;
	
	 String driver = "oracle.jdbc.driver.OracleDriver";
	 String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
     String id = "test";
     String pw = "1234";

     public void conn() {
    	 try {
    		 //1. 드라이버 로딩
			Class.forName(driver);
			//2. DB연결
			conn = DriverManager.getConnection(url,id,pw);
		} catch (Exception e) {
			e.printStackTrace();
		}
     }
	public void disconnect() {
		try {
			if(rs != null) {
				rs.close();
			}
			if(stmt != null) {
				stmt.close();
			}
			if(pstmt != null) {
				pstmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
     
}
