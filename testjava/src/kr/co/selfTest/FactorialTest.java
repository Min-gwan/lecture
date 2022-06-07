package kr.co.selfTest;

public class FactorialTest {
	static int factorial(int n) {
		if(n==1) return 1;
		return n*factorial(--n);
	}
	public static void main(String[] args) {
		int result = FactorialTest.factorial(5);
		
		System.out.println(result);
	}
}
