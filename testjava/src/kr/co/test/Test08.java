package kr.co.test;

import java.util.Scanner;

public class Test08 {
	
	public static void main(String[] args) {

		// TODO Auto-generated method stub
//		문제 
//		두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
//		입력 
//		첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
//		출력 
//		첫째 줄에 다음 세 가지 중 하나를 출력한다.
//		A가 B보다 큰 경우에는 '>'를 출력한다.
//		A가 B보다 작은 경우에는 '<'를 출력한다.
//		A와 B가 같은 경우에는 '=='를 출력한다.
		
		int num1 = 0;
		int num2 = 0;
		char msg = ' ';
		Scanner scan = new Scanner(System.in);
		
		System.out.print("두 수를 입력하세요. : ");
		
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		if(num1 > num2) {
			msg='>';
		} else if(num1 < num2) {
			msg='<';
		} else {
			msg='=';
		}
		System.out.println(msg);

/*		
//		문제 
//		연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
//		윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
//		예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다. 하지만, 2000년은 400의 배수이기 때문에 윤년이다.
//		입력 
//		첫째 줄에 연도가 주어진다. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.
//		출력 
//		첫째 줄에 윤년이면 1, 아니면 0을 출력한다
		
		int year = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("연도를 입력하세요. : ");
		year = scan.nextInt();
		
		if (1 <= year && year <= 4000) {
			if( (year%4==0 && year%100 != 0) || year%400 == 0 ) {		//윤년이면 1을 출력
				System.out.println("1");
			} else {													//윤년이 아니면 0을 출력
				System.out.println("0");
			}
		} else {
			System.out.println("1과 4000 사이의 자연수를 입력하세요.");
		}
*/		
/*	
//		문제 
//		흔한 수학 문제 중 하나는 주어진 점이 어느 사분면에 속하는지 알아내는 것이다. 사분면은 아래 그림처럼 1부터 4까지 번호를 갖는다. "Quadrant n"은 "제n사분면"이라는 뜻이다.
//
//		예를 들어, 좌표가 (12, 5)인 점 A는 x좌표와 y좌표가 모두 양수이므로 제1사분면에 속한다. 점 B는 x좌표가 음수이고 y좌표가 양수이므로 제2사분면에 속한다.
//		점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오. 단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다.
//		입력 
//		첫 줄에는 정수 x가 주어진다. (−1000 ≤ x ≤ 1000; x ≠ 0) 다음 줄에는 정수 y가 주어진다. (−1000 ≤ y ≤ 1000; y ≠ 0)
//		출력 
//		점 (x, y)의 사분면 번호(1, 2, 3, 4 중 하나)를 출력한다.
		
		int x = 0, y = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("x좌표를 입력하세요. : ");
		x = scan.nextInt();
		System.out.print("y좌표를 입력하세요. : ");
		y = scan.nextInt();
		
		if(x ==0 || y == 0) {
			System.out.println("범위에 맞지 않는 입력값 입니다. (정수 : −1000 ≤ x ≤ 1000; x ≠ 0) ");
		} else {
			if(x > 0) {
				if(y > 0) {			//1사분면
					System.out.println("1");
				} else {			//4사분면
					System.out.println("4");
				}
			} else {		
				if(y > 0) {			//2사분면
					System.out.println("2");
				} else {			//3사분면
					System.out.println("3");
				}
			}
		} 		//end
*/
/*		
//		문제
//		1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다. 
//		같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
//		같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
//		모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  
//		예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다. 또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.
//		3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
//		입력 
//		첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어진다. 
//		출력 
//		첫째 줄에 게임의 상금을 출력 한다.
		
		int fst = 0, sec = 0, trd = 0; 
		int money, tmp = 0;	//상금,주사위 숫자
		
		Scanner scan = new Scanner(System.in);
		System.out.print("주사위의 세가지 수를 입력하세요.");
		fst = scan.nextInt();
		sec = scan.nextInt();
		trd = scan.nextInt();
		
		System.out.println(""+fst+""+sec+""+trd);

		 if(fst == sec && sec == trd) {							//셋다 같은 경우
			 money = 10000+fst*1000;
		 } else if (fst == sec || sec == trd || fst == trd) {	//두개만 같은 경우
			 if( fst == sec) tmp = fst;
			 if( sec == trd) tmp = sec;
			 if( fst == trd) tmp = trd;
			 money = 1000+tmp*100; 
		 } else {												//모두다른경우
			 tmp = Math.max(fst, Math.max(sec,trd));
			 money = tmp*100; 
		 }
		System.out.println("상금액 : "+money);
		
*
*/
		
//		문제 
//		KOI 전자에서는 건강에 좋고 맛있는 훈제오리구이 요리를 간편하게 만드는 인공지능 오븐을 개발하려고 한다. 인공지능 오븐을 사용하는 방법은 적당한 양의 오리 훈제 재료를 인공지능 오븐에 넣으면 된다. 그러면 인공지능 오븐은 오븐구이가 끝나는 시간을 분 단위로 자동적으로 계산한다. 
//		또한, KOI 전자의 인공지능 오븐 앞면에는 사용자에게 훈제오리구이 요리가 끝나는 시각을 알려 주는 디지털 시계가 있다. 
//		훈제오리구이를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 분단위로 주어졌을 때, 오븐구이가 끝나는 시각을 계산하는 프로그램을 작성하시오.
//		입력 
//		첫째 줄에는 현재 시각이 나온다. 현재 시각은 시 A (0 ≤ A ≤ 23) 와 분 B (0 ≤ B ≤ 59)가 정수로 빈칸을 사이에 두고 순서대로 주어진다. 두 번째 줄에는 요리하는 데 필요한 시간 C (0 ≤ C ≤ 1,000)가 분 단위로 주어진다. 
//		출력 
//		첫째 줄에 종료되는 시각의 시와 분을 공백을 사이에 두고 출력한다. (단, 시는 0부터 23까지의 정수, 분은 0부터 59까지의 정수이다. 디지털 시계는 23시 59분에서 1분이 지나면 0시 0분이 된다.)
/*		
		int inpTime = 0, inpMint = 0, inpNeedMint = 0;
		int time = 0, mint = 0;
		String msg = "";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("현재시각과 필요한 시간을 분단위로 입력하세요. : ");
		inpTime = scan.nextInt();			//입력한 현재 시
		inpMint = scan.nextInt();			//입력한 현재 분
		inpNeedMint = scan.nextInt();		//입력한 조리시간(분단위)
		
		time = inpNeedMint/60;				//소요되는 조리시간(시)
		mint = inpNeedMint%60;				//소요되는 조리시간(분)
		System.out.printf("소요되는 조리시간 : %d 시 %d 분",time,mint);
		
		time = inpTime + time;				//조리가 끝나는 시간(시)
		mint = inpMint + mint; 				//조리가 끝나는 시간(분)
		System.out.printf("조리가 끝나는 시간 : %d 시 %d 분",time,mint);		
		if (time > 23) {
			time = time - 24;
		}
		
		if (mint > 59) {
			mint = mint - 60;
		} else {
		}
		
		System.out.println(time+"시"+mint+"분");
		*/
	}

}
