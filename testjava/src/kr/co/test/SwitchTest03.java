package kr.co.test;

import java.util.Scanner;

public class SwitchTest03 {

	public static void main(String[] args) {
//		���������� ���� �����
//		����:1 ����:2 ��:3
//		��ǻ�ʹ� �������� �ޱ�
//		����� 1~3 �ܼ��Է�
//		����ν� ������ �̰��, ���� �� ���
		
		int userValue = 0;
		int computerValue = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		userValue = scanner.nextInt();
		computerValue = (int)(Math.random()*3)+1;
		
		System.out.println("����� ���ڴ� "+userValue+" �Դϴ�.");
		System.out.println("��ǻ�� ���ڴ� "+computerValue+" �Դϴ�.");
		
		switch(userValue-computerValue) {
		case 2:
		case -1:
			System.out.println("����� �����ϴ�.");
			break;
		case 1:
		case -2:
			System.out.println("����� �̰���ϴ�.");
			break;
		case 0:
			System.out.println("�����ϴ�.");
			break;
		}
	}

}
