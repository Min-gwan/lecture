package kr.co.checkpoint;

import java.util.Scanner;

public class RoomTest01_1 {
	public static void main(String[] args) {
//		선언 및 초기화
		int[] room = new int[12];
		int[] roomPrice = new int[] { 1000, 2000, 5000, 8000, 10000, 15000, 20000, 21000, 22000, 23000, 24000, 25000 };
		String[] userName = new String[12];
		String[] userPassword = new String[12];
		int select = 0;
		int money = 0;
		boolean stop = false;
//		스캐너
		Scanner scanner = null;
//		Menu
		while (!stop) {
			System.out.println("[Menu]");
			System.out.println("1.호실보기 2.예약하기 3.예약취소 4.예약확인 5.종료");
			System.out.print("select>");
			scanner = new Scanner(System.in);
			select = Integer.parseInt(scanner.nextLine());
			switch (select) {
			case 1:
				for (int i = 0; i < room.length; i++) {
					System.out.printf("%2d 호실 : 가격(%d)원 %6s\t", i + 1, roomPrice[i], room[i] == 0 ? "예약가능☆" : "예약됨★");
					if(i%3==2) {
						System.out.println();
					}
				}
				break;
			case 2:
				for (int i = 0; i < room.length; i++) {
					System.out.printf("%2d 호실 : 가격(%d)원 %6s\t", i + 1, roomPrice[i], room[i] == 0 ? "예약가능☆" : "예약됨★");
					if(i%3==2) {
						System.out.println();
					}
				}
				int selRoom = 0;
				int selMoney = 0;
				boolean stopMoney = false;
				System.out.println("호실번호 선택");
				selRoom = Integer.parseInt(scanner.nextLine());
				if (room[selRoom-1] == 0) {
					System.out.println("예약자명을 입력하세요");
					userName[selRoom-1] = scanner.nextLine();
					System.out.println("비밀번호를 입력하세요");
					userPassword[selRoom-1] = scanner.nextLine();
					System.out.println(roomPrice[selRoom-1] + "원을 넣어주세요");
					System.out.print(">");
					selMoney = Integer.parseInt(scanner.nextLine());
					while (!stopMoney) {
						if (selMoney >= roomPrice[selRoom]) {
							room[selRoom] = 1;
							System.out.println((selRoom+1) + "번 호실이 예약되었습니다.");
							System.out.println("잔돈은 " + (selMoney - roomPrice[selRoom]) + "원 입니다.");
							break;
						} else {
							System.out.println("금액이 " + (roomPrice[selRoom] - selMoney) + "원 모자랍니다.");
							System.out.println("추가 금액을 넣어주세요");
							System.out.print(">");
							selMoney += Integer.parseInt(scanner.nextLine());
						}
					}
					break;
				} else {
					System.out.println("번 호실은 이미 예약되어 있습니다.");
					break;
				}
			case 3:
				int cancelRoom;
				String cancelName;
				String cancelPassword;
				System.out.println("예약 취소할 호실 입력");
				System.out.print("호실>");
				cancelRoom = Integer.parseInt(scanner.nextLine());
				if (room[cancelRoom] == 1) {
					System.out.println("예약자명을 입력하세요");
					System.out.print("예약자명>");
					cancelName = scanner.nextLine();
					System.out.println("비밀번호를 입력하세요");
					cancelPassword = scanner.nextLine();
					if (!userName[cancelRoom].equals(cancelName)) {
						System.out.println("예약자명이 일치하지않습니다.");
					} else if (!userPassword[cancelRoom].equals(cancelPassword)) {
						System.out.println("비밀번호가 일치하지 않습니다.");
					} else {
						room[cancelRoom] = 0;
						userName[cancelRoom] = null;
						userPassword[cancelRoom] = null;
						System.out.println("예약금액 " + roomPrice[cancelRoom] + "원이 반환되었습니다.");
						System.out.println(cancelRoom + "번 호실이 예약취소 되었습니다.");
					}
					break;
				} else {
					System.out.println("번 호실은 예약되어있지 않습니다.");
					break;
				}
			case 4:
				boolean isUser = false;
				int user = 0;
				String searchName = null;
				System.out.println("예약자명을 입력하세요.");
				System.out.print(">");
				searchName = scanner.nextLine();
				for (int i = 0; i < userName.length; i++) {
					if (userName[i] == searchName) {
						isUser = true;
						user = i;
						break;
					}
				}
				if (isUser) {
					System.out.println(searchName + "님은 " + user + " 번 방에 예약되어있습니다.");
				} else {
					System.out.println(searchName + "님은 예약되어 있지 않습니다.");
				}
				break;
			case 5:
				System.out.println("시스템 종료");
				stop = true;
				break;
			default:
				System.out.println("메뉴 번호를 다시 확인해주세요");

			}
		}

	}
}
