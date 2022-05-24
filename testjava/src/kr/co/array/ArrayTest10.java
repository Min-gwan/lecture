package kr.co.array;

import java.util.Arrays;

public class ArrayTest10 {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60,70,80,90,100};
		int temp=0;
		
		System.out.println("arr[2]와 arr[3]의 값을 변경");
		temp = arr[2];
		arr[2]=arr[3];
		arr[3]=temp;
		System.out.println(Arrays.toString(arr));
//		shuffle
		for(int i=0;i<100;i++) {
			int r = (int)(Math.random()*10);
			temp = arr[0];
			arr[0] = arr[r];
			arr[r] = temp;
			
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("오름");
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"] = "+arr[i]);
		}
		System.out.println("내림");
		for(int i=arr.length-1;i>0;i--) {
			System.out.println("arr["+i+"] = "+arr[i]);
		}
		
		
	}
}
