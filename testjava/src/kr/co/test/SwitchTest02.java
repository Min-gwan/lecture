package kr.co.test;

import java.util.Scanner;

public class SwitchTest02 {

	public static void main(String[] args) {
//		1~6사이의 임의의 수를 입력받아서
//		1 -> 자장면, 2-> 짬뽕, 3 -> 돈까스, 4-> 보쌈, 5 ->우동 및 덮밥, 6 -> 아무거나
		
		Scanner scanner = new Scanner(System.in);
		int sel = 0;
		String menu = null;
		
		System.out.print("숫자 입력: ");
		sel = scanner.nextInt();
		
		switch(sel) {
		case 1:
			menu = "자장면";
			break;
		case 2:
			menu = "짬뽕";
			break;
		case 3:
			menu = "돈까스";
			break;
		case 4:
			menu = "보쌈";
			break;
		case 5:
			menu = "우동 및 덮밥";
			break;
		case 6:
			menu = "아무거나";
			break;
		default:
			menu = "1~6사이의 정수를 입력하세요";
		}
		
		System.out.println("메뉴 고르기====> "+menu);

	}

}
