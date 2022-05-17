package kr.co.ch4;

public class Ex4_04 {
	public static void main(String[] args) {
		int sum = 0;
		int counter = 0;
		
		/*
		for (int i = -2, j = 3; sum < 100; i -= 2, j += 2) {
			sum += i + j;
			counter++;
		}
		*/
		
		for(int i =1;sum<100;i++) {
			if(i%2==0) {
				sum -= i;
				counter++;
			} else {
				sum += +i;
				counter++;
			}
		}
		System.out.println(sum);
		System.out.println(counter);
//		System.out.println(counter * 2 + 1);

	}
}
