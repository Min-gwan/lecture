package kr.co.obj;

public class Moniter {
	/*
	 * ����� Ŭ���� �����ϱ� -> class Moniter
	 * 1. �ʵ�: ��ü�� ������ �ִ� ���� -> mName, mPrice, mDate, mPower
	 *	- ��ǰ��, ����, ������,  
	 * 2. ��� : ��ü�� �ؾ��ϴ� �ϵ�(����)
	 * 	- power on/off -> turnOn(), turnOff()
	 */
//	constructor : initialize field
//	default constructor
	public Moniter(){
		System.out.println("����� ����");
	}
	public Moniter(String mName, int mPrice){
		this.mName = mName;
		this.mPrice = mPrice;
		System.out.printf("%s %d",mName,mPrice);
		System.out.println();
	}
//	field
	String mName;
	int mPrice;
//	method
	void turnOn() {
		System.out.println(this.mName+"����� ������ �����ϴ�.");
	}
	void turnOff() {
		System.out.println(this.mName+"����� ������ �����ϴ�.");
	}
	@Override
	public String toString() {
		return "Moniter [mName=" + mName + ", mPrice=" + mPrice + "]";
	}
	
}
