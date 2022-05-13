package kr.co.test;

import java.util.Scanner;

public class SwitchTest01 {

	public static void main(String[] args) {
//		월을 입력받아 계절 표현하기
		
		int month = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("현재 월을 입력하세요. >");
		String tmp = scanner.next();
		month = Integer.parseInt(tmp);
		
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("현재의 계절은 봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("현재의 계절은 여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("현재의 계절은 가을입니다.");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("현재의 계절은 겨울입니다.");
		default:
			System.out.println("1~12사이의 숫자를 입력하세요");	
		}
		

	}

}
