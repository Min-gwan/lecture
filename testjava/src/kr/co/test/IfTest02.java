/*
 * ���̰� 50 �̻��̸� "��Դϴ�."
 *          �ƴϸ� "����Դϴ�."
 * 
 * */

package kr.co.test;

import java.util.Scanner;

public class IfTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int age = 0;
		String msg = null;
		
		System.out.print("���̸� �Է��ϼ��� : ");
		age = scan.nextInt();
		
		if(age >= 50) {
			msg = "��Դϴ�.";
		} 
		else {
			msg = "����Դϴ�.";
		}
		
		System.out.println(msg);
		System.out.println("System End!!");
	}

}
