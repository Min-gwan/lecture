package kr.co.test;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1.
		// 학점출력 예제
		// 점수가 90점 이상이면 A학점입니다. 출력
		// 90미만이면 B학점입니다. 출력
		// 스캐너 사용하여 점수를 입력
		// A : 90~100점
		// B : 80~89점
		// C : 70~79점
		// D : 60~69점
		// F : 60점 미만
		
//		int	jumsu = 0; 
//		char hakJum = ' ';
//		Scanner scan = new Scanner(System.in);
		
//		System.out.print("점수를 입력하세요. :");
//		jumsu = scan.nextInt();
//		
//		if(jumsu >= 90) {
//			
//			System.out.println("A학점 입니다.");
//		} else if(jumsu >= 80) {
//			System.out.println("B학점 입니다.");
//		} else if(jumsu >= 70) {
//			System.out.println("C학점 입니다.");
//		} else if(jumsu >= 60) {
//			System.out.println("D학점 입니다.");
//		} else  {
//			System.out.println("F학점 입니다.");
//		}

		
//		2.
		// 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.

		// 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
		      
		/*
		 * 첫째 줄에 다음 세 가지 중 하나를 출력한다. 
		* A가 B보다 큰 경우에는 '>'를 출력한다. 
		* A가 B보다 작은 경우에는 '<'를 출력한다.
		* A와 B가 같은 경우에는 '=='를 출력한다.
		 */

//		int num1 = 0;
//		int num2 = 0;
//		char msg = ' ';
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("두 수를 입력하세요. : ");
//		num1 = scan.nextInt();
//		num2 = scan.nextInt();
//		
//		if(num1 > num2) {
//			msg='>';
//		} else if(num1 < num2) {
//			msg='<';
//		} else {
//			msg='=';
//		}
//		System.out.println(msg);
		
//		3. IfTest06
//		// 두 수를 입력받아 큰 수를 출력하시오.
//		// 응용 : 3개 받아서 큰 수 출력
		
//		int num1 = 0, num2 =0;
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("두 수를 입력하세요. : ");
//		num1 = scan.nextInt();
//		num2 = scan.nextInt();
//		
//		if(num1 > num2) {
//			System.out.println("큰 수 : "+ num1);
//		} else if (num1 < num2) {
//			System.out.println("큰 수 : "+ num2);
//		} else {
//			System.out.println("두 수는 같습니다. : "+ num1);
//		}
		
//
//		4. IfTest07
//		// 세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오.
//		int num1=0, num2=0, num3=0;
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("서로 다른 세가지 정수를 입력하세요. : ");
//		num1 = scan.nextInt();
//		num2 = scan.nextInt();
//		num3 = scan.nextInt();
//		
//		if(num1 > num2) {			
//			if(num2> num3) {		
//				System.out.println("두번째로 큰 정수 : "+num2);		//num1>num2>num3
//			} else { 				
//				if(num1>num3) {									//num1>num2, num2<num3,num1>num3
//					System.out.println("두번째로 큰 정수 : "+num3);	
//				} else {										
//					System.out.println("두번째로 큰 정수 : "+num1);	//num1>num2, num2<num3,num1<num3
//				}
//			}
//		} else {					
//			if(num2>num3) {			
//				if(num1>num3) {		
//					System.out.println("두번째로 큰 정수 : "+num1);	//num2>num1, num2>num3,num1>num3
//				} else {			
//					System.out.println("두번째로 큰 정수 : "+num3);	//num2>num1, num2>num3,num1<num3
//				}
//			} else {				
//				System.out.println("두번째로 큰 정수 : "+num2);		//num2>num1, num2<num3
//			}
//			
//		}
		
		
//		5. IfTest08
//		* 중첩 if문 성적 출력 프로그램 
//		* 1. 100점을 초과하는 점수 입력은 입력범위를 초과하였습니다. 출력
//		* 2. 학점 처리 
//		* 95~100 : 당신의 학점은 A+ 입니다. 
//		* 90~94 : 당신의 학점은 A 입니다. 
//		* 85~89 : 당신의 학점은 B+ 입니다. 
//		* 80~84 : 당신의 학점은 B 입니다. 
//		* ~~~~~ 
//		* 65~69 : 당신의 학점은 D+ 입니다. 
//		* 60~64 : 당신의 학점은 D 입니다. 
//		* 60 미만 : 당신의 학점은 F입니다.
//		* print 출력문은 한번만 쓸 것!
		
		int score = 0;
		char grade = ' ';
		char opt = ' ';
		
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하세요. : ");
		score = scan.nextInt();
		
		if(score > 100 ) {
			System.out.println("입력범위를 초과 하였습니다.");
		} else if(score >= 90) {
			grade = 'A';
			if(score >= 95) {
				opt = '+';
			} else {
				opt = ' ';
			}
		} else if(score >= 80) { 
			grade = 'B';
			if(score >= 85) {
				opt = '+';
			} else {
				opt = ' ';
			}
		} else if(score >= 70) {
			grade = 'C';
			if(score >= 75) {
				opt = '+';
			} else {
				opt = ' ';
			}
		} else if(score >= 60) {
			grade = 'D';
			if(score >= 65) {
				opt = '+';
			} else {
				opt = ' ';
			}
		} else {
			grade = 'F';
		}
		
		System.out.printf("당신의 점수는 %d 학점은 %c%c입니다.",score,grade,opt);

	}

}
