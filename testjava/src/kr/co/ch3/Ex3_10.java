package kr.co.ch3;

public class Ex3_10 {
	public static void main(String[] args) {
		char ch = 'A';
		
		char lowerCase = (ch>='A' && ch<='Z')?(ch=(char)(ch+32)):ch;
		
		System.out.println("ch:");
		System.out.println("ch to lowerCase:"+lowerCase);
	}
}
