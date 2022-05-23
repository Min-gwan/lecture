package kr.co.array;

public class Asdsf {
	public static void main(String[] args) {
		int min = 20;
		int max = 0;
		
		for(int i=2;i<11;i++) {
			int temp =(int)(Math.random()*9)+2;
			System.out.print(temp);
			System.out.print(" ");
			if(temp<min) {
				min = temp;
			}
			if(temp>max) {
				max = temp;
			}
		}
		System.out.println();
		System.out.println("min: "+min);
		System.out.println("max: "+max);
	}
}
