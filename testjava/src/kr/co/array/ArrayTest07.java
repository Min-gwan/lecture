package kr.co.array;

public class ArrayTest07 {
	public static void main(String[] args) {
		/* 1~100 ������ ���� ���� �迭 ����
		 *  4�� ����� �հ� ����� ������ ���ϼ���.
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
