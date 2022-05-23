package kr.co.array;

import java.util.Scanner;

public class ArrayTest03 {
	public static void main(String[] args) {
//		10명의 이름과 성적을 콘솔로 입력받으세요.
//		constant
		final int SIZE = 5;
		String[] names = new String[SIZE];
		int[] scores = new int[SIZE];
		int sum = 0;
		float average = 0;
		Scanner scanner = new Scanner(System.in);
//		배열 선언 및 초기화
		int[] test ={10,3,28,5};
		
//		입력받기
		for(int i=0;i<SIZE;i++) {
			System.out.print((i+1)+"th 이름 : ");
			names[i] = scanner.nextLine();
			System.out.print((i+1)+"th 점수 : ");
			scores[i] = Integer.parseInt(scanner.nextLine());
		}
//		출력 예시
//		"1번 학생의 이름은 ??? 이고 점수는 ??? 입니다."
		for(int i=0;i<SIZE;i++) {
			System.out.println((i+1)+"번 학생의 이름은 "+names[i]+" 이고 점수는 "+scores[i]+" 입니다.");
			
		}
//		학생 점수의 총합과 평균을 구하세요.
		/*
		for(int i=0;i<SIZE;i++) {
			sum+=scores[i];
		}
		*/
		for(int score:scores) {
			sum+=score;
		}
		average = (float)sum/SIZE;
		System.out.println("총합 : "+sum);
		System.out.println("평균 : "+average);
		
	}
}
