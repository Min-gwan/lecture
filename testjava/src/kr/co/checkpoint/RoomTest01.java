package kr.co.checkpoint;

import java.util.Scanner;

public class RoomTest01 {
	/*
	 * 키보드에 의한 입력작성 12개의 방이 존재 -> int[] room = new int[12]; 초기값은 0 ->예약가능, 1-> 예약불가
	 * ====반복하기=== [메뉴] 1.예약하기 2. 예약취소 3.호실보기 99.종료 select :
	 * -------------------------------- 3을 누른 경우는 호실보기 => 1이면 "예약됨:★ ", 0이면 "예약가능☆"
	 * 0번 호실 : 예약가능☆ 1번 호실 : 예약됨★ -1을 누른 경우 ->호실번호 선택 -> 예약상태여부 확인 ->예약가능상태 ->예약실시
	 * ->예약불가상태 ->메뉴로 복귀 또는 호실번호선택으로
	 */
	public static void main(String[] args) {
//		선언 및 초기화
		int select = 0;
		int[] room = new int[12];
		boolean stop = false;
//		입력 받기 위한 스캐너
		Scanner scanner = null;
//		메뉴
		while (!stop) {
			System.out.println("[Menu]");
			System.out.println("1.예약하기 2.예약취소 3.호실보기 99.종료");
			System.out.print("select>");
			scanner = new Scanner(System.in);
			select = Integer.parseInt(scanner.nextLine());
			switch(select) {
			case 1:
				int selRoom = 0;
				System.out.println("호실번호 선택");
				selRoom = Integer.parseInt(scanner.nextLine());
				if(room[selRoom]==0) {
					System.out.println(selRoom+"번 호실이 예약되었습니다.");
					room[selRoom]=1;
					break;
				} else {
					System.out.println("번 호실은 이미 예약되어 있습니다.");
					break;
				}
			case 2:
				int cancelRoom;
				System.out.println("예약 취소할 호실 입력");
				System.out.print("호실>");
				cancelRoom = Integer.parseInt(scanner.nextLine());
				if(room[cancelRoom]==1) {
					System.out.println(cancelRoom+"번 호실이 예약취소 되었습니다.");
					room[cancelRoom]=1;
					break;
				} else {
					System.out.println("번 호실은 예약되어있지 않습니다.");
					break;
				}
			case 3:
				for(int i=0;i<room.length;i++) {
					System.out.printf("%d 호실 : %s%n",i,room[i]==0?"예약가능☆":"예약됨★");
				}
				break;
			case 99:
				System.out.println("시스템 종료");
				stop = true;
				break;
				default:
					System.out.println("메뉴에 있는 번호를 선택해주세요.");
					break;
			}
			
		}

	}
}
