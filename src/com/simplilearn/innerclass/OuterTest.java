package com.simplilearn.innerclass;

public class OuterTest {

	// data variables
	private double amount = 45456.567;
	public String message = "Today is a good day!";

	// non static inner class

	class InnerTest {
		private String data = "Hello & Wellcome !";

		public void showData() {
			System.out.println("Outer class Data " + amount);
			System.out.println("Outer class data " + message);
			System.out.println("Inner Class Data " + data);

		}
	}

	public static void main(String[] args) {
		// create outer class object
		OuterTest test = new OuterTest();

		// create inner class object from outer class object
		InnerTest inner = test.new InnerTest();

		inner.showData();

	}
}
