package assignments_Core_Java;

abstract class Bank{
	abstract public void getBalance();
}

class BankA extends Bank{
	public void getBalance() {
		System.out.println("Balance in BankA $100 Deposited");
	}
}

class BankB extends Bank{
	public void getBalance() {
		System.out.println("Balance in BankB $150 Deposited");	
	}
}

class BankC extends Bank{
	public void getBalance() {
		System.out.println("Balance in BankC $200 Deposited");	
	}
}

public class BankAbstractClass {
	public static void main(String[] args) {
		BankA ba = new BankA();
		ba.getBalance();
		BankB bb = new BankB();
		bb.getBalance();
		BankC bc = new BankC();
		bc.getBalance();
	}
}
