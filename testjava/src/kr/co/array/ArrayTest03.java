package kr.co.array;

import java.util.Scanner;

public class ArrayTest03 {
	public static void main(String[] args) {
//		10���� �̸��� ������ �ַܼ� �Է¹�������.
//		constant
		final int SIZE = 5;
		String[] names = new String[SIZE];
		int[] scores = new int[SIZE];
		int sum = 0;
		float average = 0;
		Scanner scanner = new Scanner(System.in);
//		�迭 ���� �� �ʱ�ȭ
		int[] test ={10,3,28,5};
		
//		�Է¹ޱ�
		for(int i=0;i<SIZE;i++) {
			System.out.print((i+1)+"th �̸� : ");
			names[i] = scanner.nextLine();
			System.out.print((i+1)+"th ���� : ");
			scores[i] = Integer.parseInt(scanner.nextLine());
		}
//		��� ����
//		"1�� �л��� �̸��� ??? �̰� ������ ??? �Դϴ�."
		for(int i=0;i<SIZE;i++) {
			System.out.println((i+1)+"�� �л��� �̸��� "+names[i]+" �̰� ������ "+scores[i]+" �Դϴ�.");
			
		}
//		�л� ������ ���հ� ����� ���ϼ���.
		/*
		for(int i=0;i<SIZE;i++) {
			sum+=scores[i];
		}
		*/
		for(int score:scores) {
			sum+=score;
		}
		average = (float)sum/SIZE;
		System.out.println("���� : "+sum);
		System.out.println("��� : "+average);
		
	}
}
