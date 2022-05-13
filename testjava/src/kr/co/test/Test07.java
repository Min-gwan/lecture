package kr.co.test;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float sungjuk = 0.0f;
		int num = 0;
		
		Scanner scan = new Scanner(System.in);
		
		//num에 콘솔입력 대입
		System.out.print("성적을 입력 하세요 : ");
		num = scan.nextInt();
		
		num++; //후치연산자 -> num=num+1/ num += 1
		++num; //전치연산자
		
		sungjuk = (float)num;	//num의 float 생략 가능
		
		System.out.println("성적 : " + sungjuk);

	}

}
