/*
 *	if(���ǽ�) {
 *		//���̸� ����
 *		���๮(statement);
 * 	}
 * ���̸� �Է� �޾Ƽ� 50�� �̻��̸�
 * "����� ��Դϴ�"�� ���
 * 
 * */

package kr.co.test;

import java.util.Scanner;

public class IfTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int age = 0;
		String msg = null;	//��¹��� ����
		
		System.out.print("���̸� �Է��ϼ��� : ");
		age = scan.nextInt();
		
		if(age >= 50) {
			//System.out.println("����� ��Դϴ�.");
			msg = "����� ��Դϴ�.";
		}
		
		System.out.println(msg);
		
		System.out.println("Program End!!!");
	}

}
