package kr.co.func;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		int num1 =0, num2=0;
		boolean stop = false;
		Scanner scanner = new Scanner(System.in);
		int sel = 0;
		int result = 0;
		float result1 = 0.0f;
		while(!stop) {
			System.out.println("Menu : 1. �� 2. �� 3. �� 4. �� 99.����");
			System.out.print("select Number : ");
			sel = Integer.parseInt(scanner.nextLine());
			if(sel != 99) {				
				System.out.print("ù ��° ��: ");
				num1 = Integer.parseInt(scanner.nextLine());
				System.out.print("�� ��° ��: ");
				num2 = Integer.parseInt(scanner.nextLine());
			}
			switch(sel) {
			case 1:
				result = cal.sum(num1, num2);
				System.out.println("�� : "+result);
				break;
			case 2:
				result = cal.minus(num1, num2);
				System.out.println("�� : "+ result);
				break;
			case 3:
				result = cal.mul(num1, num2);
				System.out.println("�� : "+ result);
				break;
			case 4:
				result1 = cal.div(num1, num2);
				System.out.println("�� : " + result1);
				break;
			case 99:
				System.out.println("�����մϴ�.");
				stop = true;
				break;
			default:
				System.out.println("1~4���� �������ּ���");
			}
		}
	}
}
