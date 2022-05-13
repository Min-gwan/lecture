package kr.co.test;

import java.util.Scanner;

public class WhileTest02 {
	public static void main(String[] args) {
//		[메뉴]
//		1.자장면 2.볶음밥 5.종료
//		select num: 
		// 숫자를 입력받아서

//		선언 및 초기화
		Scanner scanner = null;
		int sel = 0;
		boolean stop = false;
		String msg = null;

		scanner = new Scanner(System.in);
		while (!stop) {
			System.out.println("[Menu]");
			System.out.println("1.자장면 2.볶음밥 5.종료");
			System.out.print("입력: ");
			sel = scanner.nextInt();
			switch (sel) {
			case 1:
				msg = "자장면 선택";
				break;
			case 2:
				msg = "볶음밥 선택";
				break;
			case 5:
				msg = "종료 선택 \n프로그램 종료";
				stop = true;
				break;
			default:
				msg = "메뉴에 있는 번호를 선택해주세요.";
			}
			System.out.println(msg);
		}
	}
}
