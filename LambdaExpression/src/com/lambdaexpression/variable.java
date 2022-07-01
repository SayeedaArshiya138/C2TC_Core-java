package com.lambdaexpression;
interface Drawable{
public void draw(int radius);
}

public class variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable d2=(int radius)->{ System.out.println("Draw a circle with radius of | " + radius);
		};
		d2.draw(10);

	}

}
