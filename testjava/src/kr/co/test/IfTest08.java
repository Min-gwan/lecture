package kr.co.test;

import java.util.Scanner;

public class IfTest08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 0;
		String grade = null;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요. : ");
		score = scan.nextInt();
		
		if(score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else {
			grade = "D";
		}
		
		System.out.println("당신의 점수는 "+ score +" 이고, 학점은 " + grade +" 입니다.");
		
	}

}
