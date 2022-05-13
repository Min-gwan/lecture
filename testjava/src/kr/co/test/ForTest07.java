package kr.co.test;

public class ForTest07 {
	public static void main(String[] args) {
		int sum =0;
		
		for(int i=1;i<=100;i++) {
			if(i%3==0) {
				System.out.printf("%3d",i);
				sum += i;
			}
		}
		System.out.println();
		System.out.println("3의 배수의 합: " + sum);
	}
}
