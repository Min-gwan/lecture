package kr.co.func;

public class Calculator {
	
	int sum(int n1, int n2) {
		System.out.println("합을 구하는 중");
		return n1 + n2;
	}
	int minus(int n1, int n2) {
		System.out.println("차를 구하는 중");
		return n1 - n2 ;
	}
	int mul(int n1, int n2) {
		System.out.println("곱을 구하는 중");
		return n1*n2;
	}
	float div(int n1, int n2) {
		float result = 0.0f;
		if(n2 ==0) return 0.0f;
		result = n1/(float)n2;
		return result;
		/*
		if(n2 !=0) {
			result = n1/(float)n2;
		} else {
			System.out.println("0으로 나눌 수 없습니다.");
			result = 0.0f;
		}
		return result;
		*/
	}
}
