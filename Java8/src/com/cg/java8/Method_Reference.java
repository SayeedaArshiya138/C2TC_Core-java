package com.cg.java8;

import java.util.Arrays;
import java.util.*;

public class Method_Reference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,5,6,4,3);
		list.forEach(System.out::println);
		list.stream().distinct().forEach(System.out::println);
	   list.stream().limit(4).forEach(System.out::println);

	}

}
