package com.simplilearn.array;

import java.util.Arrays;

public class EmployeeArray {

	public static void main(String[] args) {

		// create employee array
		Employee[] empList = new Employee[5];

		// insert data into employee array
		empList[0] = new Employee(101, "Jhon Baba", "Eng", 23346.64);
		empList[1] = new Employee(102, "Mike baba", "Dev", 23445.46);
		empList[2] = new Employee(103, "Will Baba", "HR", 55443.5);

		System.out.println(Arrays.toString(empList));

		System.out.println(empList[1]);
		System.out.println(empList[4]);
	}

}
