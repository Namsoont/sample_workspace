package coollect.board;

import java.util.List;
import java.util.Scanner;
//nextLine 인데 오류로 next
public class BoardApp {
	public static void main(String[] args) {
		// 메뉴 선택 => 선택값 => 구현
		Scanner scn = new Scanner(System.in);
		BoardDAO app = BoardDAO.getInstance();

		while (true) {
			System.out.println("1.목록 2.등록 3.조회(작성자) 4.삭제 5.종료");
			System.out.println("선택: ");
			int selectNo = Integer.parseInt(scn.nextLine());
			if (selectNo == 1) {
				for (int i = 0; i < app.list.size(); i++) {
					System.out.println("제목: " + app.boardList().get(i).getTitle() + "\n작성자: "
							+ app.boardList().get(i).getWriter() + "\n내용: " + app.boardList().get(i).getContent());

				}

			} else if (selectNo == 2) {
				System.out.print("제목: ");
				String title = scn.nextLine();
				System.out.print("작성자: ");
				String writer = scn.nextLine();
				System.out.print("내용: ");
				String content = scn.nextLine();
				app.add(new Board(title, writer, content));

			} else if (selectNo == 3) {
				System.out.println("조회(작성자): ");
				String writer = scn.nextLine();
				List<Board> list = app.search(writer);
				for(Board board : list) { //Board클레스에 board에 변수: list에서 하나씩 담는다.(list가 board에 지정된값이 매 반복마다 하나씩 순서대로 읽혀져 변수에 저장.)
					System.out.println("제목: "+board.getTitle() + "\n작성자" + board.getWriter() + "\n내용: " +board.getContent());
				}
//				System.out.println("제목: " + app.search(writer).get(0).getTitle() + "\n작성자: "
//						+ app.search(writer).get(0).getWriter() + "\n내용: " + app.search(writer).get(0).getContent());
							} else if (selectNo == 4) {
				System.out.println("삭제: ");
				String titel = scn.nextLine();
				app.remove(titel);
			} else if (selectNo == 5) {
				System.out.println("프로그램 종료합니다.");
				break;
			}
		}
	}
}
