package kr.co.obj;

public class Account {
	/*
	 * �������Ŭ���� -> Account
	 * - ���¹�ȣ
	 * - ������ �̸�
	 * - �ܾ�
	 * => �����Ѵ�.
	 * => �����Ѵ�.
	 * => ������
	 */
//	constructor
	public Account() {
		System.out.println("���� ��ü�� ����������ϴ�.");
		System.out.println();
	}
	public Account(String accountNumber, String ownerName, int balance) {
		this.accountNumber = accountNumber;
		this.ownerName = ownerName;
		this.balance = balance;
		System.out.println("������ �����Ǿ����ϴ�.");
		System.out.println("���¹�ȣ: "+ this.accountNumber);
		System.out.println("������: " + this.ownerName);
		System.out.println("�ܾ�: " + this.balance);
		System.out.println();
	}
//	field
	private String accountNumber;
	private String ownerName;
	private int balance;
//	method
	void doposit(int amount) {
		balance += amount;
		System.out.println(amount+"���� �ԱݵǾ����ϴ�.");
		System.out.println("�ܾ��� "+balance+"�� �Դϴ�.");
		System.out.println();
	}
	
	int withraw(int amount) {
		if(balance<amount) {
			System.out.println("�ܾ��� �����մϴ�");
			System.out.println();
			return 0;
		}
		balance -= amount;
		System.out.println(amount+"���� ����Ǿ����ϴ�.");
		System.out.println("�ܾ��� "+balance+"�� �Դϴ�.");
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
