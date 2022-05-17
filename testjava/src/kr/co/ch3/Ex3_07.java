package kr.co.ch3;

public class Ex3_07 {
	public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius = (int)((5/9f * (fahrenheit-32))*100+0.5)/100f;
		
		System.out.println(fahrenheit);
		System.out.println(celcius);
	}
}
