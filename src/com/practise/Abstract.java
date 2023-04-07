package com.practise;

public class Abstract {

	public static void main(String[] args) {

		Nookia n = new Apple();
		n.call();
		n.musicSystem();
		n.touchScreen();
	}

}

abstract class Nookia {

	public void call() {

		System.out.println("Calling function implemented");

	}

	public abstract void musicSystem();

	public abstract void touchScreen();

}

abstract class Samsung extends Nookia {

	public void musicSystem() {

		System.out.println("Music system implemented");

	}

	public abstract void touchScreen();

}

class Apple extends Samsung {

	public void touchScreen() {
		System.out.println("Touch screen implemented");
	}

}
