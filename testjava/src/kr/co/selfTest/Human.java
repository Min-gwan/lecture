package kr.co.selfTest;

public class Human implements Sports {
	/*
	 * -�̸�, Ű, ������
	 * -�Դ´�, �ܴ�, �����Ѵ�, ��Ѵ�, �޽��Ѵ�.
	 */
	private String name;
	private int length;
	private int weight;
	
	void eat(String e) {
		System.out.println(e +" ��(��) �Դ´�.");
	}
	void sleeping() {
		System.out.println("����� ���� �ڰ� �ֽ��ϴ�.");
	}
	@Override
	public void workout() {
		System.out.println("��� �Ѵ�.");
		
	}
	@Override
	public void workout(String str) {
		System.out.println("��� �Ѵ�.");
		
	}
	@Override
	public void rest() {
		System.out.println("�޽��� ���Ѵ�.");
		
	}
	
}
