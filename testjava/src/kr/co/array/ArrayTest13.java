package kr.co.array;

public class ArrayTest13 {
	public static void main(String[] args) {
//		2���� �迭�� ��������.
//		5���� �л��� ��������, ��������, ���������� �Է��ϱ�
		final int CNT=5;
		final int LEC=3;
		int[] kor = {70,80,60,90,50};
		int[] eng = {71,81,61,91,52};
		int[] mat = {72,82,62,92,62};
		int[][] scores = new int[LEC][CNT];
		
		for(int i=0;i<CNT;i++) {
			System.out.println("�������� : "+kor[i]+", ");
			System.out.println("�������� : "+eng[i]+", ");
			System.out.println("�������� : "+mat[i]);
		}
		System.out.println("--------------------------");
		for(int i=0;i<LEC;i++) {
			for(int j=0;j<CNT;j++) {
				
			}
		}
	}
}
