package kr.co.array;

public class ArrayTest13 {
	public static void main(String[] args) {
//		2차원 배열을 이해하자.
//		5명의 학생의 국어점수, 수학점수, 영어점수를 입력하기
		final int CNT=5;
		final int LEC=3;
		int[] kor = {70,80,60,90,50};
		int[] eng = {71,81,61,91,52};
		int[] mat = {72,82,62,92,62};
		int[][] scores = new int[LEC][CNT];
		
		for(int i=0;i<CNT;i++) {
			System.out.println("국어점수 : "+kor[i]+", ");
			System.out.println("영어점수 : "+eng[i]+", ");
			System.out.println("수학점수 : "+mat[i]);
		}
		System.out.println("--------------------------");
		for(int i=0;i<LEC;i++) {
			for(int j=0;j<CNT;j++) {
				
			}
		}
	}
}
