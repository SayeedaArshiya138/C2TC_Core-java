
public class Myclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.out.println(Myclass2.myMethod());
          
	}
	public static int myMethod() {
		try {
			return 0;
		}
		finally {
			System.out.println("This is Finally Block");
			System.out.println("Finally block ran even after return staement");
		}
	}

}
