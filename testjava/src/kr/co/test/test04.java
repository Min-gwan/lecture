package kr.co.test;

public class test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������(����) �Է¹ޱ�
		//Math.random() -> 0.0 ~0.9999 �߿� �ϳ���  �Ǽ��� ��������~
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		
		//������ ����ȯ 0~4
		System.out.println((int)(Math.random()*5));
		System.out.println((int)(Math.random()*5));
		System.out.println((int)(Math.random()*5));
		
		
//		(int)(Math.random()*5) + 1  -> 1~5
		
		//1 ~ 45 ������ ������ ���ϼ���
//		System.out.println(((int)(Math.random()*9)+1)*5);
		System.out.println((int)(Math.random()*45) + 1);
		//13 ~ 15������ ������ ���ϼ���
		System.out.println((int)(Math.random()*3) + 13); //���� ���� ����, ���� ���� ó����
		//�Ǽ�(float) -> ����(int,long) ��ȯ 
//		(int) : ĳ���� ������
		
	}

}
