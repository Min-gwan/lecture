package kr.co.obj;

public class MoniterTest01 {
	public static void main(String[] args) {
//		����� Ŭ������ ��ü�����ϱ�
		Moniter m1 = new Moniter();
		m1.mName = "SAMSUNG�����";
		m1.mPrice = 200;
		
//		m1�� ������ �Ҵ�.
		m1.turnOn();
//		m1�� ������ ����.
		m1.turnOff();
		System.out.println("=============================");
		Moniter m2 = new Moniter();
		m2.mName = "LG�����";
		m2.mPrice = 200;
		
		m2.turnOn();
		m2.turnOff();
		
		Moniter m3 = new Moniter("APPLE", 300);
		m3.turnOn();
		m3.turnOff();
	}
}
