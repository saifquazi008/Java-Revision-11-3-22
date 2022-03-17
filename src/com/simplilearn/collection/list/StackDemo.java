package com.simplilearn.collection.list;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		List<String> listOfCars = new Stack<String>();

		listOfCars.add("Audi");
		listOfCars.add("BMW");
		listOfCars.add("Datsun");
		listOfCars.add("Ferrari");
		listOfCars.add("Ford");

		System.out.println(listOfCars);
		System.out.println("------------------------");
		System.out.println("The index no 4 : " + listOfCars.get(4));

		System.out.println("------------------------");

		// iteration over list

		Iterator<String> itr = listOfCars.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("------------------------");

		// for loop with counter
		for (int index = 0; index < listOfCars.size(); index++) {
			System.out.println("The index : " + index + " and name : " + listOfCars.get(index));

		}
		System.out.println("------------------------");

		// enhance for loop

		for (String name : listOfCars) {
			System.out.println("The name : " + name);
		}

	}

}
