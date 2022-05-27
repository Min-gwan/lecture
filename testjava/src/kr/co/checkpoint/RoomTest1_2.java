package kr.co.checkpoint;

import java.util.Scanner;

public class RoomTest1_2 {
	public static void main(String[] args) {
//		���� �� �ʱ�ȭ
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
//		��ĳ��
		Scanner scanner = null;

//		program start
//		�⺻�� ����
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
			System.out.println("1.ȣ����Ȳ 2.�����ϱ� 3.������� 4.����Ȯ�� 5.����");
			System.out.print("select>");
			scanner = new Scanner(System.in);
			select = Integer.parseInt(scanner.nextLine());
			switch (select) {
			case 1:
				boolean menuState = false;
				while (!menuState) {
					int selectMenu1 = 0;
					System.out.println("1.��ü ȣ�� ���� 2.��޺� ȣ�� ��Ȳ 3.�����޴���");
					System.out.print("select>");
					selectMenu1 = Integer.parseInt(scanner.nextLine());
					if (selectMenu1 == 1) {
						for (int i = 0; i < roomNumber.length; i++) {
							System.out.printf("%2dȣ�� ���:%2d ����(%6d)�� %s\t", i + 1, roomGrade[i], roomPrice[i],
									roomState[i] == 0 ? "���డ�ɡ�" : "����ʡ� ");
							if (i % 10 == 9) {
								System.out.println();
							}
						}
						System.out.println("���- 1.standard 2.superior 3.deluxe 4.executive 5.suite");
						System.out.println();
					} else if (selectMenu1 == 2) {
						int selectMenu1Inner = 0;
						System.out.println("���Ͻô� ����� �����ϼ���");
						System.out.println("1.standard 2.superior 3.deluxe 4.executive 5.suite");
						System.out.print(">");
						selectMenu1Inner = Integer.parseInt(scanner.nextLine());
						if (selectMenu1Inner == 1) {
							for (int i = 0; i < 10; i++) {
								System.out.printf("%2dȣ�� ���:%2d ����(%6d)�� %s\t", i + 1, roomGrade[i], roomPrice[i],
										roomState[i] == 0 ? "���డ�ɡ�" : "����ʡ� ");
								if (i % 3 == 2) {
									System.out.println();
								}
							}
						} else if(selectMenu1Inner==2) {
							for (int i = 10; i < 20; i++) {
								System.out.printf("%2dȣ�� ���:%2d ����(%6d)�� %s\t", i + 1, roomGrade[i], roomPrice[i],
										roomState[i] == 0 ? "���డ�ɡ�" : "����ʡ� ");
								if (i % 3 == 2) {
									System.out.println();
								}
							}
						}  else if(selectMenu1Inner==3) {
							for (int i = 20; i < 30; i++) {
								System.out.printf("%2dȣ�� ���:%2d ����(%6d)�� %s\t", i + 1, roomGrade[i], roomPrice[i],
										roomState[i] == 0 ? "���డ�ɡ�" : "����ʡ� ");
								if (i % 3 == 2) {
									System.out.println();
								}
							}
						}	else if(selectMenu1Inner==4) {
							for (int i = 30; i < 40; i++) {
								System.out.printf("%2dȣ�� ���:%2d ����(%6d)�� %s\t", i + 1, roomGrade[i], roomPrice[i],
										roomState[i] == 0 ? "���డ�ɡ�" : "����ʡ� ");
								if (i % 3 == 2) {
									System.out.println();
								}
							}
						} else if(selectMenu1Inner==5) {
							for (int i = 40; i < 50; i++) {
								System.out.printf("%2dȣ�� ���:%2d ����(%6d)�� %s\t", i + 1, roomGrade[i], roomPrice[i],
										roomState[i] == 0 ? "���డ�ɡ�" : "����ʡ� ");
								if (i % 3 == 2) {
									System.out.println();
								}
							}
						}
						System.out.println();
					} else if (selectMenu1 == 3) {
						menuState = true;
					} else {
						System.out.println("�޴��� �ִ� ��ȣ�� �������ּ���.");
					}
				}

				break;
			case 2:
				int selRoom = 0;
				int selMoney = 0;
				boolean stopMoney = false;
				System.out.println("ȣ�ǹ�ȣ ����");
				selRoom = Integer.parseInt(scanner.nextLine());
				if (roomState[selRoom - 1] == 0) {
					System.out.println("�����ڸ��� �Է��ϼ���");
					reserveName[selRoom - 1] = scanner.nextLine();
					System.out.println("��й�ȣ�� �Է��ϼ���");
					reservePassword[selRoom - 1] = scanner.nextLine();
					System.out.println(roomPrice[selRoom - 1] + "���� �־��ּ���");
					System.out.print(">");
					selMoney = Integer.parseInt(scanner.nextLine());
					while (!stopMoney) {
						if (selMoney >= roomPrice[selRoom - 1]) {
							roomState[selRoom - 1] = 1;
							safe += roomPrice[selRoom-1];
							System.out.println(selRoom + "�� ȣ���� ����Ǿ����ϴ�.");
							System.out.println("�ܵ��� " + (selMoney - roomPrice[selRoom - 1]) + "�� �Դϴ�.");
							break;
						} else {
							System.out.println("�ݾ��� " + (roomPrice[selRoom - 1] - selMoney) + "�� ���ڶ��ϴ�.");
							System.out.println("�߰� �ݾ��� �־��ּ���");
							System.out.print(">");
							selMoney += Integer.parseInt(scanner.nextLine());
						}
					}
					break;
				} else {
					System.out.println("�� ȣ���� �̹� ����Ǿ� �ֽ��ϴ�.");
					break;
				}
			case 3:
				int cancelRoom;
				String cancelName;
				String cancelPassword;
				System.out.println("���� ����� ȣ�� �Է�");
				System.out.print("ȣ��>");
				cancelRoom = Integer.parseInt(scanner.nextLine());
				if (roomState[cancelRoom - 1] == 1) {
					System.out.println("�����ڸ��� �Է��ϼ���");
					System.out.print("�����ڸ�>");
					cancelName = scanner.nextLine();
					System.out.println("��й�ȣ�� �Է��ϼ���");
					cancelPassword = scanner.nextLine();
					if (!reserveName[cancelRoom - 1].equals(cancelName)) {
						System.out.println("�����ڸ��� ��ġ�����ʽ��ϴ�.");
					} else if (!reservePassword[cancelRoom - 1].equals(cancelPassword)) {
						System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
					} else {
						roomState[cancelRoom - 1] = 0;
						reserveName[cancelRoom - 1] = null;
						reservePassword[cancelRoom - 1] = null;
						safe -= roomPrice[cancelRoom-1];
						System.out.println("����ݾ� " + roomPrice[cancelRoom - 1] + "���� ��ȯ�Ǿ����ϴ�.");
						System.out.println(cancelRoom + "�� ȣ���� ������� �Ǿ����ϴ�.");
					}
					break;
				} else {
					System.out.println(cancelRoom + "�� ȣ���� ����Ǿ����� �ʽ��ϴ�.");
					break;
				}
			case 4:
				boolean isUser = false;
				int user = 0;
				String searchName = null;
				System.out.println("�����ڸ��� �Է��ϼ���.");
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
					System.out.println(searchName + "���� " + (user + 1) + " �� �濡 ����Ǿ��ֽ��ϴ�.");
				} else {
					System.out.println(searchName + "���� ����Ǿ� ���� �ʽ��ϴ�.");
				}
				break;
			case 5:
				System.out.println("�ý��� ����");
				stop = true;
				break;
			default:
				System.out.println("�޴� ��ȣ�� �ٽ� Ȯ�����ּ���");

			}
		}
	}
}
