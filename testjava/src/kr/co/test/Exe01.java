package kr.co.test;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1.
		// ������� ����
		// ������ 90�� �̻��̸� A�����Դϴ�. ���
		// 90�̸��̸� B�����Դϴ�. ���
		// ��ĳ�� ����Ͽ� ������ �Է�
		// A : 90~100��
		// B : 80~89��
		// C : 70~79��
		// D : 60~69��
		// F : 60�� �̸�
		
//		int	jumsu = 0; 
//		char hakJum = ' ';
//		Scanner scan = new Scanner(System.in);
		
//		System.out.print("������ �Է��ϼ���. :");
//		jumsu = scan.nextInt();
//		
//		if(jumsu >= 90) {
//			
//			System.out.println("A���� �Դϴ�.");
//		} else if(jumsu >= 80) {
//			System.out.println("B���� �Դϴ�.");
//		} else if(jumsu >= 70) {
//			System.out.println("C���� �Դϴ�.");
//		} else if(jumsu >= 60) {
//			System.out.println("D���� �Դϴ�.");
//		} else  {
//			System.out.println("F���� �Դϴ�.");
//		}

		
//		2.
		// �� ���� A�� B�� �־����� ��, A�� B�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

		// ù° �ٿ� A�� B�� �־�����. A�� B�� ���� �� ĭ���� ���еǾ��� �ִ�.
		      
		/*
		 * ù° �ٿ� ���� �� ���� �� �ϳ��� ����Ѵ�. 
		* A�� B���� ū ��쿡�� '>'�� ����Ѵ�. 
		* A�� B���� ���� ��쿡�� '<'�� ����Ѵ�.
		* A�� B�� ���� ��쿡�� '=='�� ����Ѵ�.
		 */

//		int num1 = 0;
//		int num2 = 0;
//		char msg = ' ';
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("�� ���� �Է��ϼ���. : ");
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
//		// �� ���� �Է¹޾� ū ���� ����Ͻÿ�.
//		// ���� : 3�� �޾Ƽ� ū �� ���
		
//		int num1 = 0, num2 =0;
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("�� ���� �Է��ϼ���. : ");
//		num1 = scan.nextInt();
//		num2 = scan.nextInt();
//		
//		if(num1 > num2) {
//			System.out.println("ū �� : "+ num1);
//		} else if (num1 < num2) {
//			System.out.println("ū �� : "+ num2);
//		} else {
//			System.out.println("�� ���� �����ϴ�. : "+ num1);
//		}
		
//
//		4. IfTest07
//		// �� ���� A, B, C�� �־�����. �̶�, �� ��°�� ū ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//		int num1=0, num2=0, num3=0;
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("���� �ٸ� ������ ������ �Է��ϼ���. : ");
//		num1 = scan.nextInt();
//		num2 = scan.nextInt();
//		num3 = scan.nextInt();
//		
//		if(num1 > num2) {			
//			if(num2> num3) {		
//				System.out.println("�ι�°�� ū ���� : "+num2);		//num1>num2>num3
//			} else { 				
//				if(num1>num3) {									//num1>num2, num2<num3,num1>num3
//					System.out.println("�ι�°�� ū ���� : "+num3);	
//				} else {										
//					System.out.println("�ι�°�� ū ���� : "+num1);	//num1>num2, num2<num3,num1<num3
//				}
//			}
//		} else {					
//			if(num2>num3) {			
//				if(num1>num3) {		
//					System.out.println("�ι�°�� ū ���� : "+num1);	//num2>num1, num2>num3,num1>num3
//				} else {			
//					System.out.println("�ι�°�� ū ���� : "+num3);	//num2>num1, num2>num3,num1<num3
//				}
//			} else {				
//				System.out.println("�ι�°�� ū ���� : "+num2);		//num2>num1, num2<num3
//			}
//			
//		}
		
		
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
		
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���. : ");
		score = scan.nextInt();
		
		if(score > 100 ) {
			System.out.println("�Է¹����� �ʰ� �Ͽ����ϴ�.");
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
		
		System.out.printf("����� ������ %d ������ %c%c�Դϴ�.",score,grade,opt);

	}

}
