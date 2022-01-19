package com.me.view;

import java.util.Scanner;

import com.me.controller.Notecontroller;

public class openMenu {
	Scanner sc = new Scanner(System.in);
	Notecontroller nc = new Notecontroller();
	public static String ID;
	
	

	public void mainMenu() {
		
		//로그인
		System.out.println("아이디 :");
		System.out.println("비밀번호 :");
		ID = sc.nextLine();
		String pwd = sc.nextLine();
		nc.readNote();

		while (true) {
			
			System.out.println("===메뉴===");
			System.out.println();
			System.out.println("1. 독서 노트 작성하기");
			System.out.println("2. 작성글 보기");
			System.out.println("3. 작성글 검색하기");
			System.out.println("4. 책 보기");
			System.out.println("5. 책 검색");
			System.out.println("9. 프로그램 종료");
			System.out.println("메뉴 입력 :");
			int menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1:
				writeNote();
				break;
			case 2:
				nc.viewNote();
				break;
			case 3:
				serchNote();
				break;
			case 4:
				break;
			case 5:
				break;
			case 9:
				nc.saveNote();
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력했습니다.");
				break;
			}

		}
	}

	private void serchNote() {
		// TODO Auto-generated method stub
		
	}


	public void writeNote() {
		System.out.println("글을 작성하시겠습니까? (y/n)");
		String yn = sc.nextLine().toUpperCase();

		while (true) {
			if (yn.equalsIgnoreCase("Y")) {
			nc.writeNote();
				break;

			} else if (yn.equalsIgnoreCase("N")) {
				System.out.println("메인 메뉴로 돌아갑니다.");
				break;
			} else {
				System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
				break;
			}
		}

	}
	

}
