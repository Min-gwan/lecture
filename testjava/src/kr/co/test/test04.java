package kr.co.test;

public class test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//랜덤수(난수) 입력받기
		//Math.random() -> 0.0 ~0.9999 중에 하나의  실수를 랜덤으로~
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		
		//정수로 형변환 0~4
		System.out.println((int)(Math.random()*5));
		System.out.println((int)(Math.random()*5));
		System.out.println((int)(Math.random()*5));
		
		
//		(int)(Math.random()*5) + 1  -> 1~5
		
		//1 ~ 45 까지의 난수를 구하세요
//		System.out.println(((int)(Math.random()*9)+1)*5);
		System.out.println((int)(Math.random()*45) + 1);
		//13 ~ 15까지의 난수를 구하세요
		System.out.println((int)(Math.random()*3) + 13); //앞의 수는 범위, 뒤의 수는 처음수
		//실수(float) -> 정수(int,long) 변환 
//		(int) : 캐스팅 연산자
		
	}

}
