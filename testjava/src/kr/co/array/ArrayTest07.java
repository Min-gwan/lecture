package kr.co.array;

public class ArrayTest07 {
	public static void main(String[] args) {
		/* 1~100 까지의 값을 가진 배열 선언
		 *  4의 배수의 합과 배수의 갯수를 구하세요.
		 */
		int sum =0;
		int counter=0;
		int[] intArr = new int[100];
		
		for(int i =0;i<intArr.length;i++) {
			intArr[i] = i+1;
			if(intArr[i]%4==0) {
				sum+=intArr[i];
				counter++;
			}
		}
		
		System.out.println("sum: "+sum);
		System.out.println("counter: "+counter);
	}
}
