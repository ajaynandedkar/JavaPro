package ExceptionDemo;

public class ThrowDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account();
		a.withdrawAmount(100000);
	}

}
class Account{
	
	int balance=30000;
	void withdrawAmount(int amount)
	{
		if(balance>amount)
		{
			balance=balance-amount;
			System.out.println("Balance = "+balance);
		}
		else
		{
			//System.out.println("Insufficient balance!");
			throw new MyException("Insufficient balance!"); //calling MyException constructor from MyException
		}
	}
}