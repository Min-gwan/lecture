package kr.co.obj;

public class AccountTest{
	public static void main(String[] args) {
		Account dummy = new Account();
		/*
		dummy.accountNumber = "123-456-789";
		dummy.ownerName = "hong";
		dummy.balance = 5000;
		*/
		dummy.setAccountNumber("123-456-789");
		dummy.setOwnerName("Kim");
		dummy.setBalance(10000);
		System.out.println("���¹�ȣ: "+ dummy.getAccountNumber());
		System.out.println("������: " + dummy.getOwnerName());
		System.out.println("�ܾ�: " + dummy.getBalance());
		
		Account account = new Account("1234-567-89","Hong", 1000);
		account.doposit(10000);
		account.withraw(5000);
		account.withraw(10000);
	}
	
}