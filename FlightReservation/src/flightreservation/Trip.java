package flightreservation;

import java.util.ArrayList;
import java.util.List;

import travel.Flight;
import travel.Itinerary;
import travel.Ticket;
import traveler.Group;

public class Trip {

	private Group group;
	private Itinerary itinerary;
	private List<Ticket> tickets;
	
	public Trip(Group group) {
		super();
		this.group = group;
	}
	
	public void book(List<Flight> flights){
		this.itinerary = new Itinerary(flights);
		this.tickets = new ArrayList<Ticket>();
		for (Flight flight : flights){
			tickets.add(new Ticket(flight));
		}
	}
	
	public void travel(){
		group.addPoints(itinerary.getMileage());
	}
	
	public double getPrice(){
		double result = 0;
		for (Ticket ticket : tickets){
			result += ticket.getPrice(group.getDiscount());
		}
		return result;
	}
	
}
