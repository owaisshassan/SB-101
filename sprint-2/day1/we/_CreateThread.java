package sprint2Day1.we;

public class _CreateThread {

	/*
	 * first way:
	 * extending the Thread class
	 * 
	 * second way: (better way)
	 * implementing Runnable interface
	 * -->lambda
	 * -->implement Runnable
	 * -->anonymous inner class
	 */
	
	public static void main(String[] args) {
		/*
		 * start():
		 * registers our methods with scheduler(Thread Scheduler).
		 * 
		 */
		MyThreadFirstWay t1= new MyThreadFirstWay();
		t1.start();
		
		
		Thread t2= new Thread(new MyThreadSecondWay());
		t2.start();
				
		//lambda way
		Thread t3= new Thread(() ->System.out.println("lambda way"));
		t3.start();
		
		//anonymous inner class:
		Thread t4=new Thread(new MyThreadSecondWay(){
			@Override
			public void run() {
				System.out.println("anonymous inner class way");
			}
		});
		t4.start();
		
	}
	 
}

class MyThreadFirstWay extends Thread{
	@Override
	public void run() {
		System.out.println("first way");
	}
}

class MyThreadSecondWay implements Runnable{

	@Override
	public void run() {
		System.out.println("Second way");
		
	}
	
}
