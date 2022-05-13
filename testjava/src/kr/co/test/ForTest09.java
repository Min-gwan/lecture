package kr.co.test;

import java.util.Scanner;

public class ForTest09 {
	public static void main(String[] args) {
		int start = 0;
		int end = 0;
		int sum =0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("start: ");
		start = scanner.nextInt();
		System.out.print("end: ");
		end = scanner.nextInt();
		
		for(int i=start;i<=end;i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println("sum of even: "+sum);
	}
}
