package sprint2.Evaluation.Ques2;



public class DeadLockSolution {
/*
 * we can avoid deadLock
 * 1. by re-arranging the statements where code is
 * accessing shared or same content.
 * 2.using Join
 * 3.by avoiding giving locks to multiple threads.
 * 4.Locks should be given to important threads.
 * 
 */
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()); 
		SumOfNums s=new SumOfNums();
		Thread t1= new Thread(s);
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		System.out.println(s.sum);
		
		
		
	}
}


class SumOfNums implements Runnable{
int sum;
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()); 
		for(int i=0;i<10;i++) {
			sum+=i;
		}
	}
	
}