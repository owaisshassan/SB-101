package sprint2.Evaluation.Ques1;

public class TicketCounter {

	int availableSeats=3;
	void bookSeat(String name, int numberOfSeats)throws NoSeatAvailableException {
		try {
			if(availableSeats>=numberOfSeats) {
			System.out.println("seats Booked: "+numberOfSeats);
			availableSeats=availableSeats-numberOfSeats;
			}else {
				throw new NoSeatAvailableException("no seats available");
			}
		}catch(Exception e){
			throw new NoSeatAvailableException("no seats available");
		}
		
		
		
	}
}

class TicketBooking extends Thread{
	TicketCounter ticketCounter;
	String passengerName;
	int noOfSeatsToBook;
	
	
	public TicketBooking(TicketCounter ticketCounter, String passengerName, int noOfSeatsToBook) {
		super();
		this.ticketCounter = ticketCounter;
		this.passengerName = passengerName;
		this.noOfSeatsToBook = noOfSeatsToBook;
	}


	@Override
	public void run() {
		try {
			ticketCounter.bookSeat(passengerName, noOfSeatsToBook);
		} catch (NoSeatAvailableException e) {
			System.out.println(e.getMessage());
		}
	}
}