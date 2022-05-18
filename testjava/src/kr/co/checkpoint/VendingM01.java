package kr.co.checkpoint;

import java.util.Scanner;

public class VendingM01 {
	public static void main(String[] args) {
//		상품 변수
		String drink1 = "Coca-Cola";
		String drink2 = "Pepsi";
		String drink3 = "Cider";
		String drink4 = "StarbucksCoffee";
//		가격 변수
		int priceDrink1 = 1500;
		int priceDrink2 = 1500;
		int priceDrink3 = 1400;
		int priceDrink4 = 3000;
//		재고 변수
		int counterDrink1 = 100;
		int counterDrink2 = 100;
		int counterDrink3 = 100;
		int counterDrink4 = 100;
//		금액 및 잔돈 변수
		int bill_10000 = 10;
		int bill_5000 = 10;
		int bill_1000 = 50;
		int coin_500 = 50;
		int coin_100 = 100;
		int totalMoney = bill_10000 * 10000 + bill_5000 * 5000 + bill_1000 * 1000 + coin_500 * 500 + coin_100 * 100;
//		상태 변수
		final int SUCCESS = 1;
		final int ERROR_LACKOFMONEY = -1;
		final int ERROR_LACKOFIVENTORY = -2;
		int state = SUCCESS;
		boolean stop = false;
		boolean stopAdmin = false;
//		값 입력 변수
		int inputMoney = 0;
		int inputSel = -1;
		int selectPrice = 0;
		int selcectDrink = 0;
		int password = 123456789;
//		값 입력을 위한 스캐너
		Scanner scanner = null;

//		시작 콘솔
		System.out.println("========================");
		System.out.println("Vending Machine Power On");
		System.out.println("========================");
		System.out.println();
//		메뉴 콘솔
		while (!stop) {
			if (state == SUCCESS) {
				System.out.println("=========================");
				System.out.println("Menu");
				System.out.printf("1.%s%nprice:%d\tinventory:%d%n", drink1, priceDrink1, counterDrink1);
				System.out.printf("2.%s%nprice:%d\tinventory:%d%n", drink2, priceDrink2, counterDrink2);
				System.out.printf("3.%s%nprice:%d\tinventory:%d%n", drink3, priceDrink3, counterDrink3);
				System.out.printf("4.%s%nprice:%d\tinventory:%d%n", drink4, priceDrink4, counterDrink4);
				System.out.println("5.administration mode");
				System.out.println("=========================");
				System.out.println();
				// 입력 콘솔
				scanner = new Scanner(System.in);
				System.out.println("===========");
				System.out.print("Select drink>");
				inputSel = scanner.nextInt();
				if (inputSel != 5) {
					System.out.print("input money>");
					inputMoney = scanner.nextInt();
					System.out.println("===========");
					System.out.println();
				}
				// 진행 및 결과 콘솔
				switch (inputSel) {
				case 1:
					if (inputMoney >= priceDrink1) {
						System.out.printf("%s 제품이 성공적으로 나왔습니다.%n", drink1);
						System.out.printf("잔돈은 %d--입니다.%n", inputMoney - priceDrink1);
						System.out.println();
						counterDrink1--;
						totalMoney += inputMoney;
						// 내부 잔돈 상태값 변화
						// bill
						if (inputMoney / 1000 >= 5) {
							bill_5000--;
							bill_1000 = (inputMoney / 1000 - 5);
						} else {
							bill_1000 -= inputMoney / 1000;
						}
						// coin
						if ((inputMoney / 100) % 10 >= 5) {
							coin_500 -= 1;
							coin_100 -= (inputMoney / 100) % 10 - 5;
						} else {
							coin_100 -= (inputMoney / 100) % 10;
						}
						System.out.println("1.Back to the menu 2. power off machine");
						System.out.print("Press Button>");
						int pressValue = scanner.nextInt();
						if (pressValue == 1) {
							state = SUCCESS;
						} else if (pressValue == 2) {
							stop = true;
						}
						break;
					} else {
						System.out.printf("투입금액이 모자랍니다. 추가필요 금액 = %d%n", priceDrink1 - inputMoney);
						System.out.println("1.Return menu 2. additional input");
						System.out.print("press button>");
						int buttonValue = scanner.nextInt();
						if (buttonValue == 1) {
							break;
						} else if (buttonValue == 2) {
							state = ERROR_LACKOFMONEY;
							selectPrice = priceDrink1;
							selcectDrink = 1;
							break;
						}
					}
				case 2:
					if (inputMoney >= priceDrink2) {
						System.out.printf("%s 제품이 성공적으로 나왔습니다.%n", drink2);
						System.out.printf("잔돈은 %d입니다.%n", inputMoney - priceDrink2);
						System.out.println();
						counterDrink2--;
						totalMoney += inputMoney;
						if (inputMoney / 1000 >= 5) {
							bill_5000--;
							bill_1000 = (inputMoney / 1000 - 5);
						} else {
							bill_1000 -= inputMoney / 1000;
						}
						// coin
						if ((inputMoney / 100) % 10 >= 5) {
							coin_500 -= 1;
							coin_100 -= (inputMoney / 100) % 10 - 5;
						} else {
							coin_100 -= (inputMoney / 100) % 10;
						}
						System.out.println("1.Back to the menu 2. power off machine");
						System.out.print("Press Button>");
						int pressValue = scanner.nextInt();
						if (pressValue == 1) {
							state = SUCCESS;
						} else if (pressValue == 2) {
							stop = true;
						}
						break;
					} else {
						System.out.printf("투입금액이 모자랍니다. 추가필요 금액 = %d%n", priceDrink2 - inputMoney);
						System.out.println("1.Return menu 2. additional input");
						System.out.print("press button>");
						int buttonValue = scanner.nextInt();
						if (buttonValue == 1) {
							break;
						} else if (buttonValue == 2) {
							state = ERROR_LACKOFMONEY;
							selectPrice = priceDrink2;
							selcectDrink = 2;
							break;
						}
					}
				case 3:
					if (inputMoney >= priceDrink3) {
						System.out.printf("%s 제품이 성공적으로 나왔습니다.%n", drink3);
						System.out.printf("잔돈은 %d입니다.%n", inputMoney - priceDrink3);
						System.out.println();
						counterDrink3--;
						totalMoney += inputMoney;
						if (inputMoney / 1000 >= 5) {
							bill_5000--;
							bill_1000 = (inputMoney / 1000 - 5);
						} else {
							bill_1000 -= inputMoney / 1000;
						}
						// coin
						if ((inputMoney / 100) % 10 >= 5) {
							coin_500 -= 1;
							coin_100 -= (inputMoney / 100) % 10 - 5;
						} else {
							coin_100 -= (inputMoney / 100) % 10;
						}
						System.out.println("1.Back to the menu 2. power off machine");
						System.out.print("Press Button>");
						int pressValue = scanner.nextInt();
						if (pressValue == 1) {
							state = SUCCESS;
						} else if (pressValue == 2) {
							stop = true;
						}
						break;
					} else {
						System.out.printf("투입금액이 모자랍니다. 추가필요 금액 = %d%n", priceDrink3 - inputMoney);
						System.out.println("1.Return menu 2. additional input");
						System.out.print("press button>");
						int buttonValue = scanner.nextInt();
						if (buttonValue == 1) {
							break;
						} else if (buttonValue == 2) {
							state = ERROR_LACKOFMONEY;
							selectPrice = priceDrink3;
							selcectDrink = 3;
							break;
						}
					}
				case 4:
					if (inputMoney >= priceDrink4) {
						System.out.printf("%s 제품이 성공적으로 나왔습니다.%n", drink4);
						System.out.printf("잔돈은 %d입니다.%n", inputMoney - priceDrink4);
						System.out.println();
						counterDrink4--;
						totalMoney += inputMoney;
						if (inputMoney / 1000 >= 5) {
							bill_5000--;
							bill_1000 = (inputMoney / 1000 - 5);
						} else {
							bill_1000 -= inputMoney / 1000;
						}
						// coin
						if ((inputMoney / 100) % 10 >= 5) {
							coin_500 -= 1;
							coin_100 -= (inputMoney / 100) % 10 - 5;
						} else {
							coin_100 -= (inputMoney / 100) % 10;
						}
						System.out.println("1.Back to the menu 2. power off machine");
						System.out.print("Press Button>");
						int pressValue = scanner.nextInt();
						if (pressValue == 1) {
							state = SUCCESS;
						} else if (pressValue == 2) {
							stop = true;
						}
						break;
					} else {
						System.out.printf("투입금액이 모자랍니다. 추가필요 금액 = %d%n", priceDrink4 - inputMoney);
						System.out.println("1.Return menu 2. additional input");
						System.out.print("press button>");
						int buttonValue = scanner.nextInt();
						if (buttonValue == 4) {
							break;
						} else if (buttonValue == 2) {
							state = ERROR_LACKOFMONEY;
							selectPrice = priceDrink3;
							selcectDrink = 4;
							break;
						}
					}
				case 5:
					while (!stopAdmin) {
						System.out.println("Vending Machine Information");
						System.out.println("1.Check Stock 2. Change Beverage 3.Change Price 4.Change Stock 5.Exit");
						System.out.printf("Select Menu>");
						int selMenu = scanner.nextInt();
						int selSub = 0;
						switch (selMenu) {
						case 1:
							System.out.println("Item List");
							System.out.println("1.Coca-Cola Stock:" + counterDrink1);
							System.out.println("2.Pepsi Stock:" + counterDrink2);
							System.out.println("3.Cider Stock:" + counterDrink3);
							System.out.println("4.StarbucksCoffee Stock:" + counterDrink4);
							System.out.println();
							System.out.println("1.Back to the Upper Menu 2.exit");
							selSub = scanner.nextInt();
							if (selSub == 1) {
								break;
							} else if (selSub == 2) {
								stopAdmin = true;
								break;
							}
						case 2:
							System.out.println("Select Mode");
							System.out.println("1.Change order 2.Alternative 3.exit");
							System.out.print("Mode>");
							int modeSel = scanner.nextInt();
							if(modeSel==1) {
								System.out.println("Exchage order");
								System.out.println("from>");
								int tempFrom = scanner.nextInt();
								System.out.println("to>");
								int tempTo = scanner.nextInt();
								int tempCounter = 0;
								String tempDrink = null;

								if (tempFrom == 1) {
									switch (tempTo) {
									case 1:
										break;
									case 2:
										tempDrink = drink1;
										tempCounter = counterDrink1;
										drink1 = drink2;
										counterDrink1 = counterDrink2;
										drink2 = tempDrink;
										counterDrink2 = tempCounter;
										break;
									case 3:
										tempDrink = drink1;
										tempCounter = counterDrink1;
										drink1 = drink3;
										counterDrink1 = counterDrink3;
										drink3 = tempDrink;
										counterDrink3 = tempCounter;
										break;
									case 4:
										tempDrink = drink1;
										tempCounter = counterDrink1;
										drink1 = drink4;
										counterDrink1 = counterDrink4;
										drink4 = tempDrink;
										counterDrink4 = tempCounter;
										break;
									}
								} else if (tempFrom == 2) {
									switch (tempTo) {
									case 1:
										tempDrink = drink2;
										tempCounter = counterDrink2;
										drink2 = drink1;
										counterDrink2 = counterDrink1;
										drink1 = tempDrink;
										counterDrink1 = tempCounter;
										break;
									case 2:
										break;
									case 3:
										tempDrink = drink2;
										tempCounter = counterDrink2;
										drink2 = drink3;
										counterDrink2 = counterDrink3;
										drink3 = tempDrink;
										counterDrink3 = tempCounter;
										break;
									case 4:
										tempDrink = drink2;
										tempCounter = counterDrink2;
										drink2 = drink4;
										counterDrink2 = counterDrink4;
										drink4 = tempDrink;
										counterDrink4 = tempCounter;
										break;
									}
								} else if (tempFrom == 3) {
									switch (tempTo) {
									case 1:
										tempDrink = drink3;
										tempCounter = counterDrink3;
										drink3 = drink1;
										counterDrink3 = counterDrink1;
										drink1 = tempDrink;
										counterDrink1 = tempCounter;
										break;
									case 2:
										tempDrink = drink3;
										tempCounter = counterDrink3;
										drink3 = drink2;
										counterDrink3 = counterDrink2;
										drink2 = tempDrink;
										counterDrink2 = tempCounter;
										break;
									case 3:
										break;
									case 4:
										tempDrink = drink3;
										tempCounter = counterDrink3;
										drink3 = drink4;
										counterDrink3 = counterDrink4;
										drink4 = tempDrink;
										counterDrink4 = tempCounter;
										break;
									}
								} else if (tempFrom == 4) {
									switch (tempTo) {
									case 1:
										tempDrink = drink4;
										tempCounter = counterDrink4;
										drink4 = drink1;
										counterDrink4 = counterDrink1;
										drink1 = tempDrink;
										counterDrink1 = tempCounter;
										break;
									case 2:
										tempDrink = drink4;
										tempCounter = counterDrink4;
										drink4 = drink2;
										counterDrink4 = counterDrink2;
										drink2 = tempDrink;
										counterDrink2 = tempCounter;
										break;
									case 3:
										tempDrink = drink4;
										tempCounter = counterDrink4;
										drink4 = drink3;
										counterDrink4 = counterDrink3;
										drink3 = tempDrink;
										counterDrink3 = tempCounter;
										break;
									case 4:
										break;
									}
								}
								} else if(modeSel==2) {
								System.out.print("select drink whick is changed>");
								int temp = scanner.nextInt();
								System.out.print("input new drink name>");
								String temp1 = scanner.nextLine();
								System.out.print("input amount of new drink>");
								int temp3 = scanner.nextInt();
								if (temp == 1) {
									drink1 = temp1;
									counterDrink1 = temp3;
								} else if (temp == 2) {
									drink2 = temp1;
									counterDrink2 = temp3;
								} else if (temp == 3) {
									drink3 = temp1;
									counterDrink3 = temp3;
								} else if (temp == 4) {
									drink4 = temp1;
									counterDrink4 = temp3;
								}
							} else if(modeSel==3) {
								break;
							} ;
						
							case 3:
								System.out.println("Select drink which is changed>");
								int temp = scanner.nextInt();
								System.out.println("input new price>");
								int tempPrice = scanner.nextInt();
								if (temp == 1) {
									priceDrink1 = tempPrice;
								} else if (temp == 2) {
									priceDrink2 = tempPrice;
								} else if (temp == 3) {
									priceDrink3 = tempPrice;
								} else if (temp == 4) {
									priceDrink4 = tempPrice;
								}
								break;
							case 4:
								System.out.println("Select drink which is changed>");
								temp = scanner.nextInt();
								System.out.println("input new amount>");
								int tempStock = scanner.nextInt();
								if (temp == 1) {
									counterDrink1 = tempStock;
								} else if (temp == 2) {
									counterDrink2 = tempStock;
								} else if (temp == 3) {
									counterDrink3 = tempStock;
								} else if (temp == 4) {
									counterDrink4 = tempStock;
								}
								break;

							case 5:
								stopAdmin = true;
							}
						}
					}
				stopAdmin = false;
				}
			} else if (state == ERROR_LACKOFMONEY) {
				System.out.print("추가금액투입>");
				int addtion = scanner.nextInt();
				inputMoney += addtion;
				if (inputMoney >= selectPrice) {
					switch (selcectDrink) {
					case 1:
						System.out.printf("%s 제품이 성공적으로 나왔습니다.%n", drink1);
						System.out.printf("잔돈은 %d입니다.%n", inputMoney - priceDrink1);
						System.out.println();
						counterDrink1--;
						totalMoney += inputMoney;
						if (inputMoney / 1000 >= 5) {
							bill_5000--;
							bill_1000 = (inputMoney / 1000 - 5);
						} else {
							bill_1000 -= inputMoney / 1000;
						}
						// coin
						if ((inputMoney / 100) % 10 >= 5) {
							coin_500 -= 1;
							coin_100 -= (inputMoney / 100) % 10 - 5;
						} else {
							coin_100 -= (inputMoney / 100) % 10;
						}
						System.out.println("1.Back to the menu 2. power off machine");
						System.out.print("Press Button>");
						int pressValue1 = scanner.nextInt();
						if (pressValue1 == 1) {
							state = SUCCESS;
						} else if (pressValue1 == 2) {
							stop = true;
						}
						break;
					case 2:
						System.out.printf("%s 제품이 성공적으로 나왔습니다.%n", drink2);
						System.out.printf("잔돈은 %d입니다.%n", inputMoney - priceDrink2);
						System.out.println();
						counterDrink2--;
						totalMoney += inputMoney;
						if (inputMoney / 1000 >= 5) {
							bill_5000--;
							bill_1000 = (inputMoney / 1000 - 5);
						} else {
							bill_1000 -= inputMoney / 1000;
						}
						// coin
						if ((inputMoney / 100) % 10 >= 5) {
							coin_500 -= 1;
							coin_100 -= (inputMoney / 100) % 10 - 5;
						} else {
							coin_100 -= (inputMoney / 100) % 10;
						}
						System.out.println("1.Back to the menu 2. power off machine");
						System.out.print("Press Button>");
						int pressValue2 = scanner.nextInt();
						if (pressValue2 == 1) {
							state = SUCCESS;
						} else if (pressValue2 == 2) {
							stop = true;
						}
						break;
					case 3:
						System.out.printf("%s 제품이 성공적으로 나왔습니다.%n", drink3);
						System.out.printf("잔돈은 %d입니다.%n", inputMoney - priceDrink3);
						System.out.println();
						counterDrink3--;
						totalMoney += inputMoney;
						if (inputMoney / 1000 >= 5) {
							bill_5000--;
							bill_1000 = (inputMoney / 1000 - 5);
						} else {
							bill_1000 -= inputMoney / 1000;
						}
						// coin
						if ((inputMoney / 100) % 10 >= 5) {
							coin_500 -= 1;
							coin_100 -= (inputMoney / 100) % 10 - 5;
						} else {
							coin_100 -= (inputMoney / 100) % 10;
						}
						System.out.println("1.Back to the menu 2. power off machine");
						System.out.print("Press Button>");
						int pressValue3 = scanner.nextInt();
						if (pressValue3 == 1) {
							state = SUCCESS;
						} else if (pressValue3 == 2) {
							stop = true;
						}
						break;
					case 4:
						System.out.printf("%s 제품이 성공적으로 나왔습니다.%n", drink4);
						System.out.printf("잔돈은 %d입니다.%n", inputMoney - priceDrink4);
						System.out.println();
						counterDrink4--;
						totalMoney += inputMoney;
						if (inputMoney / 1000 >= 5) {
							bill_5000--;
							bill_1000 = (inputMoney / 1000 - 5);
						} else {
							bill_1000 -= inputMoney / 1000;
						}
						// coin
						if ((inputMoney / 100) % 10 >= 5) {
							coin_500 -= 1;
							coin_100 -= (inputMoney / 100) % 10 - 5;
						} else {
							coin_100 -= (inputMoney / 100) % 10;
						}
						System.out.println("1.Back to the menu 2. power off machine");
						System.out.print("Press Button>");
						int pressValue4 = scanner.nextInt();
						if (pressValue4 == 1) {
							state = SUCCESS;
						} else if (pressValue4 == 2) {
							stop = true;
						}
						break;
					}

				} else {
					System.out.printf("투입금액이 모자랍니다. 추가필요 금액 = %d%n", selectPrice - inputMoney);
				}
			}

		  }
		}
	System.out.println("========================");System.out.println("Vending Machine Power Off");System.out.println("========================");

}}
