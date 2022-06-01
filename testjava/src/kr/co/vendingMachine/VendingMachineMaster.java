package kr.co.vendingMachine;

public class VendingMachineMaster {
//	field
	String[] drinkName = new String[10];
	int[] drinkPrice = new int[10];
	int[] drinkStock = new int[10];
	boolean[] drinkOnsale = new boolean[10];
//	constant
	final int SUCCESS = 1;
	final int SUCCESS_MENU = 2;
	final int ERROR_LACKOFMONEY = -1;
	final int ERROR_LACKOFSTOCK = -2;
	final int ERROR_MISSTYPE = -3;
	
//	method
	public void pressButton(int number) {
		if(number==1) {
			System.out.println("===========================");
			System.out.println("Java Vending Machine Start");
			System.out.println("==========================");
		} else if(number==0) {
			System.out.println("======================");
			System.out.println("======Power Off=======");
			System.out.println("======================");
		}	else {
			System.out.println("check paramter");
		}
	}
	public void showMenu() {
		System.out.println("=======================================");
		System.out.println("Menu Information");
		for(int i=0; i<drinkName.length;i++) {
			System.out.printf("%d.%s\tprice:%d\tOnsale:%b%n", i + 1, drinkName[i], drinkPrice[i],
					drinkOnsale[i]);
		}
	}
//	input money
	
//	select product

}
