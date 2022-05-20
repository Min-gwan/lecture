package kr.co.checkpoint;

import java.util.Scanner;

public class VendingMachine03 {

	public static void main(String[] args) {
//		  상품 변수
		String drink1 = "Coca-Cola";
		String drink2 = "Pepsi";
		String drink3 = "Cider";
		String drink4 = "StarbucksCoffee";
//      가격 변수
		int priceDrink1 = 1500;
		int priceDrink2 = 1500;
		int priceDrink3 = 1400;
		int priceDrink4 = 3000;
//		재고 변수
		int counterDrink1 = 100;
		int counterDrink2 = 100;
		int counterDrink3 = 100;
		int counterDrink4 = 100;
//		잔돈 변수
		int totalMoney = 0;
//     	상수
		final int POWER_ON = 1;
		final int POWER_OFF = 0;
		final int SUCCESS = 2;
		final int ERROR_LACKOFMONEY = -1;
		final int ERROR_LACKOFSTOCK = -2;
//      상태 변수
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
//      값 입력 변수
		int inputTotalMoney = 0;
		int inputSel = -1;
		String inputMoney = null;
//        패스워드
		int password = 123456789;
		int inputPassword = 0;
//        선택 변수
		int selectPrice = 0;
		int selectDrink = 0;
		int addOrderState = 0;
		int moreOrder = 0;
		int addInput = 0;
//        입력 준비
		Scanner scanner = null;

//        시작 콘솔
		state = POWER_ON;
		System.out.println("========================");
		System.out.println("Vending Machine Power On");
		System.out.println("========================");
		System.out.println();

//        입력 콘솔
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
//			입력 콘솔 끝

//			메뉴 및 입력 콘솔
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
//			메뉴 및 입력 콘솔 끝

//			입력 가격과 선택한 상품의 가격 비교를 통한 상태 설정
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
//				메뉴 선택 다시하기
			}
//			에러가 발생하지 않은 경우
			if (state == SUCCESS) {
//			선택 알고리즘
				switch (inputSel) {
				case 1:
					System.out.printf("%s 상품이 성공적으로 나왔습니다.%n", drink1);
					counterDrink1--;
					inputTotalMoney -= priceDrink1;
					System.out.println("추가 주문을 하시겠습니까?");
					System.out.println("1.Yes 2.No");
					System.out.print(">");
					moreOrder = scanner.nextInt();
					if (moreOrder == 1) {
						totalMoney -= priceDrink1;
						break;
					} else if (moreOrder == 2) {
						System.out.printf("잔돈은 %d입니다.%n", inputTotalMoney);
						totalMoney -= inputTotalMoney;
						stopOutside = true;
					}
					break;
				case 2:
					System.out.printf("%s 상품이 성공적으로 나왔습니다.%n", drink2);
					counterDrink2--;
					inputTotalMoney -= priceDrink2;
					System.out.println("추가 주문을 하시겠습니까?");
					System.out.println("1.Yes 2.No");
					System.out.print(">");
					moreOrder = scanner.nextInt();
					if (moreOrder == 1) {
						totalMoney -= priceDrink2;
						break;
					} else if (moreOrder == 2) {
						System.out.printf("잔돈은 %d입니다.%n", inputTotalMoney);
						totalMoney -= inputTotalMoney;
						stopOutside = true;
					}
					break;
				case 3:
					System.out.printf("%s 상품이 성공적으로 나왔습니다.%n", drink3);
					counterDrink3--;
					inputTotalMoney -= priceDrink3;
					System.out.println("추가 주문을 하시겠습니까?");
					System.out.println("1.Yes 2.No");
					System.out.print(">");
					moreOrder = scanner.nextInt();
					if (moreOrder == 1) {
						totalMoney -= priceDrink3;
						break;
					} else if (moreOrder == 2) {
						System.out.printf("잔돈은 %d입니다.%n", inputTotalMoney);
						totalMoney -= inputTotalMoney;
						stopOutside = true;
					}
					break;
				case 4:
					System.out.printf("%s 상품이 성공적으로 나왔습니다.%n", drink4);
					counterDrink2--;
					inputTotalMoney -= priceDrink4;
					System.out.println("추가 주문을 하시겠습니까?");
					System.out.println("1.Yes 2.No");
					System.out.print(">");
					moreOrder = scanner.nextInt();
					if (moreOrder == 1) {
						totalMoney -= priceDrink4;
						break;
					} else if (moreOrder == 2) {
						System.out.printf("잔돈은 %d입니다.%n", inputTotalMoney);
						totalMoney -= inputTotalMoney;
						stopOutside = true;
					}
					break;
				default:
				} // 선택 알고리즘 끝
					// SUCCESS 상태 종료
			} else if (state == ERROR_LACKOFMONEY) {
				while (!stopAdd) {
					if (inputSel == 1) {
						System.out.printf("금액이 부족합니다. 부족한 금액 = %d%n", priceDrink1 - inputTotalMoney);
						System.out.println("1.Return Change  2. additional input");
						System.out.print("press button>");
						int buttonValue = scanner.nextInt();
						if (buttonValue == 1) {
							System.out.println("잔돈은 " + inputTotalMoney + "원 입니다");
							stopAdd = true;
						} else if (buttonValue == 2) {
							System.out.print("추가금액>");
							addInput = scanner.nextInt();
							inputTotalMoney += addInput;
							if (inputTotalMoney >= priceDrink1) {
								state = SUCCESS;
								stopAdd = true;
							} else {
								System.out.println("추가 금액 모자람");
								stateMenu=false;
							}
						}
					} else if (inputSel == 2) {
						System.out.printf("금액이 부족합니다. 부족한 금액 = %d%n", priceDrink2 - inputTotalMoney);
						System.out.println("1.Return Change  2. additional input");
						System.out.print("press button>");
						int buttonValue = scanner.nextInt();
						if (buttonValue == 1) {
							System.out.println("잔돈은 " + inputTotalMoney + "원 입니다");
							stopAdd = true;
						} else if (buttonValue == 2) {
							System.out.print("추가금액>");
							addInput = scanner.nextInt();
							inputTotalMoney += addInput;
							if (inputTotalMoney >= priceDrink2) {
								state = SUCCESS;
								stopAdd = true;
							} else {
								System.out.println("추가 금액 모자람");
								stateMenu=false;
							}
						}
					} else if (inputSel == 3) {
						System.out.printf("금액이 부족합니다. 부족한 금액 = %d%n", priceDrink3 - inputTotalMoney);
						System.out.println("1.Return Change  2. additional input");
						System.out.print("press button>");
						int buttonValue = scanner.nextInt();
						if (buttonValue == 1) {
							System.out.println("잔돈은 " + inputTotalMoney + "원 입니다");
							stopAdd = true;
						} else if (buttonValue == 2) {
							System.out.print("추가금액>");
							addInput = scanner.nextInt();
							inputTotalMoney += addInput;
							if (inputTotalMoney >= priceDrink3) {
								state = SUCCESS;
								stopAdd = true;
							} else {
								System.out.println("추가 금액 모자람");
								stateMenu=false;
							}
						}

					} else if (inputSel == 4) {
						System.out.printf("금액이 부족합니다. 부족한 금액 = %d%n", priceDrink4 - inputTotalMoney);
						System.out.println("1.Return Change  2. additional input");
						System.out.print("press button>");
						int buttonValue = scanner.nextInt();
						if (buttonValue == 1) {
							System.out.println("잔돈은 " + inputTotalMoney + "원 입니다");
							stopAdd = true;
						} else if (buttonValue == 2) {
							System.out.print("추가금액>");
							addInput = scanner.nextInt();
							inputTotalMoney += addInput;
							if (inputTotalMoney >= priceDrink4) {
								state = SUCCESS;
								stopAdd = true;
							} else {
								System.out.println("추가 금액 모자람");
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
