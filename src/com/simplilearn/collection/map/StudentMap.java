package com.simplilearn.collection.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class StudentMap {

	public static void main(String[] args) {

		Map<Integer, Student> studentMap = new LinkedHashMap<Integer, Student>();

		studentMap.put(101, new Student(1, "Saif Quazi", "Dev"));
		studentMap.put(102, new Student(2, "Asfar sheikh", "HR"));
		studentMap.put(103, new Student(3, "Wasim Quazi", "Sci"));
		studentMap.put(104, new Student(4, "Shahid Khan", "Comm"));

		System.out.println(studentMap);

		System.out.println("101 Student :->" + studentMap.get(101));
		System.out.println("102 Student :->" + studentMap.get(103));
		System.out.println("--------------");

		for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {

			System.out.println("Key : " + entry.getKey());
			System.out.println("Value : " + entry.getValue());
		}
	}

}
