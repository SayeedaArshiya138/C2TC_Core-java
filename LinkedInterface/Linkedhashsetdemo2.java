package com.tns.array2d;

import java.util.LinkedHashSet;

public class Linkedhashsetdemo2 {

	public static void main(String[] args) {
		LinkedHashSet<String> linkedset= new LinkedHashSet<String>();
		linkedset.add("Create");
		linkedset.add("Own");
		linkedset.add("Program");
		System.out.println(linkedset);
		Object[] arr =linkedset.toArray()
;
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j] );
		// TODO Auto-generated method stub

	}
	}
}
