package kr.co.ch4;

public class Ex4_09 {
	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			sum+=(int)str.charAt(i)-48;
		}
		System.out.println("sum=" + sum);
	}
}
