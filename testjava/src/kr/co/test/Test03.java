//	package : 보따리 test03 클래스가 있는 위치
package kr.co.test;

import java.util.Scanner;
//ctrl+shift+o = IMPORT
//alt + 방향키 -> 문장이동
//import = include
// class Test03 : 디폴트(패키지) 클래스 -> 해당 보따리 안에서만 호출 가능 
// private : 클래스 내에서 나만 보는것. 밖에서 호출 불가능함(보안관련)
// public : 공용의 (어디든 호출됨)
public class Test03 {
//	static(정적) : 메모리에 고정되어 있는 상태. main의 내용이 메모리에 저장되어 있는 상태
//	static,main은 메모리에 올라가 있음
//	전역변수, 지역변수가 있음
//	static이 전역변수, int num1 이 지역변수
	public static void main(String[] args) {
		//선언&초기화 -> 입력 -> 처리 -> 출력
		/*
		 * 두 정수를 콘솔로 입력 받아서 합과 차를 구하고
		 * 그 결과를 출력하세요.
		 * 예)두수의 합 : 333
		 	 두수의 차 : 222	
		 */
//		선언 및 초기화
		Scanner scan = null; 			//참조형, 대기상태 -> Scanner scan = new Scanner(System.in); new를 처음부터 하면 메모리에 올라가 있기 때문에, 메모리 낭비. 필요할때 new해서 사용하면됨
		int num1 = 0, num2 = 0;
		int result1 =0, result2=0;		//result1은 합, result2은 차
		
		scan = new Scanner(System.in);	//new 생성자(메모리에 올린다. 무대등장)
		
//		입력부   num1, num2 받기
		System.out.print("첫번째 정수 입력 : ");
		num1 = scan.nextInt();

		System.out.println("두번째 정수 입력 : ");
//		System.out.printf("두번째 정수 입력 : ");
		num2 = scan.nextInt();
		
		System.out.println("num1 = "+ num1 +",\n num2 = "+ num2);
		System.out.println("============");
		System.out.printf("num1 = %3d ,\n num2 = %3d\n",num1,num2); //ex)%5.2f

		result1 = num1 + num2;
		System.out.println("두 수의 합 : "+result1);
		System.out.printf("두 수의 합 : %d\n",result1);
		
		result2 = num1 - num2;
		System.out.println("두 수의 차 : " + result2);
		System.out.printf("두 수의 합 : %d",result2);
	}

}
