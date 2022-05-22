package kr.co.checkpoint;

import java.util.Scanner;

public class VendingMachine03_1 {

	public static void main(String[] args) {
//		user variable
		String userInput = null;
		String userSelcect = null;
		
		int parseInput = 0;
		int parseSelect = 0;

//		master variable
		
//		about product
		
//		product_name
		String product1Name = "Monster";
		String product2Name = "Hot-Six";
		String product3Name = "Coca-Cola";
		String product4Name = "Pepsi";
		String product5Name = "Cider";

//		product price
		int price1 = 3000;
		int price2 = 2500;
		int price3 = 1600;
		int price4 = 1500;
		int price5 = 1300;
		
//		product stock
		int stock1 = 100;
		int stock2 = 100;
		int stock3 = 100;
		int stock4 = 100;
		int stock5 = 100;
		
//		on sale
		boolean onSale1=false;
		boolean onSale2=false;
		boolean onSale3=false;
		boolean onSale4=false;
		boolean onSale5=false;
		
//		state
		int state = -1;
		final int SUCCESS = 1;
		final int ERROR_LACKOFMONEY = 2;
		final int ERROR_LACKOFSTOCK = 3;
		final int ERROR_MiSSTYPE = 4;

//		safe
		int masterTotalMoney = 100000;

//		administration variable
		String adminAccount = "admin01";
		String adminPassword = "pass1234";

		int adminSelect = 0;
//		needed to process
		Scanner scanner = null;

//		process start

//		If user press the button
		System.out.println("===========================");
		System.out.println("Java Vending Machine Start");
		System.out.println("==========================");
		System.out.println();
		System.out.println();
//		Ready To Start
		
		scanner = new Scanner(System.in);
		state = SUCCESS;
//		Main logic Start
		while (state == SUCCESS) {
			System.out.println("Insert The Money. Plz use only number.");
			System.out.print("Sum>");
			userInput = scanner.nextLine();
			for (int i = 0; i < userInput.length(); i++) {
				char charToIdentify = userInput.charAt(i);
				if (charToIdentify < 48 || charToIdentify > 57) {
					state = ERROR_MiSSTYPE;
					break;
				}
			}
			if(state ==SUCCESS) {
				parseInput = Integer.parseInt(userInput);				
			}
			while(state==ERROR_MiSSTYPE) {
				System.out.println("Don't Use Charcter");
				System.out.print("Sum>");
				userInput = scanner.nextLine();
				for (int i = 0; i < userInput.length(); i++) {
					char charToIdentify = userInput.charAt(i);
					if (charToIdentify < 48 || charToIdentify > 57) {
						break;
					} else {
						state = SUCCESS;
					}
				}
				if(state==SUCCESS) {
					parseInput = Integer.parseInt(userInput);					
				}
			} 
			System.out.println("parse:"+parseInput);
			System.out.println();
			System.out.println();
//			Menu Console and Select
			System.out.println("=======================================");
			System.out.println("Menu Information");
			System.out.println("");
//			provide process
		} // Main logic end
		
//		Power Off
		System.out.println("======================");
		System.out.println("======Power Off=======");
		System.out.println("======================");
	}

}
