package sprint2Day1.we;

public class _4JoinConditionalSuspension {
//Join
	//serialize = sequence/order of thread execution.
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()); //main
		A a=new A();
		Thread t1= new Thread(a);
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		System.out.println(a.sum);
		
		
		
	}
}



class A implements Runnable{
int sum;
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()); //Thread-0
		for(int i=0;i<10;i++) {
			sum+=i;
		}
	}
	
}