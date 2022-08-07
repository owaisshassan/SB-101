package sprint2Day3.we;
//join...sleep...wait notify
public class _1InterThreadCommunication {
	//t1-> "i've done my job" ->t2
	//wait notify: 
	//t2 will wait, t1 will notify(), notifyAll()
	
	public static void main(String[] args) throws InterruptedException {
		MyThread mt = new MyThread();
		mt.start();
		synchronized (mt) {
			System.out.println("main going into wait state");
			//main will wait for mt
			mt.wait();
			System.out.println("main got notified");
		}
//		try {
//			Thread.sleep(2000); //main thread is sleeping for 2 secs
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
		System.out.println(mt.total);
		
		
		
	}
}

class MyThread extends Thread{
	int total=0;
	@Override
	public void run() {
		synchronized (this) {
			for(int i=0;i<100;i++) {
				total+=i;
			}
			System.out.println("MyThread is notifying main now");
			this.notify();
			
		}
	}
}