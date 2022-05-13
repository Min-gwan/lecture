package kr.co.test;

public class ForTest10 {
	public static void main(String[] args) {
//		column
		for (int i = 10; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
//		row
		for(int i=1; i<11;i++){
			for(int j=10; j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
