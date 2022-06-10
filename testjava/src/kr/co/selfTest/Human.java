package kr.co.selfTest;

public class Human implements Sports {
	/*
	 * -이름, 키, 몸무게
	 * -먹는다, 잔다, 공부한다, 운동한다, 휴식한다.
	 */
	private String name;
	private int length;
	private int weight;
	
	void eat(String e) {
		System.out.println(e +" 를(을) 먹는다.");
	}
	void sleeping() {
		System.out.println("당신을 잠을 자고 있습니다.");
	}
	@Override
	public void workout() {
		System.out.println("운동을 한다.");
		
	}
	@Override
	public void workout(String str) {
		System.out.println("운동을 한다.");
		
	}
	@Override
	public void rest() {
		System.out.println("휴식을 취한다.");
		
	}
	
}
