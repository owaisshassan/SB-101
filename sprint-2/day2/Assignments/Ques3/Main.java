package sprint2Day2.Assignments.Ques3;

public class Main {
/*
 * Create two threads, one thread to display all even numbers between 1 & 20, another to display odd numbers
between 1 & 20. Note: Display all even numbers followed by odd numbers from main method.
 */
	public static void main(String[] args) {
		A a=new A();
		Thread evenThread= new Thread(a);
		
		B b=new B();
		Thread oddThread= new Thread(b);
		evenThread.start();
		try {
			evenThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		oddThread.start();
	}
}

class A implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i=1;i<=20;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
	
}
class B implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i=1;i<=20;i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
	}
	
}
