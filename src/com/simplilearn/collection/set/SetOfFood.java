package com.simplilearn.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetOfFood {
	public static void main(String[] args) {

		// create employee object
		Food food1 = new Food(101, "Apple", 160, "It is an apple");
		Food food2 = new Food(102, "Banana", 150, "It is a Banana ");
		Food food3 = new Food(103, "Mango", 100, "It is a Mango");
		Food food4 = new Food(104, "sandwich", 140, "It is a Sandwich");

		// create a set
		Set<Food> foodItems = new LinkedHashSet<Food>();

		foodItems.add(food1);
		foodItems.add(food2);
		foodItems.add(food3);
		foodItems.add(food4);

		System.out.println(foodItems);
		System.out.println("-----------------------");

		// set iteration with iterator
		Iterator<Food> itr = foodItems.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
	}
}
