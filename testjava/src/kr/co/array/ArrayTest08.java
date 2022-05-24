package kr.co.array;

import java.util.Scanner;

public class ArrayTest08 {
	public static void main(String[] args) {
		/*
		 * N열 짜리 1차원 배열을 선언하고
		 * for문을 이용하여 1~N까지 N개의 값을 입력하고
		 * 입력된 1~N의 합 구하기
		 */
		int inPut=0;
		int sum=0;
		int[] intArr;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("inPut>");
		inPut = Integer.parseInt(scanner.nextLine());
		
		intArr = new int[inPut];
		for(int i =0; i<intArr.length;i++) {
			intArr[i]=i+1;
			sum+=intArr[i];
		}
		System.out.println("sum: "+sum);
		
	}
}
