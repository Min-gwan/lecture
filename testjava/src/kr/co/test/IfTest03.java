/*
 * 주사위를 굴려서
 * 1 이면 => 100원 당첨!
 * 2 이면 => 200원 당첨!
 * 3 이면 => 300원 당첨!
 * 4 이면 => 400원 당첨!
 * 5 이면 => 500원 당첨!
 * 6 이면 => 10000원 당첨!
 * 프로그램을 작성하시오.
 * 
 * */


package kr.co.test;

public class IfTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dice = 0;
		String msg = null;
		
		dice = ((int)Math.random()*6)+1;
		
		if(dice == 1) {			//주사위가 1이라면
			msg = "100원 당첨";
		} else if(dice==2){		//주사위가 2이라면
			msg = "200원 당첨";
		} else if(dice==3) {	//주사위가 3이라면
			msg = "300원 당첨";
		} else if(dice==4) {	//주사위가 4이라면
			msg = "400원 당첨";
		} else if(dice==5) {	//주사위가 5이라면
			msg = "500원 당첨";
		} else {				//주사위가 6이라면
			msg = "10000원 당첨";
		}
		System.out.println("당신의 주사위는 " + dice + "이고");
		System.out.println(msg+ "축하드립니다.!!");
		System.out.println("Program End !!!!");
		
		
	}

}
