package kr.co.test;

import java.util.Scanner;

public class DowhileTest {
	public static void main(String[] args) {
//		���ڿ��� �Է¹޾Ƽ� "����"��� �� �ƴϸ� �ٽ� �Է¹ޱ�
		Scanner scanner = new Scanner(System.in);
		String inputString = null;
		boolean stop = false;
		
		do {
			System.out.println("�޼��� �Է�: ");
			System.out.println("���α׷��� �����Ϸ��� '����'�� �Է��ϼ���.");
			System.out.print(">>>>> ");
			inputString = scanner.next();
			System.out.println("�Է��� �޽����� " + inputString + " �Դϴ�.");
			
			if(inputString.equals("����")) {
				stop = true;
			}
		}while(!stop);
		
		System.out.println("End!!");
	}
}
