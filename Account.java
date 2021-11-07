class Account
{
	double balance;
	double getwithdraw(double Amount)
	{
		balance=balance-Amount;
		return balance;
	}
	public static void main(String args[])
	{
		Account acc=new Account();
		acc.balance=6000;
		acc.getwithdraw(1000);
		if(acc.balance<5000)
			System.out.println("-1");
		else
			System.out.println(acc.balance);
	}
}