package com.xworkz.methods;

public class fan 
{
	public static void turnOn()
	{
		System.out.println("Fan turned on");
	}
	public static void turnOff()
	{
		System.out.println("Fan turned off");
	}
	public static void speedIncreased()
	{
		System.out.println("Fan Speed Increased");
	}
	public static void speedDecreased()
	{
		System.out.println("Fan Speed Decreased");
	}
	public static void main(String[] args)
	{
		fan.turnOn();
		fan.speedIncreased();
		fan.speedDecreased();
		fan.turnOff();

	}
}
