package kr.co.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest02 {
	public static void main(String[] args) {
//		5명의 학생이름을 선언하고 콘솔로 이름을 입력받은 후 출력하기.
//		선언 및 초기화
		String[] sName = new String[5];
		Scanner scanner = null;
//		값 입력 받기
		scanner = new Scanner(System.in);
		for(int i =0;i<sName.length;i++) {
			System.out.print((i+1)+"번 학생>");
			sName[i] = scanner.nextLine();
		}
		/*
		System.out.print("1번 학생>");
		sName[0] = scanner.nextLine();
		System.out.print("2번 학생>");
		sName[1] = scanner.nextLine();
		System.out.print("3번 학생>");
		sName[2] = scanner.nextLine();
		System.out.print("4번 학생>");
		sName[3] = scanner.nextLine();
		System.out.print("5번 학생>");
		sName[4] = scanner.nextLine();
		*/
//		length of array
		System.out.println(sName.length);
//		배열의 값 출력하기
		for(int i=0;i<sName.length;i++) {
			System.out.println((i+1)+"번 학생: " + sName[i]);
		}
//		향상된 for문
		int i = 1;
		for(String name:sName) {
			System.out.println(i+"번 학생: " + name);
			i++;
		}
//		use toString()
		System.out.println(Arrays.toString(sName));
	}
}
