package kr.co.array;

import java.util.Scanner;

public class ArrayTest09 {
	public static void main(String[] args) {
		/*
		 * �˻�: �迭 �ȿ� �����Ͱ� �ִ� ��� index�� ȣ���Ͽ� ���
		 *  ->ã���� �ϴ� �����ʹ� ���°�� �ֽ��ϴ�.
		 */
		int arr[]= {1,2,5,3,4,7,6,9,10,8};
		int input=0;
		int index =-1;
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("input>");
		input=Integer.parseInt(scanner.nextLine());
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==input) {
				index = i;
//				System.out.println("ã���� �ϴ� �����ʹ� "+(index+1)+" ��°�� �ֽ��ϴ�.");
				break;
			}
		}
		if(index==-1) {			
			System.out.println(index);
			System.out.println("ã�� �����Ͱ� �����ϴ�");
		} else {
			System.out.println("ã���� �ϴ� �����ʹ� "+(index+1)+" ��°�� �ֽ��ϴ�.");
		}
	}
}
