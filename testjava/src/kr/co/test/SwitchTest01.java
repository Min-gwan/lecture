package kr.co.test;

import java.util.Scanner;

public class SwitchTest01 {

	public static void main(String[] args) {
//		���� �Է¹޾� ���� ǥ���ϱ�
		
		int month = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� ���� �Է��ϼ���. >");
		String tmp = scanner.next();
		month = Integer.parseInt(tmp);
		
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("������ ������ ���Դϴ�.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("������ ������ �����Դϴ�.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("������ ������ �����Դϴ�.");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("������ ������ �ܿ��Դϴ�.");
		default:
			System.out.println("1~12������ ���ڸ� �Է��ϼ���");	
		}
		

	}

}
