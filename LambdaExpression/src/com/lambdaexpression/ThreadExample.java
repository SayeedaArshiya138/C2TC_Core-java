package com.lambdaexpression;
/*interface lambda extends Runnable{
	public void display();
	
}*/

public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(()->{System.out.println("this is one thread");}).start();
	/*	Thread t = new Thread(new Runnable() {
			public void run() {
				System.out.println("this is thread one");
			}
		});
		t.start();

	}*/

}
}