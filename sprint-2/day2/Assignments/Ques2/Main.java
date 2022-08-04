package sprint2Day2.Assignments.Ques2;
/*
 * Write the fun1() method of Common class using synchronised block to get the Class level lock.
 */
public class Main {

	public static void main(String[] args) {
		Common c=new Common();
		Thread t1= new Thread(new firstThread(c, 21));
		Thread t2= new Thread(new secondThread(c, 25));
		t1.start();
		t2.start();
		
	}
}

class Common{
	public synchronized void fun1(int age) {
		System.out.println("non-critical");
		
		synchronized (this) {
			System.out.println("critical section");
			System.out.println("my age is written below:");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(age);
		}
		
		System.out.println("non-critical");
	}
}

class firstThread extends Thread{
	Common c;
	int age;
	public firstThread(Common c, int age) {
		super();
		this.c = c;
		this.age = age;
	}
	@Override
	public void run() {
		c.fun1(age);
	}
	
}
class secondThread extends Thread{
	Common c;
	int age;
	public secondThread(Common c, int age) {
		super();
		this.c = c;
		this.age = age;
	}
	@Override
	public void run() {
		c.fun1(age);
	}
}
