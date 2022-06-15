package com.cg.exceptionhandling;

public class ExeClass {
	public static void main(String[] args) {
		ExeClass ob = new ExeClass();
		ob.display();
	}
	public void display() {
		try {
			System.out.println(100/0);
		}
		catch(ArithmeticException  e) {
			System.out.println("There occur an arithmetic exception: +e");
		}
		catch(Exception exe) {
			System.out.println("There occur an  exception: +exe");
		}
		
		
	}

}
