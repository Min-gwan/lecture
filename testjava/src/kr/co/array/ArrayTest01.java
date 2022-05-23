package kr.co.array;

public class ArrayTest01 {
	public static void main(String[] args) {
//		10명의 학생 이름을 등록하고 출력해보자. 
//		1. 배열의 선언 및 초기화
		String[] sName = new String[5];
//		2. 배열의 값 입력하기
		sName[0] = "Hong";
		sName[1] = "Kim";
		sName[2] = "Park";
		sName[3] = "Yi";
		sName[4] = "Yoon";
//		2_1 length of array
		System.out.println(sName.length);
//		3. 배열의 값 출력하기
		System.out.println("1번 학생: " + sName[0]);
		System.out.println("2번 학생: " + sName[1]);
		System.out.println("3번 학생: " + sName[2]);
		System.out.println("4번 학생: " + sName[3]);
		System.out.println("5번 학생: " + sName[4]);
	}
}
