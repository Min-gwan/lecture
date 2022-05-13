package kr.co.test;

public class ForTest11 {
	public static void main(String[] args) {
		int x;
		int y;
		
		for(x=0;x<11;x++) {
			for(y=0;y<11;y++) {
				if((2*x+4*y)==10) {
					System.out.printf("(%d,%d)%n",x,y);
				}
			}
		}
	}
}
