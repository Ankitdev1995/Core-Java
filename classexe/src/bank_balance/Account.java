package bank_balance;

public class Account {
	int id;
	String name;
	float balance;

 void deposite(float amount){
		balance = balance+ amount;
	}
	void withdraw(float amount){
		balance= balance-amount;
		
	}
	void showbalance(){
		System.out.println(name+" "+ "balance"+ " " + balance );
	}
	
	
}
