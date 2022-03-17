package com.simplilearn.method.shop;

public class Test {

	public static void main(String[] args) {

		// create a shop object

		Shops shop = new Shops(101, "GolGappa", 100, "It is a GolGappa ");

		ShopOperations operation = new ShopOperations();
		System.out.println("Wellcome to the  " + operation.shopName);

		System.out.println("----------------------------");

		System.out.println("Show Product : " + operation.showProduct(shop));

		System.out.println("----------------------------");

		System.out.println("Buy Product : " + operation.buyProduct(shop, 101));

		System.out.println("----------------------------");

		System.out.println("Sell Product : " + operation.sellProduct(shop, 101));

	}

}
