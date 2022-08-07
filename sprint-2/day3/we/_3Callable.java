package sprint2Day3.we;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
//Callable & Future....
//Runnable interface has some limitations
//Callable interface:
//used in case we need to return anything..
public class _3Callable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		MyCallable[] jobs= {
				new MyCallable(10),
				new MyCallable(20),
				new MyCallable(30),
				new MyCallable(40),
				new MyCallable(50),
		};
		ExecutorService executorService= Executors.newFixedThreadPool(5);
		for(MyCallable myCallable: jobs) {
			Future future=executorService.submit(myCallable);  //Future
			System.out.println(future.get());
		}
		executorService.shutdown();
		
	}
}

class MyCallable implements Callable{
	int num;
	public MyCallable(int num) {
		this.num=num;
	}
	@Override
	public Object call() throws Exception {
		System.out.println(Thread.currentThread().getName()+ " is calculating sum from 0 to "+num);
		int sum=0;
		for(int i=0;i<num;i++) {
			sum+=i;
		}
		return sum;
	}
	
}