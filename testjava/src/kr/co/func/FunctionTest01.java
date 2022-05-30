package kr.co.func;

public class FunctionTest01 {
	private static void viewName() {
		System.out.println("홍길동");
		System.out.println("장길산");
		System.out.println("이순신");
	}
	private static void viewName(int cnt) {
		for(int i=0;i<cnt;i++) {
			System.out.println("홍길동");
			System.out.println("장길산");
			System.out.println("이순신");
		}
		System.out.println(cnt + "만큼 반복함");
	}
	private static int viewNameRt() {
		System.out.println("홍길동");
		System.out.println("장길산");
		System.out.println("이순신");
		return 1;
	}
	private static int viewNameRt(int cnt) {
		System.out.println("홍길동");
		System.out.println("장길산");
		System.out.println("이순신");
		return cnt;
	}
	public static void main(String[] args) {
//		1. 홍길동 출력 및 출력하는 기능
		viewName();
//		2. 문자열을 횟수만큼 출력
		viewName(3);
//		3.메소드 실행 후 결과값 리턴
		int sign = viewNameRt();
		if(sign==1) {
			System.out.println("제대로 실행됨");
		} else {
			System.out.println("오류");
		}
//		4. 횟수만큼 반복하고 결과값 리턴
		sign = viewNameRt(5);
		System.out.println(sign+"만큼 반복함");
	}
}
