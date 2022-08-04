package sprint2Day1.we;

public class _3ThreadStatesLifecycle {

	public static void main(String[] args) {
		
		//new state: new Thread is created
		//giving priority doesn't matter, Thread scheduler will decide only which thread should run first
		Thread thread =new Thread(
				//run method implementation
				()->{
					 System.out.println("Thread running");
//					 Thread.currentThread().setName("my thread"); -->customisez thread name
					 System.out.println(Thread.currentThread().getName());
//					 Thread.currentThread().setPriority(Thread.MAX_PRIORITY);  -> customised priority
					 System.out.println(Thread.currentThread().getPriority());
					 
					 System.out.println("sleeping...");
					 try {
						 //blocked state
						Thread.sleep(4000);   //4 secs
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					 System.out.println("waking up...");
				}
		);
		
		//runnable
		//running:
		thread.start();
		
		
		System.out.println("---Second thread----");
		
		Thread thread2=new Thread(
				()->{
					System.out.println(" second Thread running");
					Thread.currentThread().setName("my Second thread");
					 System.out.println(Thread.currentThread().getName());
					Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
					System.out.println(Thread.currentThread().getPriority());
				}
				
		);
		thread2.start();
		System.out.println("---End of Second thread----");
		
	}
}
