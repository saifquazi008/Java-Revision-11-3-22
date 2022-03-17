package com.simplilearn.accessmodifier;

public class PublicAccessModifierDemo {

	public static void main(String[] args) {

		Govn govn = new Govn();

		System.out.println("The public transport is  : " + govn.Transportation);
		System.out.println("The public park  is : " + govn.park);
		System.out.println("The public assets is : " + govn.assets);

		System.out.println(govn.showPark());
		System.err.println(govn.showPublicAssets());

	}

}

class Govn {

	// public variable

	public String Transportation = "Train";
	public String park = "XYZ Park";
	public double assets = 22436546d;

	// public method
	public double showPublicAssets() {
		return assets;

	}

	public String showPark() {
		return park;

	}

	// public constructor
	public Govn() {
	}

}
