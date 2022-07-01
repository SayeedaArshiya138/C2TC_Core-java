package com.cg.collectionsTreeset;

public class Mainn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][]= {{42,2,41},{52,1,40},{67,9,12}};
		shuffle(array);

	}
	public static void shuffle(int array[][])
	{  
		for(int i = 0;i<3;i++) 
		{
		 for(int j = 0;j<3;j++) 
		 {
			System.out.print(array[i][j]+ " ");
		}
		System.out.println();
	}
		
	}

}
