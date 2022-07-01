package com.cg.java8;

import java.util.Arrays;
import java.util.List;

public class Doubleit {
	public  void doubleit(int i) {
		System.out.println(i*2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(1,2,3,4,5,6);
	//	list.forEach(i-> doubleit(i));//internal iteration
		
		list.forEach(new Doubleit()::doubleit);//becouse of static method no need of object
	//method reference
	}

}
//stream