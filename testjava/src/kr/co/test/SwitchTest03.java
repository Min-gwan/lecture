package kr.co.test;

import java.util.Scanner;

public class SwitchTest03 {

	public static void main(String[] args) {
//		가위바위보 게임 만들기
//		가위:1 바위:2 보:3
//		컴퓨터는 랜덤으로 받기
//		사용자 1~3 콘솔입력
//		결과로써 유저가 이겼다, 졌다 등 출력
		
		int userValue = 0;
		int computerValue = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 입력: ");
		userValue = scanner.nextInt();
		computerValue = (int)(Math.random()*3)+1;
		
		System.out.println("당신의 숫자는 "+userValue+" 입니다.");
		System.out.println("컴퓨터 숫자는 "+computerValue+" 입니다.");
		
		switch(userValue-computerValue) {
		case 2:
		case -1:
			System.out.println("당신이 졌습니다.");
			break;
		case 1:
		case -2:
			System.out.println("당신이 이겼습니다.");
			break;
		case 0:
			System.out.println("비겼습니다.");
			break;
		}
	}

}
