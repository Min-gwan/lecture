package kr.co.func;

import java.util.Scanner;

public class FunctionTest02 {
	private static void viewMenu() {
		System.out.println("========MENU=======");
		System.out.println("1. n�� 2. �� ���� �� 3.�Է� ����ŭ�� �� 5.����");
		System.out.print("select Number : ");
	}
	private static void nMultipleTable(int number) {
		for(int i=1; i<10;i++) {
			System.out.println(number+"*"+i+"="+(number*i));
		}
	}
	private static int sumOfTwo(int first, int second) {
		return (first+second);
	}
	private static int sumOfNumbers(int... numbers) {
		int sum =0;
		for(int number : numbers) {
			sum+=number;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean stop =  false;
		
		while(!stop) {
			viewMenu();
			int sel = Integer.parseInt(scanner.nextLine());
			switch(sel) {
			case 1:
				System.out.print("���ϴ� �ܼ�: ");
				int multi = Integer.parseInt(scanner.nextLine());
				nMultipleTable(multi);
				break;
			case 2:
				System.out.println("write number");
				System.out.print("first: ");
				int first = Integer.parseInt(scanner.nextLine());
				System.out.print("second: ");
				int second = Integer.parseInt(scanner.nextLine());
				System.out.println(sumOfTwo(first, second));
				break;
			case 3:
				System.out.println("write number");
				System.out.print(">");
				int sumNumbers = sumOfNumbers(Integer.parseInt(scanner.nextLine()));
				System.out.println(sumNumbers);
				break;
			case 5:
				System.out.println("���α׷� ����");
				stop = true;
				break;
			default:
				System.out.println("�޴� ��ȣ�� �����ּ���.");
			}
		}
	}
}