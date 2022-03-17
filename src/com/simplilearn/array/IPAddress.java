package com.simplilearn.array;

public class IPAddress {

	public static void main(String[] args) {

		// create empty array size
		String[] ipAddress = new String[4];

		// insert data into array

		ipAddress[0] = "192.168.11.13";
		ipAddress[1] = "192.168.11.15";
		ipAddress[2] = "21.12.11.3344";
		ipAddress[3] = "92.68.1122.14565";

		// access data from array
		System.out.println("IP Address at index 1 :  " + ipAddress[1]);
		System.out.println("-----------------");
		System.out.println("IP Address at index 2 :  " + ipAddress[2]);

		System.out.println("-----------------");

		// access elements with iteration

		for (int index = 0; index < ipAddress.length; index++) {
			System.out.println("Element at index : " + index + " value : " + ipAddress[index]);
			System.out.println("-----------------");
		}

	}

}
