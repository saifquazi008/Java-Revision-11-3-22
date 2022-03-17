package com.simplilearn.collection.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class EventQueue {

	public static void main(String[] args) {

		Queue<Events> eventQueue = new ArrayDeque<Events>();

		// insert data into queue
		eventQueue.add(new Events(101, "Poster", "10-10-2021", 100));
		eventQueue.add(new Events(102, "Dance", "12-10-2021", 150));
		eventQueue.add(new Events(103, "science exhibition", "13-10-2021", 200));
		eventQueue.add(new Events(104, "Programming competition", "15-10-2021", 300));

		for (Events event : eventQueue) {
			System.out.println(event.id);
			System.out.println(event.eventName);
			System.out.println(event.startDate);
			System.out.println(event.Fees);
			System.out.println("---------------");
		}

	}

}
