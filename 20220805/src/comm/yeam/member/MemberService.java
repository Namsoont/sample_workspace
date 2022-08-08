package comm.yeam.member;

public class MemberService {

	public MemberDTO doLogin(MemberDTO member) {
		MemberDTO mem = MemberManage.getInstance().login(member);
		if (mem == null) {
			System.out.println("로그인 실패");
			System.out.println(mem);
			return null;
		} else {
			System.out.println(mem);
			System.out.println("로그인 성공");
			return mem;
		}
	}

}
