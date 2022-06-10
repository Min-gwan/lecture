package kr.co.selfTest;

public class FinalCardTest {
	public static void main(String[] args) {
		Card c = new Card("HEART", 10);
	
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);
		System.out.println(c.toString());
	}	
}

class Card {
	final int NUMBER;
	final String KIND;
	static int width = 100;
	static int height = 250;
	
	public Card() {
		this("HEART",1);
	}
	public Card(String kind, int num) {
		KIND = kind;
		NUMBER = num;
	}
	
	public String toString() {
		return KIND + " " + NUMBER;
	}
}