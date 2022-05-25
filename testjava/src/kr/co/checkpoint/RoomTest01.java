package kr.co.checkpoint;

import java.util.Scanner;

public class RoomTest01 {
	/*
	 * Ű���忡 ���� �Է��ۼ� 12���� ���� ���� -> int[] room = new int[12]; �ʱⰪ�� 0 ->���డ��, 1-> ����Ұ�
	 * ====�ݺ��ϱ�=== [�޴�] 1.�����ϱ� 2. ������� 3.ȣ�Ǻ��� 99.���� select :
	 * -------------------------------- 3�� ���� ���� ȣ�Ǻ��� => 1�̸� "�����:�� ", 0�̸� "���డ�ɡ�"
	 * 0�� ȣ�� : ���డ�ɡ� 1�� ȣ�� : ����ʡ� -1�� ���� ��� ->ȣ�ǹ�ȣ ���� -> ������¿��� Ȯ�� ->���డ�ɻ��� ->����ǽ�
	 * ->����Ұ����� ->�޴��� ���� �Ǵ� ȣ�ǹ�ȣ��������
	 */
	public static void main(String[] args) {
//		���� �� �ʱ�ȭ
		int select = 0;
		int[] room = new int[12];
		boolean stop = false;
//		�Է� �ޱ� ���� ��ĳ��
		Scanner scanner = null;
//		�޴�
		while (!stop) {
			System.out.println("[Menu]");
			System.out.println("1.�����ϱ� 2.������� 3.ȣ�Ǻ��� 99.����");
			System.out.print("select>");
			scanner = new Scanner(System.in);
			select = Integer.parseInt(scanner.nextLine());
			switch(select) {
			case 1:
				int selRoom = 0;
				System.out.println("ȣ�ǹ�ȣ ����");
				selRoom = Integer.parseInt(scanner.nextLine());
				if(room[selRoom]==0) {
					System.out.println(selRoom+"�� ȣ���� ����Ǿ����ϴ�.");
					room[selRoom]=1;
					break;
				} else {
					System.out.println("�� ȣ���� �̹� ����Ǿ� �ֽ��ϴ�.");
					break;
				}
			case 2:
				int cancelRoom;
				System.out.println("���� ����� ȣ�� �Է�");
				System.out.print("ȣ��>");
				cancelRoom = Integer.parseInt(scanner.nextLine());
				if(room[cancelRoom]==1) {
					System.out.println(cancelRoom+"�� ȣ���� ������� �Ǿ����ϴ�.");
					room[cancelRoom]=1;
					break;
				} else {
					System.out.println("�� ȣ���� ����Ǿ����� �ʽ��ϴ�.");
					break;
				}
			case 3:
				for(int i=0;i<room.length;i++) {
					System.out.printf("%d ȣ�� : %s%n",i,room[i]==0?"���డ�ɡ�":"����ʡ�");
				}
				break;
			case 99:
				System.out.println("�ý��� ����");
				stop = true;
				break;
				default:
					System.out.println("�޴��� �ִ� ��ȣ�� �������ּ���.");
					break;
			}
			
		}

	}
}
