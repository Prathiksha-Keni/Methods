package com.xworkz.methods;

public class phonePay 
{
	public static void mobileRecharge(int amount,long phoneNumber)
	{
		System.out.println("Mobile recharge sucessfull for "+phoneNumber);
	}
	public static void dthRecharge(int amount,int customerId)
	{
		System.out.println("DTH recharge sucessfull for customer Id "+customerId);
	}
	public static void electricityBill(int price,int customerId) 
	{
		System.out.println("Electricity Bill paid sucessfully for customer Id "+customerId);
	}
	public static void waterBill(int price,int customerId)
	{
		System.out.println("Water Bill paid sucessfully for customer Id "+customerId);
	}
	private static void moneyTransfer(int amount,long phoneNumber)
	{
		System.out.println("Money Transfered sucessfull for "+phoneNumber);
		
	}
	public static void main(String[] args) {
		System.out.println("Login to phone pay");
		phonePay.mobileRecharge(250,9874563524L);
		phonePay.dthRecharge(600,4526854);
		phonePay.electricityBill(780, 75420145);
		phonePay.waterBill(800, 456821547);
		phonePay.moneyTransfer(500,7584632545L);
		System.out.println("Log out from phone pay");
	}
}
