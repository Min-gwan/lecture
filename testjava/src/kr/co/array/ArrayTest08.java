package kr.co.array;

import java.util.Scanner;

public class ArrayTest08 {
	public static void main(String[] args) {
		/*
		 * N�� ¥�� 1���� �迭�� �����ϰ�
		 * for���� �̿��Ͽ� 1~N���� N���� ���� �Է��ϰ�
		 * �Էµ� 1~N�� �� ���ϱ�
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
