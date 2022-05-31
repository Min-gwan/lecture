package kr.co.func;

import java.util.Arrays;


public class FunctionTest03 {
//		initialize
	static void init(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i]=i;
		}
	}
//		plus value of array
	static int sumArr(int[] arr) {
		int sum = 0;
		for(int num : arr) {
			sum += sum;
		}
		return sum;
	}
	static int sumArr(int[] arr, int start, int end) {
		int sum = 0;
		for(int i=start;i<=end;i++) {
			sum+= arr[i];
		}
		return sum;
	}
//		switch location value of array
//	repArr()
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		init(arr);
		System.out.println(Arrays.toString(arr));
		
		int result = sumArr(arr);
		System.out.println("배열의 합 : "+ result);
		
		result = sumArr(arr, 2, 4);
		System.out.println("arr 배열의 index 2부터 4까지의 합 : " + result);
	}
}
