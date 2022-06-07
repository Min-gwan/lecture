package kr.co.obj;

public class Moniter {
	/*
	 * 모니터 클래스 설계하기 -> class Moniter
	 * 1. 필드: 객체가 가지고 있는 값들 -> mName, mPrice, mDate, mPower
	 *	- 제품명, 가격, 제조일,  
	 * 2. 기능 : 객체가 해야하는 일들(행위)
	 * 	- power on/off -> turnOn(), turnOff()
	 */
//	constructor : initialize field
//	default constructor
	public Moniter(){
		System.out.println("모니터 생성");
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
		System.out.println(this.mName+"모니터 전원이 켜집니다.");
	}
	void turnOff() {
		System.out.println(this.mName+"모니터 전원이 꺼집니다.");
	}
	@Override
	public String toString() {
		return "Moniter [mName=" + mName + ", mPrice=" + mPrice + "]";
	}
	
}
