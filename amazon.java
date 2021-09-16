package com.xworkz.methods;

public class amazon {

	public static void order()
	{
		System.out.println("Order Placed Successfully");
	}
	public static void addToCart()
	{
		System.out.println("Item added to cart");
	}
	public static void viewProducts()
	{
		System.out.println("Product viewed");
	}
	public static void payment()
	{
		System.out.println("Payement Successfully");
	}
	public static void main(String[] args) {
		System.out.println("Login to Amazon");
		amazon.order();
		amazon.addToCart();
		amazon.viewProducts();
		amazon.payment();
		System.out.println("Logout");

	}

}
