//	package : ������ test03 Ŭ������ �ִ� ��ġ
package kr.co.test;

import java.util.Scanner;
//ctrl+shift+o = IMPORT
//alt + ����Ű -> �����̵�
//import = include
// class Test03 : ����Ʈ(��Ű��) Ŭ���� -> �ش� ������ �ȿ����� ȣ�� ���� 
// private : Ŭ���� ������ ���� ���°�. �ۿ��� ȣ�� �Ұ�����(���Ȱ���)
// public : ������ (���� ȣ���)
public class Test03 {
//	static(����) : �޸𸮿� �����Ǿ� �ִ� ����. main�� ������ �޸𸮿� ����Ǿ� �ִ� ����
//	static,main�� �޸𸮿� �ö� ����
//	��������, ���������� ����
//	static�� ��������, int num1 �� ��������
	public static void main(String[] args) {
		//����&�ʱ�ȭ -> �Է� -> ó�� -> ���
		/*
		 * �� ������ �ַܼ� �Է� �޾Ƽ� �հ� ���� ���ϰ�
		 * �� ����� ����ϼ���.
		 * ��)�μ��� �� : 333
		 	 �μ��� �� : 222	
		 */
//		���� �� �ʱ�ȭ
		Scanner scan = null; 			//������, ������ -> Scanner scan = new Scanner(System.in); new�� ó������ �ϸ� �޸𸮿� �ö� �ֱ� ������, �޸� ����. �ʿ��Ҷ� new�ؼ� ����ϸ��
		int num1 = 0, num2 = 0;
		int result1 =0, result2=0;		//result1�� ��, result2�� ��
		
		scan = new Scanner(System.in);	//new ������(�޸𸮿� �ø���. �������)
		
//		�Էº�   num1, num2 �ޱ�
		System.out.print("ù��° ���� �Է� : ");
		num1 = scan.nextInt();

		System.out.println("�ι�° ���� �Է� : ");
//		System.out.printf("�ι�° ���� �Է� : ");
		num2 = scan.nextInt();
		
		System.out.println("num1 = "+ num1 +",\n num2 = "+ num2);
		System.out.println("============");
		System.out.printf("num1 = %3d ,\n num2 = %3d\n",num1,num2); //ex)%5.2f

		result1 = num1 + num2;
		System.out.println("�� ���� �� : "+result1);
		System.out.printf("�� ���� �� : %d\n",result1);
		
		result2 = num1 - num2;
		System.out.println("�� ���� �� : " + result2);
		System.out.printf("�� ���� �� : %d",result2);
	}

}
