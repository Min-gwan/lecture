package kr.co.checkpoint;

import java.util.Scanner;

public class VendingMachine03 {

	public static void main(String[] args) {
//		  ��ǰ ����
		String drink1 = "Coca-Cola";
		String drink2 = "Pepsi";
		String drink3 = "Cider";
		String drink4 = "StarbucksCoffee";
//      ���� ����
		int priceDrink1 = 1500;
		int priceDrink2 = 1500;
		int priceDrink3 = 1400;
		int priceDrink4 = 3000;
//		��� ����
		int counterDrink1 = 100;
		int counterDrink2 = 100;
		int counterDrink3 = 100;
		int counterDrink4 = 100;
//		�ܵ� ����
		int totalMoney = 0;
//     	���
		final int POWER_ON = 1;
		final int POWER_OFF = 0;
		final int SUCCESS = 2;
		final int ERROR_LACKOFMONEY = -1;
		final int ERROR_LACKOFSTOCK = -2;
//      ���� ����
		int state = 100;
		boolean stateMenu = true;
		boolean stopOutside = false;
		boolean stopAdmin = false;
		boolean stopInput = false;
		boolean stopAdd = false;
		boolean chooseDrink1 = counterDrink1 > 0;
		boolean chooseDrink2 = counterDrink2 > 0;
		boolean chooseDrink3 = counterDrink3 > 0;
		boolean chooseDrink4 = counterDrink4 > 0;
//      �� �Է� ����
		int inputTotalMoney = 0;
		int inputSel = -1;
		String inputMoney = null;
//        �н�����
		int password = 123456789;
		int inputPassword = 0;
//        ���� ����
		int selectPrice = 0;
		int selectDrink = 0;
		int addOrderState = 0;
		int moreOrder = 0;
		int addInput = 0;
//        �Է� �غ�
		Scanner scanner = null;

//        ���� �ܼ�
		state = POWER_ON;
		System.out.println("========================");
		System.out.println("Vending Machine Power On");
		System.out.println("========================");
		System.out.println();

//        �Է� �ܼ�
		while (!stopOutside) {
			while (!stopInput) {
				boolean isNumber = true;
				scanner = new Scanner(System.in);
				System.out.println("========================");
				System.out.println("Max money: 10000 , Min money: 1000 ");
				System.out.println("Insert Money");
				System.out.print(">");
				inputMoney = scanner.next();
				for (int i = 0; i < inputMoney.length(); i++) {
					char ch = inputMoney.charAt(i);
					if (ch < '0' || ch > '9') {
						System.out.println(ch);
						System.out.println("plz write number");
						isNumber = false;
						break;
					}
				}
				if (isNumber) {
					stopInput = true;
					inputTotalMoney = Integer.parseInt(inputMoney);
					totalMoney = inputTotalMoney;
				}
			}
//			�Է� �ܼ� ��

//			�޴� �� �Է� �ܼ�
			if(stateMenu) {
			System.out.println();
			System.out.println("======================");
			System.out.printf("1.%s\tPrice:%d\tSale:%s%n", drink1, priceDrink1, chooseDrink1);
			System.out.printf("2.%s\tPrice:%d\tSale:%s%n", drink2, priceDrink2, chooseDrink2);
			System.out.printf("3.%s\tPrice:%d\tSale:%s%n", drink3, priceDrink3, chooseDrink3);
			System.out.printf("4.%s\tPrice:%d\tSale:%s%n", drink4, priceDrink4, chooseDrink4);
			System.out.print("Select Number>");
			inputSel = scanner.nextInt();
			}
//			�޴� �� �Է� �ܼ� ��

//			�Է� ���ݰ� ������ ��ǰ�� ���� �񱳸� ���� ���� ����
			if (inputSel == 1) {
				if (counterDrink1 <= 0) {
					state = ERROR_LACKOFSTOCK;
				} else if (inputTotalMoney >= priceDrink1) {
					state = SUCCESS;
					System.out.println("yes");
				} else {
					state = ERROR_LACKOFMONEY;
				}
			} else if (inputSel == 2) {
				if (counterDrink2 <= 0) {
					state = ERROR_LACKOFSTOCK;
				} else if (inputTotalMoney >= priceDrink2) {
					state = SUCCESS;
				} else {
					state = ERROR_LACKOFMONEY;
				}
			} else if (inputSel == 3) {
				if (counterDrink3 <= 0) {
					state = ERROR_LACKOFSTOCK;
				} else if (inputTotalMoney >= priceDrink3) {
					state = SUCCESS;
				} else {
					state = ERROR_LACKOFMONEY;
				}
			} else if (inputSel == 4) {
				if (counterDrink4 <= 0) {
					state = ERROR_LACKOFSTOCK;
				}
				if (inputTotalMoney >= priceDrink4) {
					state = SUCCESS;
				} else {
					state = ERROR_LACKOFMONEY;
				}
			} else {
//				�޴� ���� �ٽ��ϱ�
			}
//			������ �߻����� ���� ���
			if (state == SUCCESS) {
//			���� �˰���
				switch (inputSel) {
				case 1:
					System.out.printf("%s ��ǰ�� ���������� ���Խ��ϴ�.%n", drink1);
					counterDrink1--;
					inputTotalMoney -= priceDrink1;
					System.out.println("�߰� �ֹ��� �Ͻðڽ��ϱ�?");
					System.out.println("1.Yes 2.No");
					System.out.print(">");
					moreOrder = scanner.nextInt();
					if (moreOrder == 1) {
						totalMoney -= priceDrink1;
						break;
					} else if (moreOrder == 2) {
						System.out.printf("�ܵ��� %d�Դϴ�.%n", inputTotalMoney);
						totalMoney -= inputTotalMoney;
						stopOutside = true;
					}
					break;
				case 2:
					System.out.printf("%s ��ǰ�� ���������� ���Խ��ϴ�.%n", drink2);
					counterDrink2--;
					inputTotalMoney -= priceDrink2;
					System.out.println("�߰� �ֹ��� �Ͻðڽ��ϱ�?");
					System.out.println("1.Yes 2.No");
					System.out.print(">");
					moreOrder = scanner.nextInt();
					if (moreOrder == 1) {
						totalMoney -= priceDrink2;
						break;
					} else if (moreOrder == 2) {
						System.out.printf("�ܵ��� %d�Դϴ�.%n", inputTotalMoney);
						totalMoney -= inputTotalMoney;
						stopOutside = true;
					}
					break;
				case 3:
					System.out.printf("%s ��ǰ�� ���������� ���Խ��ϴ�.%n", drink3);
					counterDrink3--;
					inputTotalMoney -= priceDrink3;
					System.out.println("�߰� �ֹ��� �Ͻðڽ��ϱ�?");
					System.out.println("1.Yes 2.No");
					System.out.print(">");
					moreOrder = scanner.nextInt();
					if (moreOrder == 1) {
						totalMoney -= priceDrink3;
						break;
					} else if (moreOrder == 2) {
						System.out.printf("�ܵ��� %d�Դϴ�.%n", inputTotalMoney);
						totalMoney -= inputTotalMoney;
						stopOutside = true;
					}
					break;
				case 4:
					System.out.printf("%s ��ǰ�� ���������� ���Խ��ϴ�.%n", drink4);
					counterDrink2--;
					inputTotalMoney -= priceDrink4;
					System.out.println("�߰� �ֹ��� �Ͻðڽ��ϱ�?");
					System.out.println("1.Yes 2.No");
					System.out.print(">");
					moreOrder = scanner.nextInt();
					if (moreOrder == 1) {
						totalMoney -= priceDrink4;
						break;
					} else if (moreOrder == 2) {
						System.out.printf("�ܵ��� %d�Դϴ�.%n", inputTotalMoney);
						totalMoney -= inputTotalMoney;
						stopOutside = true;
					}
					break;
				default:
				} // ���� �˰��� ��
					// SUCCESS ���� ����
			} else if (state == ERROR_LACKOFMONEY) {
				while (!stopAdd) {
					if (inputSel == 1) {
						System.out.printf("�ݾ��� �����մϴ�. ������ �ݾ� = %d%n", priceDrink1 - inputTotalMoney);
						System.out.println("1.Return Change  2. additional input");
						System.out.print("press button>");
						int buttonValue = scanner.nextInt();
						if (buttonValue == 1) {
							System.out.println("�ܵ��� " + inputTotalMoney + "�� �Դϴ�");
							stopAdd = true;
						} else if (buttonValue == 2) {
							System.out.print("�߰��ݾ�>");
							addInput = scanner.nextInt();
							inputTotalMoney += addInput;
							if (inputTotalMoney >= priceDrink1) {
								state = SUCCESS;
								stopAdd = true;
							} else {
								System.out.println("�߰� �ݾ� ���ڶ�");
								stateMenu=false;
							}
						}
					} else if (inputSel == 2) {
						System.out.printf("�ݾ��� �����մϴ�. ������ �ݾ� = %d%n", priceDrink2 - inputTotalMoney);
						System.out.println("1.Return Change  2. additional input");
						System.out.print("press button>");
						int buttonValue = scanner.nextInt();
						if (buttonValue == 1) {
							System.out.println("�ܵ��� " + inputTotalMoney + "�� �Դϴ�");
							stopAdd = true;
						} else if (buttonValue == 2) {
							System.out.print("�߰��ݾ�>");
							addInput = scanner.nextInt();
							inputTotalMoney += addInput;
							if (inputTotalMoney >= priceDrink2) {
								state = SUCCESS;
								stopAdd = true;
							} else {
								System.out.println("�߰� �ݾ� ���ڶ�");
								stateMenu=false;
							}
						}
					} else if (inputSel == 3) {
						System.out.printf("�ݾ��� �����մϴ�. ������ �ݾ� = %d%n", priceDrink3 - inputTotalMoney);
						System.out.println("1.Return Change  2. additional input");
						System.out.print("press button>");
						int buttonValue = scanner.nextInt();
						if (buttonValue == 1) {
							System.out.println("�ܵ��� " + inputTotalMoney + "�� �Դϴ�");
							stopAdd = true;
						} else if (buttonValue == 2) {
							System.out.print("�߰��ݾ�>");
							addInput = scanner.nextInt();
							inputTotalMoney += addInput;
							if (inputTotalMoney >= priceDrink3) {
								state = SUCCESS;
								stopAdd = true;
							} else {
								System.out.println("�߰� �ݾ� ���ڶ�");
								stateMenu=false;
							}
						}

					} else if (inputSel == 4) {
						System.out.printf("�ݾ��� �����մϴ�. ������ �ݾ� = %d%n", priceDrink4 - inputTotalMoney);
						System.out.println("1.Return Change  2. additional input");
						System.out.print("press button>");
						int buttonValue = scanner.nextInt();
						if (buttonValue == 1) {
							System.out.println("�ܵ��� " + inputTotalMoney + "�� �Դϴ�");
							stopAdd = true;
						} else if (buttonValue == 2) {
							System.out.print("�߰��ݾ�>");
							addInput = scanner.nextInt();
							inputTotalMoney += addInput;
							if (inputTotalMoney >= priceDrink4) {
								state = SUCCESS;
								stopAdd = true;
							} else {
								System.out.println("�߰� �ݾ� ���ڶ�");
								stateMenu=false;
							}
						}
					} else {

					}
				}
			} else if (state == ERROR_LACKOFSTOCK) {
				
			} else {

			}
		}
		System.out.println();
		System.out.println("=========================");
		System.out.println("Vending Machine Power Off");
		System.out.println("=========================");
	}

}
