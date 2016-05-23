package flightreservation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import travel.Flight;
import traveler.FrequentFlyerState;
import traveler.Group;
import traveler.Passenger;

public class FlightReservationMain {

	public static void main(String[] args) {
		Flight testFlight1 = new Flight("BUD","JFK",new Date(),400.0,6000.0);
		Flight testFlight2 = new Flight("JFK","DET",new Date(),100.0,1000.0);
		Flight testFlight3 = new Flight("DET","BUD",new Date(),500.0,7000.0);
		
		List<Flight> flights = new ArrayList<Flight>();
		flights.add(testFlight1);
		flights.add(testFlight2);
		flights.add(testFlight3);
		
		Passenger passenger1 = new Passenger("Teszt Elek",new FrequentFlyerState(0.0));
		Passenger passenger2 = new Passenger("Teszt Sanyi",new FrequentFlyerState(56000.0));
		Passenger passenger3 = new Passenger("Teszt Mari",new FrequentFlyerState(26000.0));
		
		List<Passenger> passengers = new ArrayList<Passenger>();
		passengers.add(passenger1);
		passengers.add(passenger2);
		passengers.add(passenger3);
		
		for (Passenger passenger : passengers){
			System.out.println(passenger.getName() + " pontjai: " + passenger.getPoints()
			+ ";\n kedvezmenye: " + passenger.getDiscount());
		}
		
		Group group = new Group(passengers);
		
		Trip trip = new Trip(group);

		trip.book(flights);
		
		System.out.println("Ennyi kedvezmeny jart: " + group.getDiscount() + "%");
		System.out.println("Ennyibe kerult az utazas: " + trip.getPrice() + " penz");
		
		trip.travel();
		
		for (Passenger passenger : passengers){
			System.out.println(passenger.getName() + " pontjai: " + passenger.getPoints()
			+ ";\n kedvezmenye: " + passenger.getDiscount());
		}
		
		
	}

}
