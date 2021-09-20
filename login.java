package com.xworkz.methods;

public class login 
{
	public static boolean loginto(String userName,String password)
	{
		String user="xworkz";
		String pws="x123w";
		if(user==userName && password==pws)
		{
			return true;
		}else
		{
			return false;
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Welcome to login page");
		boolean validUser =login.loginto("xworkz", "x123");
		if(validUser==true)
		{
			System.out.println("Login successfull");
		}else
		{
			System.out.println("Invalid user");
		}
	}
}
