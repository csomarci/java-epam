package flightreservation;

import java.util.List;

public class Itinerary {
	
	private List<Flight> flights;
	
	
	public Itinerary(List<Flight> flights) {
		super();
		this.flights = flights;
	}

	public double getMileage(){
		double result = 0;
		for (Flight flight : flights){
			result += flight.getMileage();
		}
		return result;
	}
	
}
