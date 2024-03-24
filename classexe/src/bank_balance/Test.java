package bank_balance;

public class Test {

	public static void main(String[] args) {
	Account a1= new Account();
	Account a2= new Account();
	Account a3= new Account();
	
	a1.id=101;
	a1.name="Akshay";
	a1.balance=50000;
	
	a1.deposite(10000);
	a1.showbalance();
	
	a1.withdraw(20000);
	a1.showbalance();
	}

}
