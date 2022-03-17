package com.simplilearn.array;

public class Price {

	public static void main(String[] args) {

		// create empty array size as 5
		float[] prices = new float[4];

		// insert data inot array

		prices[0] = 4033.433f;
		prices[1] = 4305.55f;
		prices[2] = 4344f;
		prices[3] = 124.3f;

		// access data from array
		System.out.println("Price at index 1 : " + prices[1]);
		System.out.println("---------------------------------");
		System.out.println("Price at index 3 : " + prices[3]);
		System.out.println("---------------------------------");

		for (int index = 0; index < prices.length; index++) {
			System.out.println("Element at index : " + index + " value : " + prices[index]);
			System.out.println("---------------------------------");
		}
	}
}
