package kr.co.array;

public class ArrayTest04 {
	public static void main(String[] args) {
//		�迭�� �ּڰ��� �ִ� ���ϱ�
		int[] scores = {79, 88, 91 ,33,100,55,95};
		int minValue = 100;
		int maxValue = 0;
//		�ּڰ� ���ϱ�
		for(int i=0;i<scores.length;i++) {
			if(scores[i]<minValue) {
				minValue = scores[i];
			}
		}
		System.out.println("�ּڰ� : "+minValue);
//		�ִ� ���ϱ�
		for(int i=0;i<scores.length;i++) {
			if(scores[i]>maxValue) {
				maxValue = scores[i];
			}
		}
		System.out.println("�ִ� : " +maxValue);
	}
}
