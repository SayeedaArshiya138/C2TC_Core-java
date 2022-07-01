package com.tns.array2d;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class LinkedListdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list= new LinkedList();
		list.add("RAJ");
		list.add(4);
		list.add("Heamnth");
		list.add(8);
		System.out.println("The initial Linked list is :"+list);//heterogenous linked list
	((LinkedList)list).offer("Astha");//typecast to linkedlist otherwisw offer does not work
		System.out.println("linkedlist after inserting using offer(): " +list);
		
				

	}

}
