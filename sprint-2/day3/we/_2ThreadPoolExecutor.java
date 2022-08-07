package sprint2Day3.we;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class _2ThreadPoolExecutor {
	/*pool: collection of Threads/strings etc.
	 * 
	 */
	public static void main(String[] args) {
		PrintJob[] printJobs= {
				new PrintJob("syllabus"),
				new PrintJob("marks"),
				new PrintJob("placement data"),
				new PrintJob("admission"),
				new PrintJob("MAC"),
		};
		
		
	ExecutorService executorService=Executors.newFixedThreadPool(3); //fixed no. of threads
	for(PrintJob printJob: printJobs) {
		executorService.submit(printJob);
	}
	executorService.shutdown();
	
	
	}
}

class PrintJob implements Runnable{
	String name;
	PrintJob(String name){
		this.name = name;
	}
	@Override
	public void run() {
		System.out.println(name + " job is started by Thread"+ Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " job is completed by this Thread "+ Thread.currentThread().getName());
	}
	
}