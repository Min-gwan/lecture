package kr.co.array;

public class ArrayTest04 {
	public static void main(String[] args) {
//		배열의 최솟값과 최댓값 구하기
		int[] scores = {79, 88, 91 ,33,100,55,95};
		int minValue = 100;
		int maxValue = 0;
//		최솟값 구하기
		for(int i=0;i<scores.length;i++) {
			if(scores[i]<minValue) {
				minValue = scores[i];
			}
		}
		System.out.println("최솟값 : "+minValue);
//		최댓값 구하기
		for(int i=0;i<scores.length;i++) {
			if(scores[i]>maxValue) {
				maxValue = scores[i];
			}
		}
		System.out.println("최댓값 : " +maxValue);
	}
}
