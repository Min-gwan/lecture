package kr.co.ch4;

public class Ex4_12 {
	public static void main(String[] args) {
		for(int i=1;i<4;i++) {
			for(int j=2;j<5;j++) {
				System.out.printf("%d*%d=%d\t",j,i,i*j);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<4;i++) {
			for(int j=5;j<8;j++) {
				System.out.printf("%d*%d=%d\t",j,i,i*j);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<4;i++) {
			for(int j=8;j<10;j++) {
				System.out.printf("%d*%d=%d\t",j,i,i*j);
			}
			System.out.println();
		}
	}
}
