package kr.co.test;

import java.util.Scanner;

public class DowhileTest {
	public static void main(String[] args) {
//		문자열을 입력받아서 "종료"라면 끝 아니면 다시 입력받기
		Scanner scanner = new Scanner(System.in);
		String inputString = null;
		boolean stop = false;
		
		do {
			System.out.println("메세지 입력: ");
			System.out.println("프로그램을 종료하려면 '종료'를 입력하세요.");
			System.out.print(">>>>> ");
			inputString = scanner.next();
			System.out.println("입력한 메시지는 " + inputString + " 입니다.");
			
			if(inputString.equals("종료")) {
				stop = true;
			}
		}while(!stop);
		
		System.out.println("End!!");
	}
}
