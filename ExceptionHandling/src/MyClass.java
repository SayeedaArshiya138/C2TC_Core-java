import java.util.*;
public class MyClass {

	public static void main(String[] args) {
		Myclass obj=new Myclass();
		try {
			obj.math();
			
		}
		catch(ArithmaticException e) 
		{
			System.out.println("Arithmatic option thrown by math1()methodcaught in main() method");
		}
	}
	public void main() {
		try {
			System.out.println(100/0);
		}
		catch(NullPointerException nullExp)
		{
			System.out.println("No have an Exception");
					
		}
		// TODO Auto-generated method stub

	}

}
