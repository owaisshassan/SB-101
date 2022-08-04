package sprint2Day1.Assignments.Ques3;

public class Main {

	public static void main(String[] args) {
		
		Thread t1= new Thread(
				()->{
					for(int i=1;i<=10;i++) {
						if(i==6) {
							try {
								Thread.sleep(5000);
								System.out.println(i);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						}else {
							System.out.println(i);
						}
					}
				}
		);
		
		t1.start();
		
	}
}
