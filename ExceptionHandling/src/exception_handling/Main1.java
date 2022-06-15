package exception_handling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Main1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try{
			fis=new FileInputStream("\"C:\\Users\\Aftab\\Desktop\\ars.txt\"");
		
		
		}
			catch(FileNotFoundException fnfe){
		System.out.println("The Specified file is not " +"present at the given path");
		}
		int k;
		try{
		
		
		
			while((k=fis.read() ) !=-1)
		
		{
			System.out.println((char)k);
		}
			fis.close();
		}
		// TODO Auto-generated method stub
 catch(IOException ioe) {
	 System.out.println("I/O error occured: "+ioe);
 }
	}

}
