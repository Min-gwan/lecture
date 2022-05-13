package kr.co.test;

public class ForTest05 {
	public static void main(String[] args) {
//		구구단 출력해보기 : 2단 옆으로 출력 후 3단은 다음 줄
		for(int i=2;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.printf("%2d*%d=%2d",i,j,i*j);
			}
			System.out.println();
		}
	}
}
