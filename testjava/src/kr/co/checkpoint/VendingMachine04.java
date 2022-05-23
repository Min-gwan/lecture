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
		String[] productName = new String[10];
		
//		product price
		int[] productPrice = new int[10];
		
//		product stock
		int[] productStock = new int[10];
		
//		on sale
		boolean[] productOnsale = new boolean[10];
		
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
		
//		press start button
		System.out.println("===========================");
		System.out.println("Java Vending Machine Start");
		System.out.println("==========================");
		System.out.println();
		System.out.println();
		
//		Ready To Start
//		variable initialization
		productName[0]="Moster";
		productName[1]="Hot-Six";
		productName[2]="Coca-Cola";
		productName[3]="Pepsi";
		productName[4]="Cider";
		
		productPrice[0]=3000;
		productPrice[1]=2500;
		productPrice[2]=1600;
		productPrice[3]=1500;
		productPrice[4]=1300;
		
		productStock[0]=100;
		productStock[1]=100;
		productStock[2]=100;
		productStock[3]=100;
		productStock[4]=100;
		
		productOnsale[0]=true;
		productOnsale[1]=true;
		productOnsale[2]=true;
		productOnsale[3]=true;
		productOnsale[4]=true;
		
		scanner = new Scanner(System.in);
		state = SUCCESS;
		
//		Main logic Start
		while(state==SUCCESS) {
			System.out.println("Insert The Money. Plz use only number.");
			System.out.print("Sum>");
			userInput = scanner.nextLine();
			for(int i=0;i<userInput.length();i++) {
				char charToIdentifier = userInput.charAt(i);
				if(charToIdentifier<48||charToIdentifier>57) {
					state = ERROR_MiSSTYPE;
					break;
				}
			}
			if(state==SUCCESS) {
				
			}
		}
	}
}
