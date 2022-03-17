package com.simplilearn.method.shop;

public class ShopOperations {

	public String shopName = ":: GolGappa Shop ::";

	// show Products details;

	public String showProduct(Shops shop) {
		if (shop != null) {
			return shop.prodName;

		}
		return null;

	}

	// buy Product

	public String buyProduct(Shops shop, int id) {
		if (id == shop.id) {
			System.out.println("Product Buy Successfully : " + id);
			return shop.prodName;
		} else {
			System.out.println("Invalid Product Id : " + id);
			return null;
		}
	}

	// sell Product
	public String sellProduct(Shops shop, int id) {
		if (id == shop.id) {
			System.out.println("Product Sell Successfully : " + id);
			return shop.prodName;
		} else {
			System.out.println("Invalid Product Id : " + id);
			return null;
		}
	}
}
