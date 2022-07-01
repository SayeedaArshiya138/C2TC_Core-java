package com.lambdaexpression;

import java.util.ArrayList;

import java.util.List;

public class forEach {

 public static void main(String[] args) {

List<String> obj = new ArrayList<String>();

obj.add("Revanth"); 
obj.add("Ranjani"); //aple for loop, for each, iterator for(String) (

//System.out.println(e); //taternal iteration

obj.forEach(temp -> System.out.println(temp));
 }
}//internal iteration
