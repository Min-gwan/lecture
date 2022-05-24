package kr.co.array;

import java.util.Scanner;

public class ArrayTest09 {
	public static void main(String[] args) {
		/*
		 * 검색: 배열 안에 데이터가 있는 경우 index값 호출하여 출력
		 *  ->찾고자 하는 데이터는 몇번째에 있습니다.
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
//				System.out.println("찾고자 하는 데이터는 "+(index+1)+" 번째에 있습니다.");
				break;
			}
		}
		if(index==-1) {			
			System.out.println(index);
			System.out.println("찾는 데이터가 없습니다");
		} else {
			System.out.println("찾고자 하는 데이터는 "+(index+1)+" 번째에 있습니다.");
		}
	}
}
