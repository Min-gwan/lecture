package kr.co.test;

import java.io.Closeable;
import java.util.Scanner;

public class test05 {

	public static void main(String[] args) {
		/* 두 정수를 입력받아서 
			두수의 곱과 나눗셈을 구하세요 (n1*n2, n1/n2)
		*/
		Scanner scan = null;
		scan = new Scanner(System.in);
		
		int 	resl1 = 0;
		float 	resl2 = 0.0f;
		int 	inp1 = 0, inp2 = 0; 
		
		System.out.print("첫번째 수 : ");
		inp1 = scan.nextInt();
		
		System.out.print("두번째 수 : ");
		inp2 = scan.nextInt();
		
		resl1 = inp1 * inp2;
		resl2 = (float)inp1 / (float)inp2;
		//resl2 = (float)inp1 / inp2; 이렇게만 해줘도 됨
		/*
		 * 1. 정수 / 정수 => 실수
		 * 2. 실수 / 정수 => 실수
		 * 3. 실수 / 실수 => 실수
		 */
		System.out.println("두 수의 곱 : " + resl1 );
		System.out.println("두 수의 나누기 : " + resl2 );
	
		/* 자료형 -> boolean : 값이 true/false만 보관
		 * boolean state = true; 
		 * */
		
	}

}
