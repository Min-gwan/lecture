package kr.co.array;

public class ArrayTest01 {
	public static void main(String[] args) {
//		10���� �л� �̸��� ����ϰ� ����غ���. 
//		1. �迭�� ���� �� �ʱ�ȭ
		String[] sName = new String[5];
//		2. �迭�� �� �Է��ϱ�
		sName[0] = "Hong";
		sName[1] = "Kim";
		sName[2] = "Park";
		sName[3] = "Yi";
		sName[4] = "Yoon";
//		2_1 length of array
		System.out.println(sName.length);
//		3. �迭�� �� ����ϱ�
		System.out.println("1�� �л�: " + sName[0]);
		System.out.println("2�� �л�: " + sName[1]);
		System.out.println("3�� �л�: " + sName[2]);
		System.out.println("4�� �л�: " + sName[3]);
		System.out.println("5�� �л�: " + sName[4]);
	}
}
