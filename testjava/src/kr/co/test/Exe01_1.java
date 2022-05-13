package kr.co.test;

import java.util.Scanner;

public class Exe01_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		String msg= null;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하세요. : ");
		score = scan.nextInt();
		
		if(score >= 0 && score <= 100 ) {
			if(score >= 90) {
				grade = 'A';
			} else if(score >= 80) { 
				grade = 'B';
			} else if(score >= 70) {
				grade = 'C';
			} else if(score >= 60) {
				grade = 'D';
			} else {
				grade = 'F';
			}
			
			//부호구하기
			if(score>=60 && score<=100) {
				int temp = score % 10;
				if(temp>=5 || score == 100) {
					opt ='+';
				}
			}
			msg = "당신의 점수는"+score+" 학점은"+grade+opt+" 입니다.";
		} else {
			msg = "범위가 초과되었습니다.";
		} //end of if(score <= 0 && score >= 100 )
		
		System.out.println(msg);

	}

}
