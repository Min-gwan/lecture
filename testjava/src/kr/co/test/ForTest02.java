package kr.co.test;

public class ForTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~10������ �� ���ϱ�
		int sum = 0;
		
		for(int i =1; i <=10; i++) {
			sum += i;
//			��� : i = ? �϶� sum = ?
			System.out.printf("i = %d, sum = %d \n",i,sum);
			System.out.println("i = "+i+"sum = "+sum);
		}
		System.out.println("1~10������ �� : "+sum);
	}
	

}
