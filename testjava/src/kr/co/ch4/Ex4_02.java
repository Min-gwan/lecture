package kr.co.ch4;

public class Ex4_02 {
	public static void main(String[] args) {
		int integer;
		int sum = 0;

		for (integer = 1; integer <= 20; integer++) {
			if (integer % 2 != 0 && integer % 3 != 0) {
				System.out.print(integer + " ");
				sum += integer;
			}
		}
		System.out.println();

		System.out.println("sum: " + sum);
	}
}
