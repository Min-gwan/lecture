package kr.co.test;

import java.io.Closeable;
import java.util.Scanner;

public class test05 {

	public static void main(String[] args) {
		/* �� ������ �Է¹޾Ƽ� 
			�μ��� ���� �������� ���ϼ��� (n1*n2, n1/n2)
		*/
		Scanner scan = null;
		scan = new Scanner(System.in);
		
		int 	resl1 = 0;
		float 	resl2 = 0.0f;
		int 	inp1 = 0, inp2 = 0; 
		
		System.out.print("ù��° �� : ");
		inp1 = scan.nextInt();
		
		System.out.print("�ι�° �� : ");
		inp2 = scan.nextInt();
		
		resl1 = inp1 * inp2;
		resl2 = (float)inp1 / (float)inp2;
		//resl2 = (float)inp1 / inp2; �̷��Ը� ���൵ ��
		/*
		 * 1. ���� / ���� => �Ǽ�
		 * 2. �Ǽ� / ���� => �Ǽ�
		 * 3. �Ǽ� / �Ǽ� => �Ǽ�
		 */
		System.out.println("�� ���� �� : " + resl1 );
		System.out.println("�� ���� ������ : " + resl2 );
	
		/* �ڷ��� -> boolean : ���� true/false�� ����
		 * boolean state = true; 
		 * */
		
	}

}
