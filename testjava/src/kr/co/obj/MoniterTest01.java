package kr.co.obj;

public class MoniterTest01 {
	public static void main(String[] args) {
//		모니터 클래스로 객체생성하기
		Moniter m1 = new Moniter();
		m1.mName = "SAMSUNG모니터";
		m1.mPrice = 200;
		
//		m1의 전원을 켠다.
		m1.turnOn();
//		m1의 전원을 끈다.
		m1.turnOff();
		System.out.println("=============================");
		Moniter m2 = new Moniter();
		m2.mName = "LG모니터";
		m2.mPrice = 200;
		
		m2.turnOn();
		m2.turnOff();
		
		Moniter m3 = new Moniter("APPLE", 300);
		m3.turnOn();
		m3.turnOff();
	}
}
