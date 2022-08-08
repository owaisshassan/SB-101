package sprint2.Evaluation.Ques2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * ThreadPoolExecutor:
 * Java Thread pool is a collection of Threads that are in waiting form till they get their job.
 * These  are reused many times.
 * Thread pool is a group of fixed-sized threads. A thread from a Thread-pool is pulled out
 * and assigned a task. This is doneby ThreadPoolExecutor, which is an ExecutorService.
 * This is normally done by using Executors factory methods.
 * 
 * 
 * 
 */

public class ThreadPoolExecutor {

	public static void main(String[] args) {
		ApnaProgram[] apnePrograms= {
				new ApnaProgram("Dukaandari"),
				new ApnaProgram("Coding"),
				new ApnaProgram("School"),
				new ApnaProgram("Ghar"),
				new ApnaProgram("Emaandari"),
		};
		
		ExecutorService es= Executors.newFixedThreadPool(3);
		
		for(ApnaProgram ap: apnePrograms) {
			es.submit(ap);
		}
		es.shutdown();
		
	}
}


class ApnaProgram implements Runnable{
	String name;
	public ApnaProgram(String name) {
		this.name=name;
	}
	@Override
	public void run() {
		System.out.println(name+" ka kaam "+Thread.currentThread().getName()+" ne start kiya");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name+" ka kaam "+Thread.currentThread().getName()+" ne Complete kiya");
	}
}