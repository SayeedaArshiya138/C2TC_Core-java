package com.tns.array2d;
import java.util.LinkedHashSet;

public class LinkedhashSetdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet linked = new LinkedHashSet();
		linked.add("Rahul");//preserve case
		linked.add('A');
		linked.add("Rohan");
		linked.add(8);
		linked.add(90.0f);
		linked.add(null);
		linked.add(8);
		System.out.println("The data in the set:" +linked);


	}

}
