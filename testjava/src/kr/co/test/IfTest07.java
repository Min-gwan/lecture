package kr.co.test;

import java.util.Scanner;

public class IfTest07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = 0, B = 0 , C= 0;
		int result = 0;
		
		System.out.print(" A :");
		A = scanner.nextInt();
		System.out.print(" B :");
		A = scanner.nextInt();
		System.out.print(" C :");
		A = scanner.nextInt();
		
		if(A>B) {
			if(A>C) {
				if(B>C) {
					result = B;
				} else {
					result = C;
				}
			} else {
				result = A;
			}
		} else {
			if(B>C) {
				if(B>A) {
					if(A>C) {
						result = A;
					} else {
						result = C;
					}
				}else {
					result = B;
				}
			}
		}
	}

}
