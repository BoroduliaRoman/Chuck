package lesson04;

public class BankAccount {
	
	int id = 10;
	String name = "Petr";
	double balance = 100;

}

class BankAccountTest {
	
	public static void main(String[] args) {
		
		BankAccount myAccount = new BankAccount();
		BankAccount yourAccount = new BankAccount();
		BankAccount hisAccount = new BankAccount();
		
		myAccount.id = 1;
//		myAccount.name = "Roman";
		myAccount.balance = 12.35;
		
		yourAccount.id = 2;
		yourAccount.name = "Mike";
		yourAccount.balance = 2.00;
		
		hisAccount.id = 3;
		hisAccount.name = "Ivan";
		hisAccount.balance = 124.12;
		
		System.out.println(myAccount.name);
	}
}