/*
 * �ֻ����� ������
 * 1 �̸� => 100�� ��÷!
 * 2 �̸� => 200�� ��÷!
 * 3 �̸� => 300�� ��÷!
 * 4 �̸� => 400�� ��÷!
 * 5 �̸� => 500�� ��÷!
 * 6 �̸� => 10000�� ��÷!
 * ���α׷��� �ۼ��Ͻÿ�.
 * 
 * */


package kr.co.test;

public class IfTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dice = 0;
		String msg = null;
		
		dice = ((int)Math.random()*6)+1;
		
		if(dice == 1) {			//�ֻ����� 1�̶��
			msg = "100�� ��÷";
		} else if(dice==2){		//�ֻ����� 2�̶��
			msg = "200�� ��÷";
		} else if(dice==3) {	//�ֻ����� 3�̶��
			msg = "300�� ��÷";
		} else if(dice==4) {	//�ֻ����� 4�̶��
			msg = "400�� ��÷";
		} else if(dice==5) {	//�ֻ����� 5�̶��
			msg = "500�� ��÷";
		} else {				//�ֻ����� 6�̶��
			msg = "10000�� ��÷";
		}
		System.out.println("����� �ֻ����� " + dice + "�̰�");
		System.out.println(msg+ "���ϵ帳�ϴ�.!!");
		System.out.println("Program End !!!!");
		
		
	}

}
