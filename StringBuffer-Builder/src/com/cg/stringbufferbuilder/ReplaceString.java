package com.cg.stringbufferbuilder;

public class ReplaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Hello ");
		sb.replace(1,3," java");
		System.out.println(sb);
	}

}//begin and end index