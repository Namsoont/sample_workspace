package conn.yedam.mamber;

import java.util.ArrayList;
import java.util.List;

import com.yeam.common.DAO;

public class MemberManagement extends DAO {

	// 싱글톤 생성
	private static MemberManagement mm = null;

	// 생성자
	private MemberManagement() {

	}

	// 단 하나의 객체를 사용할 수 있도록 메소드 생성
	public static MemberManagement getInstance() {
		if (mm == null) {
			return new MemberManagement();
		} else {
			return mm;
		}
	}

	// 1. 전체 조회
	public List<Member> getMemberList() {
		List<Member> list = new ArrayList<>();
		Member member = null;
		try {
			conn();
			String sql = "select * from member";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				member = new Member(); // 한바퀴 돌고 초기화해야 다음 객체에 들어오니까
				member.setId(rs.getString("id"));
				member.setPw(rs.getString("pw"));
				member.setName(rs.getString("name"));
				list.add(member);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	// 2. 단건 조회 - primary key 조회
	public Member getMember(String id) {
		Member member = null;
		try {
			conn();
			String sql = "select * from member where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				member = new Member();
				member.setId(rs.getString("id"));
				member.setPw(rs.getString("pw"));
				member.setName(rs.getString("name"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return member;

	}

	// 3. 입력
	public int insertMember(Member member) {
		int result = 0;
		try {

			conn();
			String sql = "insert into member values (?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPw());
			pstmt.setString(3, member.getName());

			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			disconnect();

		}
		return result;
	}

	// 4. 수정
	public int updateMember(Member member) {
		int result = 0;
		try {
			conn();
			String sql = " update member set pw = ? where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getPw());
			pstmt.setString(2, member.getId());

			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

//	    5. 삭제
	public int deleteMember(String id) {
		int result = 0;
		try {
			conn();
			String sql = "delete from member where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();

		}
		return result;
	}

}
