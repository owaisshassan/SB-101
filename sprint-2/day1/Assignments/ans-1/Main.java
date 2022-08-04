package sprint2Day1.Assignments.Ques1;

public class Main {

	//flow of execution: 1.Prod 2.Main
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName());
		Prod prodObj= new Prod();
		Thread prodThread= new Thread(prodObj);
		prodThread.start();
		
		//main thread should join only after prodThread is done executing.
		prodThread.join();
		System.out.println(prodObj.prod);//main: print the sum
		
		
	}
}


class Prod implements Runnable{
	int prod=1;
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i=1;i<=10;i++) {
			prod*=i;
		}
	}
	
}