package kr.co.func;

public class FunctionTest01 {
	private static void viewName() {
		System.out.println("ȫ�浿");
		System.out.println("����");
		System.out.println("�̼���");
	}
	private static void viewName(int cnt) {
		for(int i=0;i<cnt;i++) {
			System.out.println("ȫ�浿");
			System.out.println("����");
			System.out.println("�̼���");
		}
		System.out.println(cnt + "��ŭ �ݺ���");
	}
	private static int viewNameRt() {
		System.out.println("ȫ�浿");
		System.out.println("����");
		System.out.println("�̼���");
		return 1;
	}
	private static int viewNameRt(int cnt) {
		System.out.println("ȫ�浿");
		System.out.println("����");
		System.out.println("�̼���");
		return cnt;
	}
	public static void main(String[] args) {
//		1. ȫ�浿 ��� �� ����ϴ� ���
		viewName();
//		2. ���ڿ��� Ƚ����ŭ ���
		viewName(3);
//		3.�޼ҵ� ���� �� ����� ����
		int sign = viewNameRt();
		if(sign==1) {
			System.out.println("����� �����");
		} else {
			System.out.println("����");
		}
//		4. Ƚ����ŭ �ݺ��ϰ� ����� ����
		sign = viewNameRt(5);
		System.out.println(sign+"��ŭ �ݺ���");
	}
}
