package kr.co.test;

public class ForTest05 {
	public static void main(String[] args) {
//		������ ����غ��� : 2�� ������ ��� �� 3���� ���� ��
		for(int i=2;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.printf("%2d*%d=%2d",i,j,i*j);
			}
			System.out.println();
		}
	}
}
