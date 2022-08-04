package sprint2Day2.we;

public class _2ClassLevelLockSynchronzation {

	public static void main(String[] args) {
		
		Common2 c1= new  Common2();
		Common2 c2= new  Common2();
		//giving different objects:
		//Object level synchronization will not work here.
		//Class level synchronization is required
		ThreadA2 t1= new ThreadA2(c1,"owais");
		ThreadB2 t2= new ThreadB2(c2,"bhat");
		t1.start();
		t2.start();
		
		
		
	}
}

class Common2{
	//expected output: welcome name
	//making static  with synchronized : Class level lock
	//static method is common for all Class objects
	public static synchronized void methodWithsynchronizedKeywordInSignature(String name) {
		System.out.println("read only content");
		//critical section:
		
			System.out.println("welcome");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(name);
			
		}
	
	public synchronized void methodWithSynchronizedBlock(String name) {
		System.out.println("The Earth is Oval");
		
		//critical section starts here:
		System.out.println("welcome");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println(name);
		//critical section ends here.
		
		System.out.println("2+2=4");
		
	}
	
}

class ThreadA2 extends Thread{
	Common2 c;
	String name;
	public ThreadA2(Common2 c, String name) {
		super();
		this.c = c;
		this.name = name;
	}
	
	@Override
	public void run() {
		c.methodWithsynchronizedKeywordInSignature(name);
	}
}


class ThreadB2 extends Thread{
	Common2 c;
	String name;
	public ThreadB2(Common2 c, String name) {
		super();
		this.c = c;
		this.name = name;
	}
	
	@Override
	public void run() {
		c.methodWithsynchronizedKeywordInSignature(name);
	}
}