package kr.co.obj;

public class Account {
	/*
	 * 은행계좌클래스 -> Account
	 * - 계좌번호
	 * - 예금주 이름
	 * - 잔액
	 * => 예금한다.
	 * => 인출한다.
	 * => 생성자
	 */
//	constructor
	public Account() {
		System.out.println("더미 객체가 만들어졌습니다.");
		System.out.println();
	}
	public Account(String accountNumber, String ownerName, int balance) {
		this.accountNumber = accountNumber;
		this.ownerName = ownerName;
		this.balance = balance;
		System.out.println("통장이 개설되었습니다.");
		System.out.println("계좌번호: "+ this.accountNumber);
		System.out.println("예금주: " + this.ownerName);
		System.out.println("잔액: " + this.balance);
		System.out.println();
	}
//	field
	private String accountNumber;
	private String ownerName;
	private int balance;
//	method
	void doposit(int amount) {
		balance += amount;
		System.out.println(amount+"원이 입금되었습니다.");
		System.out.println("잔액은 "+balance+"원 입니다.");
		System.out.println();
	}
	
	int withraw(int amount) {
		if(balance<amount) {
			System.out.println("잔액이 부족합니다");
			System.out.println();
			return 0;
		}
		balance -= amount;
		System.out.println(amount+"원이 인출되었습니다.");
		System.out.println("잔액은 "+balance+"원 입니다.");
		return balance;
	}
//	getter and setter
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
