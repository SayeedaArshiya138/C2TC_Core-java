
public class Static {
		
		int rollno;
		String name;
		static String college="ITS";
		Static(int r,String n)
		{
			rollno=r;
			name=n;
			
			
		}
		static void change() {
			college="BDGIT";
			
		}
		void display()
		{
			System.out.println(rollno+" "+name+" "+college);
		}
		
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	         Static s1=new Static(111,"Karan");
	         Static s2=new Static(112,"Aryan");
	         change();//without creating an object a static method can be called
	         s1.display();
	         s2.display();
		}

	}


	
