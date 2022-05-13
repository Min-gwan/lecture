/*
 * 나이가 50 이상이면 "어른입니다."
 *          아니면 "어린이입니다."
 * 
 * */

package kr.co.test;

import java.util.Scanner;

public class IfTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int age = 0;
		String msg = null;
		
		System.out.print("나이를 입력하세요 : ");
		age = scan.nextInt();
		
		if(age >= 50) {
			msg = "어른입니다.";
		} 
		else {
			msg = "어린이입니다.";
		}
		
		System.out.println(msg);
		System.out.println("System End!!");
	}

}
