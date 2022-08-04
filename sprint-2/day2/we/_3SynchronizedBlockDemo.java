package sprint2Day2.we;

import java.util.Scanner;

public class _3SynchronizedBlockDemo {

	public static void main(String[] args) {
		Shared shared=new Shared();
		ThreadA3 t1= new ThreadA3(shared,"owaiss");
		ThreadB3 t2= new ThreadB3(shared,"Ovee");
		t1.start();
		t2.start();
	}
}

class Shared{
	public synchronized void methodWithSynchronizedBlock(String name) {
		System.out.println("===Bakery Shop/Clock Tower/Read-Only===");
		System.out.println("The Earth is Oval"); //non-critical
		
		//critical section starts here:
		synchronized (this) {
			System.out.println("=== ATM ===/ critical Section");
			System.out.println("welcome");
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(name);
			System.out.println(Thread.currentThread().getName());
		}
		//critical section ends here.
		System.out.println("===Bakery Shop===");
		System.out.println("2+2=4");  //non-critical
//		Scanner sc= new Scanner(System.in);
//		sc.nextLine(); //press Enter
		
	}
}

class ThreadA3 extends Thread{
	Shared c;
	String name;
	public ThreadA3(Shared c, String name) {
		super();
		this.c = c;
		this.name = name;
	}
	
	@Override
	public void run() {
		//c.methodWithsynchronizedKeywordInSignature(name);
		c.methodWithSynchronizedBlock(name);
	}
}


class ThreadB3 extends Thread{
	Shared c;
	String name;
	public ThreadB3(Shared c, String name) {
		super();
		this.c = c;
		this.name = name;
	}
	
	@Override
	public void run() {
		//c.methodWithsynchronizedKeywordInSignature(name);
		c.methodWithSynchronizedBlock(name);
	}
}