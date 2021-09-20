package com.xworkz.methods;

public class weatherForecast
{
	public static double temperature()
	{
		return 28.4;
	}
	public static void main(String[] args)
	{
		double temp=weatherForecast.temperature();
		System.out.println("The temperature is"+temp);
	}
}
