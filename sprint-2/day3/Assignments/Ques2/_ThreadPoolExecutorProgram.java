package sprint2Day3.Assignments.Ques2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class _ThreadPoolExecutorProgram {

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