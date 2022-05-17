package kr.co.ch4;

public class Ex4_08 {
	public static void main(String[] args) {
		int x;
		int y;
		
		for(x=0;x<=10;x++) {
			for(y=0;y<=10;y++) {
				if((2*x+4*y)==10) {
					System.out.println("x="+x+", y="+y);
				}
			}
		}
	}
}
