package sprint2.Evaluation.Ques2;

/*
 * DeadLock:
 * Deadlock in Java is a condition where two or more threads 
 * are blocked forever, waiting for each other.
 */
public class DeadLockProgram {
//DeadLock Example:
	public static void main(String[] args){
		    String s1 = "hey";
		    String s2 = "abc";
		 
		   Thread t1 = new Thread() {
			 @Override
		     public void run(){
		       synchronized(s1){
		        System.out.println("s1 locked by "+Thread.currentThread().getName());
		        try{ Thread.sleep(1000);} catch(Exception e) {}
		      synchronized(s2){
		        System.out.println("s2 locked by "+Thread.currentThread().getName());
		        }
		     }
		  }
		};
		 Thread t2 = new Thread() {
			 @Override
		      public void run(){
		       synchronized(s1){
		        System.out.println("s1 locked by "+Thread.currentThread().getName());
		        try{ Thread.sleep(1000);} catch(Exception e) {}
		      synchronized(s2){
		       System.out.println("s2 locked by "+Thread.currentThread().getName());
		      }
		    }
		  }
		};
		 
		t1.start();
		t2.start();
		}
}
