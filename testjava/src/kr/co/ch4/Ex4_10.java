package kr.co.ch4;

public class Ex4_10 {
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		
		for(int i=0;i<=4;i++) {
			int temp = num%10;
			num = num/10;
			sum += temp;
			System.out.println(temp);
			System.out.println(num);
		}
		System.out.println(sum);
	}
}
