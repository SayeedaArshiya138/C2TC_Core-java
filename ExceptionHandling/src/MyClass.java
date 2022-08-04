import java.util.*;
public class MyClass {

	public static void main(String[] args) {
		MyClass obj=new MyClass();
		try {
		obj.Main1();
			
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
