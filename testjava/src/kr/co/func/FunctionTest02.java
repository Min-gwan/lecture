package kr.co.func;

import java.util.Scanner;

public class FunctionTest02 {
	private static void viewMenu() {
		System.out.println("========MENU=======");
		System.out.println("1. n단 2. 두 수의 합 3.입력 수만큼의 합 5.종료");
		System.out.print("select Number : ");
	}
	private static void nMultipleTable(int first) {
		for(int i=1; i<10;i++) {
			System.out.println(first+"*"+i+"="+(first*i));
		}
	}
	private static int sumOfTwo(int first, int second) {
		return (first+second);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean stop =  false;
		
		while(!stop) {
			viewMenu();
			int sel = Integer.parseInt(scanner.nextLine());
			switch(sel) {
			case 1:
				System.out.print("원하는 단수: ");
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
				break;
			case 5:
				System.out.println("프로그램 종료");
				stop = true;
				break;
			default:
				System.out.println("메뉴 번호를 눌러주세요.");
			}
		}
	}
}
