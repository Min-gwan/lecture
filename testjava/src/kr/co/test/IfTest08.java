package kr.co.test;

import java.util.Scanner;

public class IfTest08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 0;
		String grade = null;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���. : ");
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
		
		System.out.println("����� ������ "+ score +" �̰�, ������ " + grade +" �Դϴ�.");
		
	}

}
