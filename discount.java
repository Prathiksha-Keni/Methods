package com.xworkz.methods;

public class discount
{
	public static double discountPercentage(int billPrice)
	{
		double dis;
		if(billPrice==5000)
		{
			dis=5000-(5000*0.15);
			return dis;
		}else if(billPrice==6000)
		{
			dis=6000-(6000*0.16);
			return dis;
		}
		else if(billPrice==7000)
		{
			dis=7000-(7000*0.17);
			return dis;
		}else if(billPrice==8000)
		{
			dis=8000-(8000*0.18);
			return dis;
		}else
		{
			return 0.0;
		}
	}

	public static void main(String[] args)
	{
		double total=discount.discountPercentage(6000);
		System.out.println("The discount amount is "+total);
	}
}
