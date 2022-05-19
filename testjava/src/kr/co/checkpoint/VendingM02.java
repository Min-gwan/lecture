package kr.co.checkpoint;

import java.util.Scanner;

public class VendingM02 {
    public static void main(String[] args) {
//      상품 변수
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
        int bill_10000 = 10;
        int bill_5000 = 10;
        int bill_1000 = 50;
        int coin_500 = 50;
        int coin_100 = 100;
        int totalMoney = bill_10000 * 10000 + bill_5000 * 5000 + bill_1000 * 1000 + coin_500 * 500 + coin_100 * 100;
//      에러 상수
        final int SUCCESS = 1;
        final int ERROR_LACKOFMONEY = -1;
        final int ERROR_LACKOFIVENTORY = -2;
//      상태 변수
        int state = SUCCESS;
        boolean stopOutside = false;
        boolean stopAdmin = false;
        boolean chooseDrink1 = counterDrink1>0;
        boolean chooseDrink2 = counterDrink2>0;
        boolean chooseDrink3 = counterDrink3>0;
        boolean chooseDrink4 = counterDrink4>0;
//      값 입력 변수
        int inputTotalMoney = 0;
        int inputBill10000 = 0;
        int inputBill5000 = 0;
        int inputBill1000 = 0;
        int inputCoin500 = 0;
        int inputCoin100 =0;
        int inputSel = -1;
//        패스워드
        int password = 123456789;
        int inputPassword = 0;
//        잔액 변수
        int totalChange = 0;
        int billChange = 0;
        int coinChange = 0;
//        선택 변수
        int selectPrice = 0;
        int selectDrink = 0;
        int addOrderState = 0;
        int moreOrder = 0;

//		입력준비
        Scanner scanner = null;

//		시작 콘솔
        System.out.println("========================");
        System.out.println("Vending Machine Power On");
        System.out.println("========================");
        System.out.println();
//        전체메뉴 콘솔
        while(!stopOutside) {
            if(state==SUCCESS) {
                System.out.println("=========================");
                System.out.println("Menu");
                System.out.printf("1.%s%nprice:%d\tchoose:%b%n", drink1, priceDrink1, chooseDrink1);
                System.out.printf("2.%s%nprice:%d\tchoose:%b%n", drink2, priceDrink2, chooseDrink2);
                System.out.printf("3.%s%nprice:%d\tchoose:%b%n", drink3, priceDrink3, chooseDrink3);
                System.out.printf("4.%s%nprice:%d\tchoose:%b%n", drink4, priceDrink4, chooseDrink4);
                System.out.println("5.administration mode");
                System.out.println("=========================");
                System.out.println();
//                압력 콘솔
                scanner = new Scanner(System.in);
                System.out.println("===========");
                System.out.print("Select drink>");
                inputSel = scanner.nextInt();
                if (inputSel != 5 && moreOrder!=1) {
                    System.out.println("write number");
                    System.out.print("10000>");
                    inputBill10000 = scanner.nextInt();
                    bill_10000 += inputBill10000;
                    System.out.print("5000>");
                    inputBill5000 = scanner.nextInt();
                    bill_5000 += inputBill5000;
                    System.out.print("1000>");
                    inputBill1000 = scanner.nextInt();
                    bill_1000 += inputBill1000;
                    System.out.print("500>");
                    inputCoin500 = scanner.nextInt();
                    coin_500 += inputCoin500;
                    System.out.print("100>");
                    inputCoin100 = scanner.nextInt();
                    coin_100 += inputCoin100;
                    inputTotalMoney=inputBill10000*10000+inputBill5000*5000+inputBill1000*1000+inputCoin500*500+inputCoin100*100;
                    System.err.println("Total money:"+inputTotalMoney);
                    System.out.println("===========");
                    System.out.println();
                }
//        메뉴별 콘솔
                switch (inputSel) {
                    case 1:
//                        1번 음료 선택
                        if (inputTotalMoney >= priceDrink1 && chooseDrink1) {
//                            음료 출력 상태 표현
                            System.out.printf("%s 상품이 성공적으로 나왔습니다.%n", drink1);
                            System.out.printf("잔돈은 %d입니다.%n", inputTotalMoney - priceDrink1);
//                            내부 잔돈 수정
                            bill_10000 += inputBill10000;
                            bill_5000 += inputBill5000;
                            bill_1000 += inputBill1000;
                            coin_500 += inputCoin500;
                            coin_100 += inputCoin100;
                            counterDrink1--;
                            inputTotalMoney -= priceDrink1;
                            System.out.println("추가 주문을 하시겠습니까?");
                            System.out.println("1.Yes 2.No");
                            System.out.print(">");
                            moreOrder = scanner.nextInt();
                            if(moreOrder==1) {
                            	break;
                            }
                            totalMoney += inputTotalMoney - priceDrink1;
//								입력된 값에 따른 잔액 처리                            
                            if (inputTotalMoney == 10000) {
                                totalChange = inputTotalMoney - priceDrink1;
                                billChange = totalChange / 1000;
                                coinChange = (totalChange / 100) % 10;
//                                지폐
                                if (billChange >= 5) {
                                    bill_5000--;
                                    bill_1000 -= bill_5000 - 5;
                                } else {
                                    bill_1000 -= billChange;
                                }
//                                동전
                                if (coinChange >= 5) {
                                    coin_500--;
                                    coin_100 -= coinChange - 5;
                                } else {
                                    coin_100 -= coinChange;
                                }

                            } else if (inputTotalMoney >= 1000 && inputTotalMoney <= 9900) {
                                totalChange = inputTotalMoney - priceDrink1;
                                billChange = totalChange / 1000;
                                coinChange = (totalChange / 100) % 10;
                                if (billChange >= 5) {
                                    bill_5000--;
                                    bill_1000 -= (billChange - 5);
                                } else {
                                    bill_1000 -= billChange;
                                }
                                if (coinChange >= 5) {
                                    coin_500--;
                                    coin_100 -= coinChange - 5;
                                } else {
                                    coin_100 -= coinChange;
                                }
                            }
                            System.out.println("1.Back to the menu 2. power off machine");
                            System.out.print("Press Button>");
                            int pressValue = scanner.nextInt();
                            if (pressValue == 1) {
                                state = SUCCESS;
                            } else if (pressValue == 2) {
                                stopOutside = true;
                            }
                            break;
                        } else if (inputTotalMoney < priceDrink1) {
                            System.out.printf("금액이 부족합니다. 부족한 금액 = %d%n", priceDrink1 - inputTotalMoney);
                            System.out.println("1.Return menu 2. additional input");
                            System.out.print("press button>");
                            int buttonValue = scanner.nextInt();
                            if (buttonValue == 1) {
                                break;
                            } else if (buttonValue == 2) {
                                state = ERROR_LACKOFMONEY;
                                selectPrice = priceDrink1;
                                selectDrink = 1;
                                break;
                            }
                        } else if (!chooseDrink1) {
                            System.out.printf("선택한 %s의 수량이 부족합니다.", drink1);
                            break;
                        }
                    case 2:
                        if (inputTotalMoney >= priceDrink2 && chooseDrink2) {
//                            2번 음료 선택
                            System.out.printf("%s 상품이 성공적으로 나왔습니다.%n", drink2);
                            System.out.printf("잔돈은 %d입니다.%n", inputTotalMoney - priceDrink2);                            
                            bill_10000 += inputBill10000;
                            bill_5000 += inputBill5000;
                            bill_1000 += inputBill1000;
                            coin_500 += inputCoin500;
                            coin_100 += inputCoin100;
                            counterDrink2--;
                            totalMoney += inputTotalMoney - priceDrink2;
//                            �옍�룉 �긽�깭 �닔�젙
                            if (inputTotalMoney == 10000) {
                                totalChange = inputTotalMoney - priceDrink2;
                                billChange = totalChange / 1000;
                                coinChange = (totalChange / 100) % 10;
//                                吏��룓 �옍�븸 �닔�젙
                                if (billChange >= 5) {
                                    bill_5000--;
                                    bill_1000 -= bill_5000 - 5;
                                } else {
                                    bill_1000 -= billChange;
                                }
//                                �룞�쟾 �옍�븸 �닔�젙
                                if (coinChange >= 5) {
                                    coin_500--;
                                    coin_100 -= coinChange - 5;
                                } else {
                                    coin_100 -= coinChange;
                                }
                            } else if (inputTotalMoney >= 1000 && inputTotalMoney <= 9900) {
                                totalChange = inputTotalMoney - priceDrink2;
                                billChange = totalChange / 1000;
                                coinChange = (totalChange / 100) % 10;
                                if (billChange >= 5) {
                                    bill_5000--;
                                    bill_1000 -= (billChange - 5);
                                } else {
                                    bill_1000 -= billChange;
                                }
                                if (coinChange >= 5) {
                                    coin_500--;
                                    coin_100 -= coinChange - 5;
                                } else {
                                    coin_100 -= coinChange;
                                }
                            }
                            System.out.println("1.Back to the menu 2. power off machine");
                            System.out.print("Press Button>");
                            int pressValue = scanner.nextInt();
                            if (pressValue == 1) {
                                state = SUCCESS;
                            } else if (pressValue == 2) {
                                stopOutside = true;
                            }
                            break;

                        } else if (inputTotalMoney < priceDrink2) {
                            System.out.printf("금액이 부족합니다. 부족한 금액 = %d%n", priceDrink2 - inputTotalMoney);
                            System.out.println("1.Return menu 2. additional input");
                            System.out.print("press button>");
                            int buttonValue = scanner.nextInt();
                            if (buttonValue == 1) {
                                break;
                            } else if (buttonValue == 2) {
                                state = ERROR_LACKOFMONEY;
                                selectPrice = priceDrink2;
                                selectDrink = 2;
                                break;
                            }
                        } else if (!chooseDrink2) {
                            System.out.printf("선택한 %s의 수량이 부족합니다.", drink2);
                            break;
                        }
                    case 3:
                        if (inputTotalMoney >= priceDrink3 && chooseDrink3) {
//                            �쓬猷� 異쒕젰 �뿬遺�
                            System.out.printf("%s 상품이 성공적으로 나왔습니다.%n", drink3);
                            System.out.printf("잔돈은 %d입니다.%n", inputTotalMoney - priceDrink3);
//                            �옱怨� �닔�젙 諛� 珥앷툑�븸 �닔�젙
                            bill_10000 += inputBill10000;
                            bill_5000 += inputBill5000;
                            bill_1000 += inputBill1000;
                            coin_500 += inputCoin500;
                            coin_100 += inputCoin100;
                            counterDrink3--;
                            totalMoney += inputTotalMoney - priceDrink3;
//                            �옍�룉 �긽�깭 �닔�젙
                            if (inputTotalMoney == 10000) {
                                totalChange = inputTotalMoney - priceDrink3;
                                billChange = totalChange / 1000;
                                coinChange = (totalChange / 100) % 10;
//                                吏��룓 �옍�븸 �닔�젙
                                if (billChange >= 5) {
                                    bill_5000--;
                                    bill_1000 -= bill_5000 - 5;
                                } else {
                                    bill_1000 -= billChange;
                                }
//                                �룞�쟾 �옍�븸 �닔�젙
                                if (coinChange >= 5) {
                                    coin_500--;
                                    coin_100 -= coinChange - 5;
                                } else {
                                    coin_100 -= coinChange;
                                }
                            } else if (inputTotalMoney >= 1000 && inputTotalMoney <= 9900) {
                                totalChange = inputTotalMoney - priceDrink3;
                                billChange = totalChange / 1000;
                                coinChange = (totalChange / 100) % 10;
                                if (billChange >= 5) {
                                    bill_5000--;
                                    bill_1000 -= (billChange - 5);
                                } else {
                                    bill_1000 -= billChange;
                                }
                                if (coinChange >= 5) {
                                    coin_500--;
                                    coin_100 -= coinChange - 5;
                                } else {
                                    coin_100 -= coinChange;
                                }
                            }
                            System.out.println("1.Back to the menu 2. power off machine");
                            System.out.print("Press Button>");
                            int pressValue = scanner.nextInt();
                            if (pressValue == 1) {
                                state = SUCCESS;
                            } else if (pressValue == 2) {
                                stopOutside = true;
                            }
                            break;
                        } else if (inputTotalMoney < priceDrink3) {
                            System.out.printf("금액이 부족합니다. 부족한 금액 = %d%n", priceDrink3 - inputTotalMoney);
                            System.out.println("1.Return menu 2. additional input");
                            System.out.print("press button>");
                            int buttonValue = scanner.nextInt();
                            if (buttonValue == 1) {
                                break;
                            } else if (buttonValue == 2) {
                                state = ERROR_LACKOFMONEY;
                                selectPrice = priceDrink3;
                                selectDrink = 3;
                                break;
                            }
                        } else if (!chooseDrink3) {
                            System.out.printf("선택한 %s의 수량이 부족합니다.", drink3);
                            break;
                        }
                    case 4:
                        if (inputTotalMoney >= priceDrink4 && chooseDrink4) {
//                            �쓬猷� 異쒕젰 �뿬遺�
                            System.out.printf("%s 상품이 성공적으로 나왔습니다.%n", drink4);
                            System.out.printf("잔돈은 %d입니다.%n", inputTotalMoney - priceDrink4);
//                            �옱怨� �닔�젙 諛� 珥앷툑�븸 �닔�젙
                            bill_10000 += inputBill10000;
                            bill_5000 += inputBill5000;
                            bill_1000 += inputBill1000;
                            coin_500 += inputCoin500;
                            coin_100 += inputCoin100;
                            counterDrink4--;
                            totalMoney += inputTotalMoney - priceDrink4;
//                            �옍�룉 �긽�깭 �닔�젙
                            if (inputTotalMoney == 10000) {
                                totalChange = inputTotalMoney - priceDrink4;
                                billChange = totalChange / 1000;
                                coinChange = (totalChange / 100) % 10;
//                                吏��룓 �옍�븸 �닔�젙
                                if (billChange >= 5) {
                                    bill_5000--;
                                    bill_1000 -= bill_5000 - 5;
                                } else {
                                    bill_1000 -= billChange;
                                }
//                                �룞�쟾 �옍�븸 �닔�젙
                                if (coinChange >= 5) {
                                    coin_500--;
                                    coin_100 -= coinChange - 5;
                                } else {
                                    coin_100 -= coinChange;
                                }
                            } else if (inputTotalMoney >= 1000 && inputTotalMoney <= 9900) {
                                totalChange = inputTotalMoney - priceDrink4;
                                billChange = totalChange / 1000;
                                coinChange = (totalChange / 100) % 10;
                                if (billChange >= 5) {
                                    bill_5000--;
                                    bill_1000 -= (billChange - 5);
                                } else {
                                    bill_1000 -= billChange;
                                }
                                if (coinChange >= 5) {
                                    coin_500--;
                                    coin_100 -= coinChange - 5;
                                } else {
                                    coin_100 -= coinChange;
                                }
                            }
                            System.out.println("1.Back to the menu 2. power off machine");
                            System.out.print("Press Button>");
                            int pressValue = scanner.nextInt();
                            if (pressValue == 1) {
                                state = SUCCESS;
                            } else if (pressValue == 2) {
                                stopOutside = true;
                            }
                            break;
                        } else if (inputTotalMoney < priceDrink4) {
                            System.out.printf("금액이 부족합니다. 부족한 금액 = %d%n", priceDrink4 - inputTotalMoney);
                            System.out.println("1.Return menu 2. additional input");
                            System.out.print("press button>");
                            int buttonValue = scanner.nextInt();
                            if (buttonValue == 1) {
                                break;
                            } else if (buttonValue == 2) {
                                state = ERROR_LACKOFMONEY;
                                selectPrice = priceDrink4;
                                selectDrink = 4;
                                break;
                            }
                        } else if (!chooseDrink4) {
                            System.out.printf("선택한 %s의 수량이 부족합니다.", drink4);
                            break;
                        }
                    case 5:
                        while (!stopAdmin) {
                        	int temp = 0;
                        	int tempPrice = 0;
                            System.out.print("password>");
                            inputPassword = scanner.nextInt();
                            if (inputPassword == password) {
                                System.out.println("Vending Machine Administration Information");
                                System.out.println("1.Check Stock 2. Change Beverage 3.Change Price 4.Change Stock 5.Exit");
                                System.out.printf("Select Menu>");
                                int selAdmin = scanner.nextInt();
                                int selSub = 0;
                                switch (selAdmin) {
                                    case 1:
                                        System.out.println("Item List");
                                        System.out.printf("1.%s\tprice:%d\tStock:%d%n", drink1, priceDrink1, counterDrink1);
                                        System.out.printf("1.%s\tprice:%d\tStock:%d%n", drink2, priceDrink2, counterDrink2);
                                        System.out.printf("1.%s\tprice:%d\tStock:%d%n", drink3, priceDrink3, counterDrink3);
                                        System.out.printf("1.%s\tprice:%d\tStock:%d%n", drink4, priceDrink4, counterDrink4);
                                        System.out.println();
                                        System.out.print("1.Back to the Upper Menu 2.exit");
                                        selSub = scanner.nextInt();
                                        if (selSub == 1) {
                                            break;
                                        } else if(selSub == 2){
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
//    											switch end
    										} else if(tempFrom==2) {
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
    										} else if(tempFrom ==3) {
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
    										} else if(tempFrom == 4) {
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
//    										1번 모드 끝
    									} else if(modeSel==2) {
    										System.out.print("select drink whick is changed>");
    										int tempSelect = scanner.nextInt();
    										System.out.print("input new drink name>");
    										String tempName = scanner.nextLine();
    										System.out.print("input amount of new drink>");
    										int tempAmount = scanner.nextInt();
    										
    										if(tempSelect == 1) {
    											drink1 = tempName;
    											counterDrink1 = tempAmount;
    										} else if(tempSelect==2) {
    											drink2 = tempName;
    											counterDrink2 = tempAmount;
    										} else if(tempSelect==3) {
    											drink3 = tempName;
    											counterDrink3 = tempAmount;
    										} else if(tempSelect ==4) {
    											drink4 = tempName;
    											counterDrink4 = tempAmount;
    										}
    									}
    									break;
                                    case 3:
                                    	System.out.println("Select drink which is changed>");
    									temp = scanner.nextInt();
    									System.out.println("input new price>");
    									tempPrice = scanner.nextInt();
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
                                    default:
                                }
                            } else {
                                System.out.println("비밀번호가 틀렸습니다.");
                                break;
                            }
                        }
                    default:
                }
                stopAdmin = false;
            } else if(state==ERROR_LACKOFMONEY) {
            	System.out.print("추가금액투입: 1.5000원 2.1000원 3.500 4.100");
            	int selMoneyType = scanner.nextInt();
            	int addMoney;
            	if(selMoneyType==1) {
            		System.out.print("5000원>");
            		addMoney = scanner.nextInt();
            		inputBill5000+=addMoney;
            		inputTotalMoney+=addMoney*5000;
            	} else if(selMoneyType==2) {
            		System.out.print("1000원>");
            		addMoney = scanner.nextInt();
            		inputBill1000+=addMoney;
            		inputTotalMoney+=addMoney*1000;
            	} else if(selMoneyType==3) {
            		System.out.print("500원>");
            		addMoney = scanner.nextInt();
            		coin_500+=addMoney;
            		inputCoin500+=addMoney;
            		inputTotalMoney+=addMoney*500;
            	} else if(selMoneyType==4) {
            		System.out.print("100원>");
            		addMoney = scanner.nextInt();
            		coin_100+=addMoney;
            		inputCoin100+=addMoney;
            		inputTotalMoney+=addMoney*100;
            		totalMoney+=addMoney*100;
            	}
//            	----추가금액 투입 완료
            	
            	if(inputTotalMoney >= selectPrice) {
            		switch(selectDrink) {
            		case 1:
            			System.out.printf("%s 제품이 성공적으로 나왔습니다.%n", drink1);
						System.out.printf("잔돈은 %d입니다.%n", inputTotalMoney - priceDrink1);
						System.out.println();
						bill_10000 += inputBill10000;
                        bill_5000 += inputBill5000;
                        bill_1000 += inputBill1000;
                        coin_500 += inputCoin500;
                        coin_100 += inputCoin100;
						counterDrink1--;
						totalMoney += 0;
            		case 2:
            		case 3:
            		case 4:
            		default:
            		}
            	} else {
            		System.out.printf("투입금액이 모자랍니다. 필요금액 =%d%n",selectPrice - inputTotalMoney);
            	}
            	
            }
        }
        System.out.println("=========================");
        System.out.println("Vending Machine Power Off");
        System.out.println("=========================");
    }
}
