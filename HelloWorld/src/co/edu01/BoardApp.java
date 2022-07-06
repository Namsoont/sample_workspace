package co.edu01;

import java.util.Date;
import java.util.Scanner;

/*
 * BoradApp: 등록/ 조회 / 수정 / 삭제 / 리스트 => 배열.
 */
public class BoardApp {

	public static void main(String[] args) {
		Board[] boards = new Board[100];
		Scanner scn = new Scanner(System.in);

		boolean run = true;

		while (run) {
			System.out.println("1. 등록 2. 조회 3. 수정 4. 삭제 5. 리스트 6. 종료");
			System.out.print("선택> ");

			int selectNo = Integer.parseInt(scn.nextLine());

			if (selectNo == 1) {
				// 게시글 등록 (제목, 내용, 작성자, 작성일시, 조회수(0));
				System.out.println("글 제목을 입력하세요.");
				String title = scn.nextLine();

				System.out.println("글 내용을 입력하세요.");
				String content = scn.nextLine();

				System.out.println("글 작성자를 입력하세요.");
				String writer = scn.nextLine();

				Board board = new Board();
				board.setTitle(title);
				board.setContent(content);
				board.setWriter(writer);
				board.setCreateDate(new Date());
				board.setHitCount(0);
				// 배열의 비어있는 위치에 저장
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] == null) {
						boards[i] = board; // 비어있는위치에 저장.
						break;
					}
				}
				System.out.println("정상적으로 입력했습니다.");

			} else if (selectNo == 2) {
				// 게시글 조회: 제목조회.
				System.out.println("조회할 제목을 입력하세요.");
				String findTitle = scn.nextLine();
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] != null && boards[i].getTitle().equals(findTitle)) {
						System.out.printf("제목은 %s, 내용은 %s, 작성자는 %s, 작성일시 %s, 조회수 %d \n ", boards[i].getContent(),
								boards[i].getCreateDate(), boards[i].getWriter(), boards[i].getTitle(), //
								boards[i].getHitCount());
						// 카운트 증가.
						int cnt = boards[i].getHitCount();
						boards[i].setHitCount(++cnt);
					}

				}

			} else if (selectNo == 3) {
				System.out.println("수정할 제목을 입력하세요.");
				String findTitel = scn.nextLine();
				for (int i = 0; i != boards.length; i++) {
					if (boards[i] != null && boards[i].getTitle().equals(findTitel)) {
						
						System.out.println("수정할 제목을 입력 하세요.");
						String Title = scn.nextLine();
						boards[i].setTitle(Title);
						System.out.println("수정할 내용을 입력 하세요.");
						String fix = scn.nextLine();
						boards[i].setContent(fix);
						System.out.println("수정이 완료 되었습니다.");
						
					}  
						
					
					
				}

			} else if (selectNo == 4) {
				System.out.println("글을 삭제 하겠습니다. ");
				String findTitle = scn.nextLine();
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] != null && boards[i].getTitle().equals(findTitle)) {
						boards[i] = null;
						System.out.println("정상적으로 삭제 되었습니다.");
					}
				}

			} else if (selectNo == 5) {
//				전체리스트.
				System.out.println("========== 글 목 록 ==========");
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] != null) {
						System.out.printf("제목은 %s, 내용은 %s, 작성자는 %s, 작성일시 %s, 조회수 %d \n ", boards[i].getContent(),
								boards[i].getCreateDate(), boards[i].getWriter(), boards[i].getTitle(), //
								boards[i].getHitCount()); //
					}
				}

			} else if (selectNo == 6) {
				System.out.println("프로그램을 종료 합니다...");
				run = false;
			}
		}
		System.out.println("프로그램 종료.");

	}
}
