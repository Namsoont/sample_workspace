package co.edu01;
/*
 * 게시글 한건의 정보
 */

import java.util.Date;

public class Board {
	// 제목, 내용, 작성자, 작성일지, 조회수
	// Borad : 정보저장.
	// BoradApp: 등록/ 조회 / 수정 / 삭제 / 리스트 => 배열.
	private String title;
	private String content;
	private String writer;
	private Date createDate;
	private int hitCount;
	
	// 생성자;
	
	//getter, setter
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public int getHitCount() {
		return hitCount;
	}
	public void setHitCount(int hitCount) {
		this.hitCount = hitCount;
	}
	


}
