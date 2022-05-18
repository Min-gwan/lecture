package kr.co.checkpoint;

import java.util.Scanner;

public class VendingM02 {
    public static void main(String[] args) {
//        상품 1변수
        String drink1 = "Coca-Cola";
        String drink2 = "Pepsi";
        String drink3 = "Cider";
        String drink4 = "StarbucksCoffee";
//        가격 변수
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
//        상태 상수
        final int SUCCESS = 1;
        final int ERROR_LACKOFMONEY = -1;
        final int ERROR_LACKOFIVENTORY = -2;
//        상태 변수
        int state = SUCCESS;
        boolean stopOutside = false;
        boolean stopAdmin = false;
        boolean chooseDrink1 = counterDrink1>0;
        boolean chooseDrink2 = counterDrink2>0;
        boolean chooseDrink3 = counterDrink3>0;
        boolean chooseDrink4 = counterDrink4>0;
//        값 입력 변수
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
//        재입력을 위한 변수
        int selectPrice = 0;
        int selectDrink = 0;

//		값 입력을 위한 스캐너
        Scanner scanner = null;

//		시작 콘솔
        System.out.println("========================");
        System.out.println("Vending Machine Power On");
        System.out.println("========================");
        System.out.println();
//        메뉴 콘솔
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
//                입력 콘솔
                scanner = new Scanner(System.in);
                System.out.println("===========");
                System.out.print("Select drink>");
                inputSel = scanner.nextInt();
                if (inputSel != 5) {
                    System.out.println("input money");
                    System.out.print("10000>");
                    inputBill10000 = scanner.nextInt();
                    System.out.print("5000>");
                    inputBill5000 = scanner.nextInt();
                    System.out.print("1000>");
                    inputBill1000 = scanner.nextInt();
                    System.out.print("500>");
                    inputCoin500 = scanner.nextInt();
                    System.out.print("100>");
                    inputCoin100 = scanner.nextInt();
                    inputTotalMoney=inputBill10000*1+inputBill5000*5000+inputBill1000*1000+inputCoin500*500+inputCoin100*100;
                    System.out.println("===========");
                    System.out.println();
                }
//        진행 및 결과 콘솔
                switch (inputSel) {
                    case 1:
//                        1번 음료 선택
                        if (inputTotalMoney >= priceDrink1 && chooseDrink1) {
//                            음료 출력 여부
                            System.out.printf("$s 제품이 성공적으로 나왔습니다.%n", drink1);
                            System.out.printf("잔돈은 %d--입니다.%n", inputTotalMoney - priceDrink1);
//                            재고 수정 및 총금액 수정
                            bill_10000 += inputBill10000;
                            bill_5000 += inputBill5000;
                            bill_1000 += inputBill1000;
                            coin_500 += inputCoin500;
                            coin_100 += inputCoin100;
                            counterDrink1--;
                            totalMoney += inputTotalMoney - priceDrink1;
//                            잔돈 상태 수정
                            if (inputTotalMoney == 10000) {
                                totalChange = inputTotalMoney - priceDrink1;
                                billChange = totalChange / 1000;
                                coinChange = (totalChange / 100) % 10;
//                                지폐 잔액 수정
                                if (billChange >= 5) {
                                    bill_5000--;
                                    bill_1000 -= bill_5000 - 5;
                                } else {
                                    bill_1000 -= billChange;
                                }
//                                동전 잔액 수정
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
                            System.out.printf("투입금액이 모자랍니다. 추가필요 금액 = %d%n", priceDrink1 - inputTotalMoney);
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
                            System.out.printf("선택한 %s 상품의 재고가 없습니다. 다시 선택해주세요.", drink1);
                            break;
                        }
                    case 2:
                        if (inputTotalMoney >= priceDrink2 && chooseDrink2) {
//                            음료 출력 여부
                            System.out.printf("$s 제품이 성공적으로 나왔습니다.%n", drink2);
                            System.out.printf("잔돈은 %d--입니다.%n", inputTotalMoney - priceDrink2);
//                            재고 수정 및 총금액 수정
                            bill_10000 += inputBill10000;
                            bill_5000 += inputBill5000;
                            bill_1000 += inputBill1000;
                            coin_500 += inputCoin500;
                            coin_100 += inputCoin100;
                            counterDrink2--;
                            totalMoney += inputTotalMoney - priceDrink2;
//                            잔돈 상태 수정
                            if (inputTotalMoney == 10000) {
                                totalChange = inputTotalMoney - priceDrink2;
                                billChange = totalChange / 1000;
                                coinChange = (totalChange / 100) % 10;
//                                지폐 잔액 수정
                                if (billChange >= 5) {
                                    bill_5000--;
                                    bill_1000 -= bill_5000 - 5;
                                } else {
                                    bill_1000 -= billChange;
                                }
//                                동전 잔액 수정
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
                            System.out.printf("투입금액이 모자랍니다. 추가필요 금액 = %d%n", priceDrink2 - inputTotalMoney);
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
                            System.out.printf("선택한 %s 상품의 재고가 없습니다. 다시 선택해주세요.", drink2);
                            break;
                        }
                    case 3:
                        if (inputTotalMoney >= priceDrink3 && chooseDrink3) {
//                            음료 출력 여부
                            System.out.printf("$s 제품이 성공적으로 나왔습니다.%n", drink3);
                            System.out.printf("잔돈은 %d--입니다.%n", inputTotalMoney - priceDrink3);
//                            재고 수정 및 총금액 수정
                            bill_10000 += inputBill10000;
                            bill_5000 += inputBill5000;
                            bill_1000 += inputBill1000;
                            coin_500 += inputCoin500;
                            coin_100 += inputCoin100;
                            counterDrink3--;
                            totalMoney += inputTotalMoney - priceDrink3;
//                            잔돈 상태 수정
                            if (inputTotalMoney == 10000) {
                                totalChange = inputTotalMoney - priceDrink3;
                                billChange = totalChange / 1000;
                                coinChange = (totalChange / 100) % 10;
//                                지폐 잔액 수정
                                if (billChange >= 5) {
                                    bill_5000--;
                                    bill_1000 -= bill_5000 - 5;
                                } else {
                                    bill_1000 -= billChange;
                                }
//                                동전 잔액 수정
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
                            System.out.printf("투입금액이 모자랍니다. 추가필요 금액 = %d%n", priceDrink3 - inputTotalMoney);
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
                            System.out.printf("선택한 %s 상품의 재고가 없습니다. 다시 선택해주세요.", drink3);
                            break;
                        }
                    case 4:
                        if (inputTotalMoney >= priceDrink4 && chooseDrink4) {
//                            음료 출력 여부
                            System.out.printf("$s 제품이 성공적으로 나왔습니다.%n", drink4);
                            System.out.printf("잔돈은 %d--입니다.%n", inputTotalMoney - priceDrink4);
//                            재고 수정 및 총금액 수정
                            bill_10000 += inputBill10000;
                            bill_5000 += inputBill5000;
                            bill_1000 += inputBill1000;
                            coin_500 += inputCoin500;
                            coin_100 += inputCoin100;
                            counterDrink4--;
                            totalMoney += inputTotalMoney - priceDrink4;
//                            잔돈 상태 수정
                            if (inputTotalMoney == 10000) {
                                totalChange = inputTotalMoney - priceDrink4;
                                billChange = totalChange / 1000;
                                coinChange = (totalChange / 100) % 10;
//                                지폐 잔액 수정
                                if (billChange >= 5) {
                                    bill_5000--;
                                    bill_1000 -= bill_5000 - 5;
                                } else {
                                    bill_1000 -= billChange;
                                }
//                                동전 잔액 수정
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
                            System.out.printf("투입금액이 모자랍니다. 추가필요 금액 = %d%n", priceDrink4 - inputTotalMoney);
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
                            System.out.printf("선택한 %s 상품의 재고가 없습니다. 다시 선택해주세요.", drink4);
                            break;
                        }
                    case 5:
                        while (!stopAdmin) {
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
                                        System.out.printf("1.%s\tprice:%d\tStock:%d", drink1, priceDrink1, counterDrink1);
                                        System.out.printf("1.%s\tprice:%d\tStock:%d", drink2, priceDrink2, counterDrink2);
                                        System.out.printf("1.%s\tprice:%d\tStock:%d", drink3, priceDrink3, counterDrink3);
                                        System.out.printf("1.%s\tprice:%d\tStock:%d", drink4, priceDrink4, counterDrink4);
                                        System.out.println();
                                        System.out.println("1.Back to the Upper Menu 2.exit");
                                        selSub = scanner.nextInt();
                                        if (selSub == 1) {
                                            break;
                                        } else if(selSub == 2){
                                            stopAdmin = true;
                                            break;
                                        }
                                    case 2:
                                    case 3:
                                    case 4:
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
            }
        }
    }
}
