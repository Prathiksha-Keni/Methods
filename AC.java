package com.xworkz.methods;

public class AC 
{
	public static void turnOn()
	{
		System.out.println("AC turned on");
	}
	public static void turnOff()
	{
		System.out.println("AC turned off");
	}
	public static void temperatureIncreased()
	{
		System.out.println("AC temperature Increased");
	}
	public static void temperatureDecreased()
	{
		System.out.println("AC temperature Decreased");
	}
	public static void swingMoodOn()
	{
		System.out.println("AC Swing mood On");
	}
	public static void swingMoodOff()
	{
		System.out.println("AC Swing mood Off");
	}
	public static void main(String[] args) 
	{
		AC.turnOn();
		AC.temperatureIncreased();
		AC.temperatureDecreased();
		AC.swingMoodOn();
		AC.swingMoodOff();
		AC.turnOff();
	}
}
