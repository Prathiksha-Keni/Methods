package com.xworkz.methods;

public class vtuResult
{
	public static boolean checkResult(String usn)
	{
		String USN="1ap15is085";
		if(USN==usn)
		{
			return true;
		}else
		{
			return false;
		}
	}
	public static void main(String[] args)
	{
		boolean result=vtuResult.checkResult("1ap15is085");
		if(result==true)
		{
			System.out.println("Your Percentage is 80%");
		}else
		{
			System.out.println("Your Percentage is 0%");
		}
	}
}
