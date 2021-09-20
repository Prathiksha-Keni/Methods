package com.xworkz.methods;

public class tollGate 
{
	public static void checkPrice(String vehicleType)
	{
		if (vehicleType=="bike")
		{
			System.out.println("Toll price for bike is 20 rs");
		} else if(vehicleType=="car")
		{
			System.out.println("Toll price for car is 30 rs");
		} else if (vehicleType=="lorry")
		{
			System.out.println("Toll price for lorry is 40 rs");
		}else if (vehicleType=="pbus")
		{
			System.out.println("Toll price for private bus is 45 rs");
		}else
		{
			System.out.println("free");
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Toll gate");
		tollGate.checkPrice("car");
	}
}
