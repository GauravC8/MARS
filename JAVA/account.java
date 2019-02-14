class Account
{
	String name;
	protected double balance;
	Account(String str,double amt)
	{
		name=str;
		balance=amt;
	}
	String getName()
	{
		return name;
	}
	double getBalance()
	{
		return balance;
	}
	void deposit(double amt)
	{
		balance+=amt;
		System.out.println("Depositing: "+amt);
	}
	void withdraw(double amt)
	{
		balance-=amt;
		System.out.println("Withdrawing"+amt);
	}
}
class SavingAccount extends Account
{
	double interestRate;
	SavingAccount(String str,double amt,double rate)
	{
		super(str,amt);
		interestRate=rate;
	}
	
}
class CheckingAccount extends Account{
	double overDraft;
	CheckingAccount(String str,double amt)
	{
		super(str,amt);
	}
	CheckingAccount(String str,double amt,double draft)
	{
		super(str,amt);
		overDraft=draft;
	}
	void withdraw(double amt)
	{
		System.out.println("OverDrafted amount : "+overDraft);
		if(amt<=balance)
		{
			balance-=amt;
		}
		else if((amt>balance) &&(amt>(balance+overDraft)))
		{
			System.out.println("You cannot withdraw Balance is low");
		}
		else
		{
			double result = amt-balance;
			overDraft-=result;
			balance=0;
			System.out.println("Withdrawing : "+ amt);
			System.out.println("Current overDraft Amount : "+overDraft);
		}
	}
}
class AccountTest
{
	public static void main(String[] ar)
	{
		SavingAccount sAcct= new SavingAccount("Jonney",5000,4);
		System.out.println("\n ....Svaing Account Details.....");
		System.out.println("" + sAcct.getName() +" has an initial Balance of: "+sAcct.getBalance());
		sAcct.deposit(2000);
		sAcct.withdraw(2000);
		System.out.println("" + sAcct.getName()+" at the end of transaction has a Balance of: "+sAcct.getBalance());
				
		System.out.println(".....Checking Account details...");
		CheckingAccount cAcct=new CheckingAccount("Steepheny",2000,2000);
		System.out.println("" + cAcct.getName() +" has an initial Balance of: "+cAcct.getBalance());
		cAcct.deposit(2000);
		cAcct.withdraw(5000);
		System.out.println("" + cAcct.getName()+" at the end of transaction has a Balance of: "+cAcct.getBalance());
	}
}