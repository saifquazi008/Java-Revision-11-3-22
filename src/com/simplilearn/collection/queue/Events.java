package com.simplilearn.collection.queue;

import java.util.Date;

public class Events {

	public long id;
	public String eventName;
	public String startDate;
	public double Fees;

	public Events(long id, String eventName, String startDate, double fees) {
		super();
		this.id = id;
		this.eventName = eventName;
		this.startDate = startDate;
		Fees = fees;
	}

	public Events() {
		super();
	}

	@Override
	public String toString() {
		return "Events [id=" + id + ", eventName=" + eventName + ", startDate=" + startDate + ", Fees=" + Fees + "]";
	}

}
