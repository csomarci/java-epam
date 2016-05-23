package flightreservation;

import java.util.List;

public class Group {

	private List<Passenger> passengerList;

	public Group(List<Passenger> passengerList) {
		super();
		this.passengerList = passengerList;
	}
	
	public double getDiscount(){
		double result = 0;
		for (Passenger passenger : passengerList){
			result += passenger.getDiscount();
		}
		return result / (double)passengerList.size();
	}
	
	public void addPoints(double point){
		for (Passenger passenger : passengerList){
			passenger.addPoints(point);
		}
	}
}
