package kr.co.ch4;

public class Ex4_05 {
	public static void main(String[] args) {
		boolean stop = false;
		int counter = 0;
		
		while(!stop) {
			for(int i=0;i<=counter;i++) {
				System.out.print("*");
			}
			if(counter == 10) {
				stop = true;
			}
			counter++;
			System.out.println();
		}
		System.out.println(counter);
	}
}
