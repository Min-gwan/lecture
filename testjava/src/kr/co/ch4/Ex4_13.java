package kr.co.ch4;

public class Ex4_13 {
	public static void main(String[] args) {
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		
		/*
		for(int i =0; i<value.length();i++) {
			ch = value.charAt(i);
			int temp=(int)ch;
			if(ch>=48 && ch<=57) {
				isNumber = true;
				System.out.println(ch+"는 숫자입니다.");
			} else {
				isNumber = false;
				System.out.println(ch+"는 숫자가 아닙니다.");
			}
		}
		*/
		
		for(int i =0; i<value.length();i++) {
			ch =value.charAt(i);
			if((int)ch<48 || (int)ch>57) {
				isNumber = false;
			}
		}
		
		if(isNumber) {
			System.out.println(value+"는 숫자입니다.");
		} else {
			System.out.println(value+"는 숫자가 아닙니다.");
		}
		
		
	}
}
