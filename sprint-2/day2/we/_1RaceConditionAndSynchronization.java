package sprint2Day2.we;

public class _1RaceConditionAndSynchronization {

	//e.g. LinkedList 1>2->3
	//Concurrency: concurrrent:at the same time, two threads working on the same variable/data at the same time.
	//Race condition: occurs when there is concurrency.
	//A condition, in which 2 or more threads compete to get some shared resources(variable,object etc.).
	//Concurrency ->Race condition-> Data Inconsistency.
	
	//Solution is "synchronization" ->giving them an order.
	//it allows you to enter the critical section one person/Thread at a time.
	
	public static void main(String[] args) {
		Common c=new Common();
		//giving same objects:
		ThreadA t1= new ThreadA(c,"owais");
		ThreadB t2= new ThreadB(c,"bhat");
		t1.start();
		t2.start();
		//depending on Thread Scheduler:
		//Before synchronization:
		//t1-t2 -> Welcome Welcome owais bhat
		//t2-t1 -> Welcome Welcome bhat owais 
		
		//After synchronization(use "synchronized" keyword in Common method/critical section(Shared section/resource):
		//t1-t2 -> Welcome owais Welcome bhat
		//t2-t1 -> Welcome bhat Welcome owais 
		
		/*synchronization:
		 * Thread, which is been selected by Thread Scheduler to go first, is given a lock of
		 * the object(here: Common c) of synchronized method and once the whole method is done, it releases the lock and other thread
		 * gets the lock. 
		 * object level synchronization
		 */
	}
}

//Common class:Shared area
class Common{
	//expected output: welcome name
	
	public synchronized void fun1(String name) {
		System.out.println("read only content");
		//critical section:
		synchronized (this) {
			System.out.println("welcome");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(name);
			
		}
	}
}

class ThreadA extends Thread{
	Common c;
	String name;
	public ThreadA(Common c, String name) {
		super();
		this.c = c;
		this.name = name;
	}
	
	@Override
	public void run() {
		c.fun1(name);
	}
}


class ThreadB extends Thread{
	Common c;
	String name;
	public ThreadB(Common c, String name) {
		super();
		this.c = c;
		this.name = name;
	}
	
	@Override
	public void run() {
		c.fun1(name);
	}
}