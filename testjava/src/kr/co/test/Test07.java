package kr.co.test;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float sungjuk = 0.0f;
		int num = 0;
		
		Scanner scan = new Scanner(System.in);
		
		//num�� �ܼ��Է� ����
		System.out.print("������ �Է� �ϼ��� : ");
		num = scan.nextInt();
		
		num++; //��ġ������ -> num=num+1/ num += 1
		++num; //��ġ������
		
		sungjuk = (float)num;	//num�� float ���� ����
		
		System.out.println("���� : " + sungjuk);

	}

}
