package com.cg.java8;

public interface Actor {
	void act();
	void speak();
	default void comedy() {
		System.out.println("I can make comedy");
	}

}
