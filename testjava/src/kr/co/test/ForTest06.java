package kr.co.test;

import java.util.Scanner;

public class ForTest06 {
	public static void main(String[] args) {
		int row = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("행의 수 입력: ");
		row = scanner.nextInt();
		
		for(int i=0;i<=row;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
