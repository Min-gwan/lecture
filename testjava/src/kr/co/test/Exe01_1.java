package kr.co.test;

import java.util.Scanner;

public class Exe01_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		5. IfTest08
//		* ��ø if�� ���� ��� ���α׷� 
//		* 1. 100���� �ʰ��ϴ� ���� �Է��� �Է¹����� �ʰ��Ͽ����ϴ�. ���
//		* 2. ���� ó�� 
//		* 95~100 : ����� ������ A+ �Դϴ�. 
//		* 90~94 : ����� ������ A �Դϴ�. 
//		* 85~89 : ����� ������ B+ �Դϴ�. 
//		* 80~84 : ����� ������ B �Դϴ�. 
//		* ~~~~~ 
//		* 65~69 : ����� ������ D+ �Դϴ�. 
//		* 60~64 : ����� ������ D �Դϴ�. 
//		* 60 �̸� : ����� ������ F�Դϴ�.
//		* print ��¹��� �ѹ��� �� ��!
		
		int score = 0;
		char grade = ' ';
		char opt = ' ';
		String msg= null;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���. : ");
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
			
			//��ȣ���ϱ�
			if(score>=60 && score<=100) {
				int temp = score % 10;
				if(temp>=5 || score == 100) {
					opt ='+';
				}
			}
			msg = "����� ������"+score+" ������"+grade+opt+" �Դϴ�.";
		} else {
			msg = "������ �ʰ��Ǿ����ϴ�.";
		} //end of if(score <= 0 && score >= 100 )
		
		System.out.println(msg);

	}

}
