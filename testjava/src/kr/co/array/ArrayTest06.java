package kr.co.array;

public class ArrayTest06 {
	public static void main(String[] args) {
		/* 100열짜리 1차원 배열을 선언하고
		 * for문을 이용하여 1~100까지의 100개의 값을 입력하고
		 * 입력된 배열의 합을 구하기
		 */
		int sum = 0;
		int evenSum = 0;
		int[] intArr = new int[100];
		
		for(int i=1;i<intArr.length+1;i++) {
			intArr[i-1]=i;
			sum += intArr[i-1];
		}
		
		System.out.println("sum: "+sum);
		
//		배열의 갑이 짝수인 경우의 합
		for(int i=0;i<intArr.length;i++) {
			if(intArr[i]%2==0) {
				evenSum+=intArr[i];
			}
		}
		System.out.println("evenSum: "+evenSum);
	}
}
