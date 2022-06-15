package exception_handling;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First LINE");
		System.out.println("Second line");
		int[] myIntArray = new int[] {1,2,3};
		print(myIntArray);
		System.out.println("Third Line");
	}
	public static void print(int[] arr) {
		System.out.println(arr[2]);
System.out.println("Fourth element sucessfully displayed!");
	}

}
