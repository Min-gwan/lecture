package kr.co.test;

import java.util.Scanner;

public class ForTest08 {
	public static void main(String[] args) {
		int start = 0;
		int end = 0;
		int sum = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.print("start: ");
		start = scanner.nextInt();
		System.out.print("end: ");
		end = scanner.nextInt();
		if (start < end) {
			for (int i = start; i <= end; i++) {
				sum += i;
			}
			System.out.println("sum: " + sum);
		} else {
			System.out.println("start must bigger than end");
		}
	}
}
