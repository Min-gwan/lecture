package kr.co.array;

import java.util.Arrays;

public class ArrayTest05 {
	public static void main(String[] args) {
//		���� ����
//		�迭 ���� �� �ʱ�ȭ
		int[] numArr = new int[100];
		for(int i=0;i<numArr.length;i++) {
			numArr[i] =i+1; 
		}
		System.out.println(Arrays.toString(numArr));
		
		for(int i=0; i<numArr.length;i++) {
			int random = (int)(Math.random()*100);
			int temp = numArr[0];
			numArr[0]=numArr[random];
			numArr[random]= temp;
			System.out.print(random+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(numArr));
	}
}
