package kr.co.func;

public class FunctionTest04 {
	static void printChar(char ch) {
		for(int i=0;i<10;i++) {
			System.out.print(ch);
		}
		System.out.println(ch + "출력완료");
	}
	static void printChar(char ch, int cnt) {
		for(int i=0; i<cnt;i++) {
			System.out.print(ch);
		}
		System.out.println(ch + "출력완료");
	}
	static void printName(String name) {
		for(int i=0;i<5;i++) {
			System.out.print(name);
		}
		System.out.print("바보");
	}
	public static void main(String[] args) {
		printChar('#');
		printChar('$');
		printChar('%', 5);
		printName("홍민관");
	}
}
