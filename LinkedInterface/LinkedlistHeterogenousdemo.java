package com.tns.array2d;

import java.util.List;
import java.util.LinkedList;

public class LinkedlistHeterogenousdemo {
	public static void main(String[] args) {
		List list = new LinkedList();
		list.add("Avinash");
		
		list.add(6);
		list.add("Ajay");
		list.add(56.7f);
		list.add(null);
		list.add(6);
		System.out.println(((LinkedList)list).offer("sanjay"));//add to last n return true
		System.out.println(list);
	}

}







