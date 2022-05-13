package kr.co.test;

public class ForTest03 {
	public static void main(String[] args) {
//		문자열 차례대로 출력
		String str = "Hello World - syntax";
		System.out.println("문자열의 길이 : " + str.length());
		for(int i =0; i<str.length();i++) {
			System.out.print(str.charAt(i));
		}
		
		
	}
}
