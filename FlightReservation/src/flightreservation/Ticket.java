package flightreservation;

public class Ticket {

	private Flight flight;
	
	public Ticket(Flight flight) {
		super();
		this.flight = flight;
	}

	public double getPrice(double discount){
		return flight.getPrice()*(100-discount)/100;
	}
}
