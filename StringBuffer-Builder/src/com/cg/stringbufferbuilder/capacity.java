package com.cg.stringbufferbuilder;

public class capacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           StringBuffer sb =new StringBuffer();
           System.out.println(sb.capacity());
           sb.append("Hello");
           System.out.println(sb.capacity());
           sb.append("java is my favourite language");
           System.out.println(sb.capacity());
	}

}
