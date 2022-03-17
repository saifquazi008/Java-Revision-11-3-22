package com.simplilearn.stringhandling;

public class ImmutableStringDemo {

	public static void main(String[] args) {

		// In java, string objects are immutable.
		// Immutable simply means unmodifiable or non changeable values.

		String userName = "Jhon";

		// concat() -> update the string

		String response = userName.concat("Smith");

		System.out.println(userName);// old name -> old string

		System.out.println(response);// new name -> new String

	}

}
