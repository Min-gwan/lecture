package kr.co.checkpoint;

import java.util.Scanner;

public class VendingMachine04 {
	public static void main(String[] args) {
//		user variable
		String userInput = null;
		String userSelcect = null;

		int parseInput = 0;
		int parseSelect = 0;

//		master variable

//		about product

//		product name
		String[] productName = new String[5];

//		product price
		int[] productPrice = new int[5];

//		product stock
		int[] productStock = new int[5];

//		on sale
		boolean[] productOnsale = new boolean[5];

//		state
		int state = 0;
		final int SUCCESS = 1;
		final int SUCCESS_MENU = 2;
		final int ERROR_LACKOFMONEY = -1;
		final int ERROR_LACKOFSTOCK = -2;
		final int ERROR_MiSSTYPE = -3;

//		safe
		int masterTotalMoney = 100000;

//		administration variable
		String adminAccount = "admin01";
		String adminPassword = "1234";

		int adminSelect = 0;
//		needed to process
		Scanner scanner = null;

//		process start

//		press start button
		System.out.println("===========================");
		System.out.println("Java Vending Machine Start");
		System.out.println("==========================");
		System.out.println();
		System.out.println();

//		Ready To Start
//		variable initialization
		productName[0] = "Moster";
		productName[1] = "Hot-Six";
		productName[2] = "Coca-Cola";
		productName[3] = "Pepsi";
		productName[4] = "Cider";

		productPrice[0] = 3000;
		productPrice[1] = 2500;
		productPrice[2] = 1600;
		productPrice[3] = 1500;
		productPrice[4] = 1300;

		productStock[0] = 100;
		productStock[1] = 100;
		productStock[2] = 100;
		productStock[3] = 100;
		productStock[4] = 100;

		productOnsale[0] = true;
		productOnsale[1] = true;
		productOnsale[2] = true;
		productOnsale[3] = true;
		productOnsale[4] = true;

		scanner = new Scanner(System.in);
		state = SUCCESS;

//		Main logic Start
		while (state == SUCCESS) {
			System.out.println("Insert The Money. Plz use only number.");
			System.out.print(">");
			userInput = scanner.nextLine();
			for (int i = 0; i < userInput.length(); i++) {
				char charToIdentifier = userInput.charAt(i);
				if (charToIdentifier < 48 || charToIdentifier > 57) {
					state = ERROR_MiSSTYPE;
					break;
				}
			}
			if (state == SUCCESS) {
				parseInput = Integer.parseInt(userInput);
				state = SUCCESS_MENU;
			}
			while (state == ERROR_MiSSTYPE) {
				System.out.println("Don't Use Charcter");
				System.out.print(">");
				userInput = scanner.nextLine();
				for (int i = 0; i < userInput.length(); i++) {
					char charToIdentify = userInput.charAt(i);
					if (charToIdentify < 48 || charToIdentify > 57) {
						state = ERROR_MiSSTYPE;
						break;
					} else {
						state = SUCCESS;
					}
				}
				if (state == SUCCESS) {
					parseInput = Integer.parseInt(userInput);
					state = SUCCESS_MENU;
				}
			}
			System.out.println("parse:" + parseInput);
			System.out.println();
			System.out.println();
//			Menu Console and Select
			while (state == SUCCESS_MENU) {
				System.out.println("=======================================");
				System.out.println("Menu Information");
				for (int i = 0; i < productName.length; i++) {
					System.out.printf("%d.%s\tprice:%d\tOnsale:%b%n", i + 1, productName[i], productPrice[i],
							productOnsale[i]);
				}
				System.out.println("balance>"+parseInput);
				System.out.println();
				System.out.print("Select number>");
				userSelcect = scanner.nextLine();
				parseSelect = Integer.parseInt(userSelcect);
//			provide process
				switch (parseSelect) {
				case 1:
					if(parseInput>=productPrice[0]) {
						int oneMore = 0;
						System.out.println(productName[0]+" ���� ����");
						productStock[0]-= 1;
						parseInput-=productPrice[0];
						System.out.println("�߰� �ֹ��Ͻðڽ��ϱ�?");
						System.out.println("balance>"+parseInput);
						System.out.print("1.Yes 2.No");
						System.out.print(">");
						oneMore =Integer.parseInt(scanner.nextLine());
						if(oneMore == 1) {
							break;							
						} else {
							masterTotalMoney -= parseInput;
							System.out.println(parseInput+"���� ��ȯ�մϴ�.");
							break;
						}
					} else {
						boolean stop = false;
						int menuSelect = 0;
						System.out.println("�ݾ��� �����մϴ�. ������ �ݾ�:"+(productPrice[0]-parseInput));
						while(!stop) {
							System.out.println("�޴��� �������ּ���.");
							System.out.println("1.�ݾ� �����ϱ� 2.�����޴���");
							menuSelect = Integer.parseInt(scanner.nextLine());
							if(menuSelect==1) {
								boolean stopInner = false;
								while(!stopInner) {
									System.out.println("�ʿ��� �ݾ�: "+ (productPrice[0]-parseInput));
									System.out.print(">");									
								}
								
							}
						}
					}
				case 2:
					if(parseInput>=productPrice[1]) {
						int oneMore = 0;
						System.out.println(productName[1]+" ���� ����");
						productStock[1]-= 1;
						parseInput-=productPrice[1];
						System.out.println("�߰� �ֹ��Ͻðڽ��ϱ�?");
						System.out.println("balance>"+parseInput);
						System.out.print("1.Yes 2.No");
						System.out.print(">");
						oneMore =Integer.parseInt(scanner.nextLine());
						if(oneMore == 1) {
							break;							
						} else {
							masterTotalMoney -= parseInput;
							System.out.println(parseInput+"���� ��ȯ�մϴ�.");
							break;
						}
					} else {
						boolean stop = false;
						int menuSelect = 0;
						System.out.println("�ݾ��� �����մϴ�. ������ �ݾ�:"+(productPrice[1]-parseInput));
						while(!stop) {
							System.out.println("�޴��� �������ּ���.");
							System.out.println("1.�ݾ� �����ϱ� 2.�����޴���");
							menuSelect = Integer.parseInt(scanner.nextLine());
							if(menuSelect==1) {
								boolean stopInner = false;
								while(!stopInner) {
									System.out.println("�ʿ��� �ݾ�: "+ (productPrice[1]-parseInput));
									System.out.print(">");									
								}
								
							}
						}
					}
				case 3:
					if(parseInput>=productPrice[2]) {
						int oneMore = 0;
						System.out.println(productName[2]+" ���� ����");
						productStock[2]-= 1;
						parseInput-=productPrice[2];
						System.out.println("�߰� �ֹ��Ͻðڽ��ϱ�?");
						System.out.println("balance>"+parseInput);
						System.out.print("1.Yes 2.No");
						System.out.print(">");
						oneMore =Integer.parseInt(scanner.nextLine());
						if(oneMore == 1) {
							break;							
						} else {
							masterTotalMoney -= parseInput;
							System.out.println(parseInput+"���� ��ȯ�մϴ�.");
							break;
						}
					} else {
						boolean stop = false;
						int menuSelect = 0;
						System.out.println("�ݾ��� �����մϴ�. ������ �ݾ�:"+(productPrice[2]-parseInput));
						while(!stop) {
							System.out.println("�޴��� �������ּ���.");
							System.out.println("1.�ݾ� �����ϱ� 2.�����޴���");
							menuSelect = Integer.parseInt(scanner.nextLine());
							if(menuSelect==1) {
								boolean stopInner = false;
								while(!stopInner) {
									System.out.println("�ʿ��� �ݾ�: "+ (productPrice[2]-parseInput));
									System.out.print(">");									
								}
								
							}
						}
					}
				case 4:
					if(parseInput>=productPrice[3]) {
					int oneMore = 0;
					System.out.println(productName[3]+" ���� ����");
					productStock[3]-= 1;
					parseInput-=productPrice[3];
					System.out.println("�߰� �ֹ��Ͻðڽ��ϱ�?");
					System.out.println("balance>"+parseInput);
					System.out.print("1.Yes 2.No");
					System.out.print(">");
					oneMore =Integer.parseInt(scanner.nextLine());
					if(oneMore == 1) {
						break;							
					} else {
						masterTotalMoney -= parseInput;
						System.out.println(parseInput+"���� ��ȯ�մϴ�.");
						break;
					}
				} else {
					boolean stop = false;
					int menuSelect = 0;
					System.out.println("�ݾ��� �����մϴ�. ������ �ݾ�:"+(productPrice[3]-parseInput));
					while(!stop) {
						System.out.println("�޴��� �������ּ���.");
						System.out.println("1.�ݾ� �����ϱ� 2.�����޴���");
						menuSelect = Integer.parseInt(scanner.nextLine());
						if(menuSelect==1) {
							boolean stopInner = false;
							while(!stopInner) {
								System.out.println("�ʿ��� �ݾ�: "+ (productPrice[3]-parseInput));
								System.out.print(">");									
							}
							
						}
					}
				}
				case 5:
					if(parseInput>=productPrice[4]) {
						int oneMore = 0;
						System.out.println(productName[4]+" ���� ����");
						productStock[4]-= 1;
						parseInput-=productPrice[4];
						System.out.println("�߰� �ֹ��Ͻðڽ��ϱ�?");
						System.out.println("balance>"+parseInput);
						System.out.print("1.Yes 2.No");
						System.out.print(">");
						oneMore =Integer.parseInt(scanner.nextLine());
						if(oneMore == 1) {
							break;							
						} else {
							masterTotalMoney -= parseInput;
							System.out.println(parseInput+"���� ��ȯ�մϴ�.");
							break;
						}
					} else {
						boolean stop = false;
						int menuSelect = 0;
						System.out.println("�ݾ��� �����մϴ�. ������ �ݾ�:"+(productPrice[4]-parseInput));
						while(!stop) {
							System.out.println("�޴��� �������ּ���.");
							System.out.println("1.�ݾ� �����ϱ� 2.�����޴���");
							menuSelect = Integer.parseInt(scanner.nextLine());
							if(menuSelect==1) {
								boolean stopInner = false;
								while(!stopInner) {
									System.out.println("�ʿ��� �ݾ�: "+ (productPrice[4]-parseInput));
									System.out.print(">");									
								}
								
							}
						}
					}
					default:
						System.out.println("�޴��� �ִ� ��ȣ�� �����ּ���!");
				}
			}
		} // Main logic end

//		Power Off
		System.out.println("======================");
		System.out.println("======Power Off=======");
		System.out.println("======================");
	}
}
