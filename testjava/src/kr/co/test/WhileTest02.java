package kr.co.test;

import java.util.Scanner;

public class WhileTest02 {
	public static void main(String[] args) {
//		[�޴�]
//		1.����� 2.������ 5.����
//		select num: 
		// ���ڸ� �Է¹޾Ƽ�

//		���� �� �ʱ�ȭ
		Scanner scanner = null;
		int sel = 0;
		boolean stop = false;
		String msg = null;

		scanner = new Scanner(System.in);
		while (!stop) {
			System.out.println("[Menu]");
			System.out.println("1.����� 2.������ 5.����");
			System.out.print("�Է�: ");
			sel = scanner.nextInt();
			switch (sel) {
			case 1:
				msg = "����� ����";
				break;
			case 2:
				msg = "������ ����";
				break;
			case 5:
				msg = "���� ���� \n���α׷� ����";
				stop = true;
				break;
			default:
				msg = "�޴��� �ִ� ��ȣ�� �������ּ���.";
			}
			System.out.println(msg);
		}
	}
}
