package kr.co.checkpoint;

import java.util.Scanner;

public class RoomTest1_2 {
	public static void main(String[] args) {
//		선언 및 초기화
		int[] roomState = new int[50];
		int[] roomNumber = new int[50];
		int[] roomPrice = new int[50];
		int[] roomGrade = new int[50];
		String[] reserveName = new String[50];
		String[] reservePassword = new String[50];
		int select = 0;
		int safe = 0;
		boolean stop = false;

//		room grade
		final int standard = 1;
		final int superior = 2;
		final int deluxe = 3;
		final int executive = 4;
		final int suite = 5;

//		room price
		final int priceStan = 50000;
		final int priceSuper = 80000;
		final int priceDelux = 120000;
		final int priceExecu = 150000;
		final int priceSuite = 250000;
//		스캐너
		Scanner scanner = null;

//		program start
//		기본값 설정
		for (int i = 0; i < roomNumber.length; i++) {
			if (i / 10 == 0) {
				roomNumber[i] = i + 1;
				roomPrice[i] = priceStan;
				roomGrade[i] = standard;
			} else if (i / 10 == 1) {
				roomNumber[i] = i + 1;
				roomPrice[i] = priceSuper;
				roomGrade[i] = superior;
			} else if (i / 10 == 2) {
				roomNumber[i] = i + 1;
				roomPrice[i] = priceDelux;
				roomGrade[i] = deluxe;
			} else if (i / 10 == 3) {
				roomNumber[i] = i + 1;
				roomPrice[i] = priceExecu;
				roomGrade[i] = executive;
			} else if (i / 10 == 4) {
				roomNumber[i] = i + 1;
				roomPrice[i] = priceSuite;
				roomGrade[i] = suite;
			}
		}
//		Menu
		while (!stop) {
			System.out.println("[Menu]");
			System.out.println("1.호실현황 2.예약하기 3.예약취소 4.예약확인 5.종료");
			System.out.print("select>");
			scanner = new Scanner(System.in);
			select = Integer.parseInt(scanner.nextLine());
			switch (select) {
			case 1:
				boolean menuState = false;
				while (!menuState) {
					int selectMenu1 = 0;
					System.out.println("1.전체 호실 현항 2.등급별 호실 현황 3.상위메뉴로");
					System.out.print("select>");
					selectMenu1 = Integer.parseInt(scanner.nextLine());
					if (selectMenu1 == 1) {
						for (int i = 0; i < roomNumber.length; i++) {
							System.out.printf("%2d호실 등급:%2d 가격(%6d)원 %s\t", i + 1, roomGrade[i], roomPrice[i],
									roomState[i] == 0 ? "예약가능☆" : "예약됨★ ");
							if (i % 10 == 9) {
								System.out.println();
							}
						}
						System.out.println("등급- 1.standard 2.superior 3.deluxe 4.executive 5.suite");
						System.out.println();
					} else if (selectMenu1 == 2) {
						int selectMenu1Inner = 0;
						System.out.println("원하시는 등급을 선택하세요");
						System.out.println("1.standard 2.superior 3.deluxe 4.executive 5.suite");
						System.out.print(">");
						selectMenu1Inner = Integer.parseInt(scanner.nextLine());
						if (selectMenu1Inner == 1) {
							for (int i = 0; i < 10; i++) {
								System.out.printf("%2d호실 등급:%2d 가격(%6d)원 %s\t", i + 1, roomGrade[i], roomPrice[i],
										roomState[i] == 0 ? "예약가능☆" : "예약됨★ ");
								if (i % 3 == 2) {
									System.out.println();
								}
							}
						} else if(selectMenu1Inner==2) {
							for (int i = 10; i < 20; i++) {
								System.out.printf("%2d호실 등급:%2d 가격(%6d)원 %s\t", i + 1, roomGrade[i], roomPrice[i],
										roomState[i] == 0 ? "예약가능☆" : "예약됨★ ");
								if (i % 3 == 2) {
									System.out.println();
								}
							}
						}  else if(selectMenu1Inner==3) {
							for (int i = 20; i < 30; i++) {
								System.out.printf("%2d호실 등급:%2d 가격(%6d)원 %s\t", i + 1, roomGrade[i], roomPrice[i],
										roomState[i] == 0 ? "예약가능☆" : "예약됨★ ");
								if (i % 3 == 2) {
									System.out.println();
								}
							}
						}	else if(selectMenu1Inner==4) {
							for (int i = 30; i < 40; i++) {
								System.out.printf("%2d호실 등급:%2d 가격(%6d)원 %s\t", i + 1, roomGrade[i], roomPrice[i],
										roomState[i] == 0 ? "예약가능☆" : "예약됨★ ");
								if (i % 3 == 2) {
									System.out.println();
								}
							}
						} else if(selectMenu1Inner==5) {
							for (int i = 40; i < 50; i++) {
								System.out.printf("%2d호실 등급:%2d 가격(%6d)원 %s\t", i + 1, roomGrade[i], roomPrice[i],
										roomState[i] == 0 ? "예약가능☆" : "예약됨★ ");
								if (i % 3 == 2) {
									System.out.println();
								}
							}
						}
						System.out.println();
					} else if (selectMenu1 == 3) {
						menuState = true;
					} else {
						System.out.println("메뉴에 있는 번호를 선택해주세요.");
					}
				}

				break;
			case 2:
				int selRoom = 0;
				int selMoney = 0;
				boolean stopMoney = false;
				System.out.println("호실번호 선택");
				selRoom = Integer.parseInt(scanner.nextLine());
				if (roomState[selRoom - 1] == 0) {
					System.out.println("예약자명을 입력하세요");
					reserveName[selRoom - 1] = scanner.nextLine();
					System.out.println("비밀번호를 입력하세요");
					reservePassword[selRoom - 1] = scanner.nextLine();
					System.out.println(roomPrice[selRoom - 1] + "원을 넣어주세요");
					System.out.print(">");
					selMoney = Integer.parseInt(scanner.nextLine());
					while (!stopMoney) {
						if (selMoney >= roomPrice[selRoom - 1]) {
							roomState[selRoom - 1] = 1;
							safe += roomPrice[selRoom-1];
							System.out.println(selRoom + "번 호실이 예약되었습니다.");
							System.out.println("잔돈은 " + (selMoney - roomPrice[selRoom - 1]) + "원 입니다.");
							break;
						} else {
							System.out.println("금액이 " + (roomPrice[selRoom - 1] - selMoney) + "원 모자랍니다.");
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
				if (roomState[cancelRoom - 1] == 1) {
					System.out.println("예약자명을 입력하세요");
					System.out.print("예약자명>");
					cancelName = scanner.nextLine();
					System.out.println("비밀번호를 입력하세요");
					cancelPassword = scanner.nextLine();
					if (!reserveName[cancelRoom - 1].equals(cancelName)) {
						System.out.println("예약자명이 일치하지않습니다.");
					} else if (!reservePassword[cancelRoom - 1].equals(cancelPassword)) {
						System.out.println("비밀번호가 일치하지 않습니다.");
					} else {
						roomState[cancelRoom - 1] = 0;
						reserveName[cancelRoom - 1] = null;
						reservePassword[cancelRoom - 1] = null;
						safe -= roomPrice[cancelRoom-1];
						System.out.println("예약금액 " + roomPrice[cancelRoom - 1] + "원이 반환되었습니다.");
						System.out.println(cancelRoom + "번 호실이 예약취소 되었습니다.");
					}
					break;
				} else {
					System.out.println(cancelRoom + "번 호실은 예약되어있지 않습니다.");
					break;
				}
			case 4:
				boolean isUser = false;
				int user = 0;
				String searchName = null;
				System.out.println("예약자명을 입력하세요.");
				System.out.print(">");
				searchName = scanner.nextLine();
				for (int i = 0; i < reserveName.length; i++) {
					if (reserveName[i] != null) {
						if (reserveName[i].equals(searchName)) {
							isUser = true;
							user = i;
							break;
						}
					}
				}
				if (isUser) {
					System.out.println(searchName + "님은 " + (user + 1) + " 번 방에 예약되어있습니다.");
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
