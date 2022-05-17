package kr.co.ch4;

public class Ex4_03 {
	public static void main(String[] args) {
		int sequence = 0;
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sequence += i;
			sum += sequence;
			System.out.print(sequence+" ");
		}
		System.out.println();
		System.out.println(sum);
	}
}
