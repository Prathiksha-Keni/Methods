package com.xworkz.methods;

public class billGeneration 
{
	public static void BillGeneration(int price,int quantity) 
	{
		int total=price*quantity;
		System.out.println("Total amount is "+total);
	}
	public static void main(String[] args) 
	{
		System.out.println("Welcome");	
		billGeneration.BillGeneration(15, 10);
	}
}
