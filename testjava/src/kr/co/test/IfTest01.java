/*
 *	if(조건식) {
 *		//참이면 실행
 *		실행문(statement);
 * 	}
 * 나이를 입력 받아서 50세 이상이면
 * "당신은 어른입니다"를 출력
 * 
 * */

package kr.co.test;

import java.util.Scanner;

public class IfTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int age = 0;
		String msg = null;	//출력문장 보관
		
		System.out.print("나이를 입력하세요 : ");
		age = scan.nextInt();
		
		if(age >= 50) {
			//System.out.println("당신은 어른입니다.");
			msg = "당신은 어른입니다.";
		}
		
		System.out.println(msg);
		
		System.out.println("Program End!!!");
	}

}
