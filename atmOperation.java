package com.xworkz.methods;

public class atmOperation 
{
	public static void chcekBalance(int balance,String password) 
	{
		String pws="p123";
		if (pws==password) 
		{
			System.out.println("Balance avaliable is "+balance);
		} else
		{
		System.out.println("Password Incorrect!! please enter the correct password");
		}	
	}
	public static void withdraw(int amountWithdraw,String password) 
	{
		String pws="p123";
		int accountBalance=50000;
/*		if (accountBalance>amountWithdraw && pws==password) 
		{
			System.out.println("Amount withdraw is "+amountWithdraw);
		} else
		{
		System.out.println("Incorrect Password or Low Balance");
		}*/
		if(pws!=password)
		{
			System.out.println("Password Incorrect!!");
		}
		else if (accountBalance>amountWithdraw) 
		{
			System.out.println("Amount withdraw is "+amountWithdraw);
		} 
		else {
			System.out.println("Low Balance");
		}	
	}
	public static void main(String[] args) {
		atmOperation.chcekBalance(50000, "p123");
		atmOperation.withdraw(500, "p123");
	}

}
