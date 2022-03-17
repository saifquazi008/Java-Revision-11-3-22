package com.simplilearn.collection.set;

public class Food {
	public long id;
	public String foodName;
	public double price;
	public String desc;

	public Food() {
		super();
	}

	public Food(long id, String foodName, double price, String desc) {
		super();
		this.id = id;
		this.foodName = foodName;
		this.price = price;
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Food [id=" + id + ", foodName=" + foodName + ", price=" + price + ", desc=" + desc + "]";
	}

}
