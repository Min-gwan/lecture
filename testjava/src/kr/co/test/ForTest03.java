package kr.co.test;

public class ForTest03 {
	public static void main(String[] args) {
//		���ڿ� ���ʴ�� ���
		String str = "Hello World - syntax";
		System.out.println("���ڿ��� ���� : " + str.length());
		for(int i =0; i<str.length();i++) {
			System.out.print(str.charAt(i));
		}
		
		
	}
}
