package kr.co.test;

import java.util.Scanner;

public class SwitchTest02 {

	public static void main(String[] args) {
//		1~6������ ������ ���� �Է¹޾Ƽ�
//		1 -> �����, 2-> «��, 3 -> ���, 4-> ����, 5 ->�쵿 �� ����, 6 -> �ƹ��ų�
		
		Scanner scanner = new Scanner(System.in);
		int sel = 0;
		String menu = null;
		
		System.out.print("���� �Է�: ");
		sel = scanner.nextInt();
		
		switch(sel) {
		case 1:
			menu = "�����";
			break;
		case 2:
			menu = "«��";
			break;
		case 3:
			menu = "���";
			break;
		case 4:
			menu = "����";
			break;
		case 5:
			menu = "�쵿 �� ����";
			break;
		case 6:
			menu = "�ƹ��ų�";
			break;
		default:
			menu = "1~6������ ������ �Է��ϼ���";
		}
		
		System.out.println("�޴� ����====> "+menu);

	}

}
