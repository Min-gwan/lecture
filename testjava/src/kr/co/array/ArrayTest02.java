package kr.co.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest02 {
	public static void main(String[] args) {
//		5���� �л��̸��� �����ϰ� �ַܼ� �̸��� �Է¹��� �� ����ϱ�.
//		���� �� �ʱ�ȭ
		String[] sName = new String[5];
		Scanner scanner = null;
//		�� �Է� �ޱ�
		scanner = new Scanner(System.in);
		for(int i =0;i<sName.length;i++) {
			System.out.print((i+1)+"�� �л�>");
			sName[i] = scanner.nextLine();
		}
		/*
		System.out.print("1�� �л�>");
		sName[0] = scanner.nextLine();
		System.out.print("2�� �л�>");
		sName[1] = scanner.nextLine();
		System.out.print("3�� �л�>");
		sName[2] = scanner.nextLine();
		System.out.print("4�� �л�>");
		sName[3] = scanner.nextLine();
		System.out.print("5�� �л�>");
		sName[4] = scanner.nextLine();
		*/
//		length of array
		System.out.println(sName.length);
//		�迭�� �� ����ϱ�
		for(int i=0;i<sName.length;i++) {
			System.out.println((i+1)+"�� �л�: " + sName[i]);
		}
//		���� for��
		int i = 1;
		for(String name:sName) {
			System.out.println(i+"�� �л�: " + name);
			i++;
		}
//		use toString()
		System.out.println(Arrays.toString(sName));
	}
}
