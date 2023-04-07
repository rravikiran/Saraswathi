package com.practise;

public class FirstClass {

	public void firstMethod() {

		System.out.println("Ravikiran");
	}

	public String name() {
		System.out.println("ramya");
		return "Ramya";

	}

	public static void main(String[] args) {

		FirstClass ramya = new FirstClass();

		ramya.firstMethod();

		System.out.println(ramya.name());

	}

}
