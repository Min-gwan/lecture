package kr.co.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest11 {
	public static void main(String[] args) {
		/*
		 * ·Î¶Ç ·£´ý »Ì±â
		 */
		int[] lotto = new int[6];
		int counter = 0;

		Scanner scanner = new Scanner(System.in);
		counter = Integer.parseInt(scanner.nextLine());

		for (int c = 0; c < counter; c++) {
			for (int i = 0; i < lotto.length; i++) {
				lotto[i] = (int) (Math.random() * 45 + 1);
				for (int j = 0; j < i; j++) {
					if (lotto[j] == lotto[i]) {
						i--;
						break;
					}
				}
			}
			Arrays.sort(lotto);
			System.out.println(Arrays.toString(lotto));
		}
		
	}
}
