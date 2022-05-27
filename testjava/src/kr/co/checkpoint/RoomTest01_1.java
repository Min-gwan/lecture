package kr.co.checkpoint;

import java.util.Scanner;

public class RoomTest01_1 {
	public static void main(String[] args) {
//		���� �� �ʱ�ȭ
		int[] room = new int[12];
		int[] roomPrice = new int[] { 1000, 2000, 5000, 8000, 10000, 15000, 20000, 21000, 22000, 23000, 24000, 25000 };
		String[] userName = new String[12];
		String[] userPassword = new String[12];
		int select = 0;
		int money = 0;
		boolean stop = false;
//		��ĳ��
		Scanner scanner = null;
//		Menu
		while (!stop) {
			System.out.println("[Menu]");
			System.out.println("1.ȣ�Ǻ��� 2.�����ϱ� 3.������� 4.����Ȯ�� 5.����");
			System.out.print("select>");
			scanner = new Scanner(System.in);
			select = Integer.parseInt(scanner.nextLine());
			switch (select) {
			case 1:
				for (int i = 0; i < room.length; i++) {
					System.out.printf("%2d ȣ�� : ����(%d)�� %6s\t", i + 1, roomPrice[i], room[i] == 0 ? "���డ�ɡ�" : "����ʡ�");
					if(i%3==2) {
						System.out.println();
					}
				}
				break;
			case 2:
				for (int i = 0; i < room.length; i++) {
					System.out.printf("%2d ȣ�� : ����(%d)�� %6s\t", i + 1, roomPrice[i], room[i] == 0 ? "���డ�ɡ�" : "����ʡ�");
					if(i%3==2) {
						System.out.println();
					}
				}
				int selRoom = 0;
				int selMoney = 0;
				boolean stopMoney = false;
				System.out.println("ȣ�ǹ�ȣ ����");
				selRoom = Integer.parseInt(scanner.nextLine());
				if (room[selRoom-1] == 0) {
					System.out.println("�����ڸ��� �Է��ϼ���");
					userName[selRoom-1] = scanner.nextLine();
					System.out.println("��й�ȣ�� �Է��ϼ���");
					userPassword[selRoom-1] = scanner.nextLine();
					System.out.println(roomPrice[selRoom-1] + "���� �־��ּ���");
					System.out.print(">");
					selMoney = Integer.parseInt(scanner.nextLine());
					while (!stopMoney) {
						if (selMoney >= roomPrice[selRoom]) {
							room[selRoom] = 1;
							System.out.println((selRoom+1) + "�� ȣ���� ����Ǿ����ϴ�.");
							System.out.println("�ܵ��� " + (selMoney - roomPrice[selRoom]) + "�� �Դϴ�.");
							break;
						} else {
							System.out.println("�ݾ��� " + (roomPrice[selRoom] - selMoney) + "�� ���ڶ��ϴ�.");
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
				if (room[cancelRoom] == 1) {
					System.out.println("�����ڸ��� �Է��ϼ���");
					System.out.print("�����ڸ�>");
					cancelName = scanner.nextLine();
					System.out.println("��й�ȣ�� �Է��ϼ���");
					cancelPassword = scanner.nextLine();
					if (!userName[cancelRoom].equals(cancelName)) {
						System.out.println("�����ڸ��� ��ġ�����ʽ��ϴ�.");
					} else if (!userPassword[cancelRoom].equals(cancelPassword)) {
						System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
					} else {
						room[cancelRoom] = 0;
						userName[cancelRoom] = null;
						userPassword[cancelRoom] = null;
						System.out.println("����ݾ� " + roomPrice[cancelRoom] + "���� ��ȯ�Ǿ����ϴ�.");
						System.out.println(cancelRoom + "�� ȣ���� ������� �Ǿ����ϴ�.");
					}
					break;
				} else {
					System.out.println("�� ȣ���� ����Ǿ����� �ʽ��ϴ�.");
					break;
				}
			case 4:
				boolean isUser = false;
				int user = 0;
				String searchName = null;
				System.out.println("�����ڸ��� �Է��ϼ���.");
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
					System.out.println(searchName + "���� " + user + " �� �濡 ����Ǿ��ֽ��ϴ�.");
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
