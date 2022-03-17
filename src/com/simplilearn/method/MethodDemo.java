package com.simplilearn.method;

public class MethodDemo {

	public static void main(String[] args) {

		MethodDemo demo = new MethodDemo();

		// method deceleration
		demo.showMessage();

		demo.displayAuthor("John Smith");

		demo.ageCalculator(1995);

		demo.retirementCalc("Saif Quazi", 1998);
		demo.retirementCalc("Wahid Khan ", 1890);

	}

	// user defined methods
	// 1. non parameterized method
	// 2. parameterized method

	// methods deceleration
	// non parameterized method

	public void showMessage() {
		System.out.println("wellcome to java Methods !");
	}

	// one parameterized methods
	public void displayAuthor(String name) {
		System.out.println("The Author : " + name);
	}

	public int ageCalculator(int yearOfBirth) {
		int age = 2022 - yearOfBirth;
		System.out.println("The user age is  : " + age);
		return age;

	}
	// two parameterized methods

	public void retirementCalc(String name, int yearOfBirth) {
		int age = ageCalculator(yearOfBirth);
		if (age > 65) {
			System.out.println("Hi , " + name + "You are Already retired !");

		} else {
			System.out.println("Hi , " + name + " you have " + (65 - age) + "Year of retirement !");
		}
	}

}
