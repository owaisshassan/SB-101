package sprint2.Evaluation.Ques1;

public class Main {

	public static void main(String[] args)  {
		TicketCounter t1= new TicketCounter();

		
		TicketBooking tb1= new TicketBooking(t1,"abc",1);
		TicketBooking tb2= new TicketBooking(t1,"def",1);
		TicketBooking tb3= new TicketBooking(t1,"ghi",4);
		tb1.start();
		tb2.start();
		tb3.start();
		
		
		
		
		
		
	}
}
