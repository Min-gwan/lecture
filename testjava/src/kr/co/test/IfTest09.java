package kr.co.test;

import java.util.Scanner;

public class IfTest09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 0;
		char grade = ' ';
		char opt = ' ';
		
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하세요. : ");
		score = scan.nextInt();
		
		if(score >= 90) {
			grade = 'A';
			if(score >= 98) {
				opt = '+';
			} else if(score <= 94) {
				opt = '-';
			} else {
				opt = '0';
			}
		} else if(score >= 80) { 
			grade = 'B';
			if(score >= 88) {
				opt = '+';
			} else if(score <= 84) {
				opt = '-';
			} else {
				opt = '0';
			}
		} else if(score >= 70) {
			grade = 'C';
			if(score >= 78) {
				opt = '+';
			} else if(score <= 74) {
				opt = '-';
			} else {
				opt = '0';
			}
		} else {
			grade = 'D';
		}
		
		System.out.println("당신의 점수는 "+score+" 입니다.");
		System.out.printf("당신의 학점은 %c%c입니다.",grade,opt);
	}

}
