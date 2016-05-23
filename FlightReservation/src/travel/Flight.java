package travel;

import java.util.Date;

public class Flight {

	private String departingFrom;
	private String destination;
	private Date date;
	private double price;
	private double mileage;
	
	public Flight(String departingFrom, String destination, Date date, double price, double mileage) {
		super();
		this.departingFrom = departingFrom;
		this.destination = destination;
		this.date = date;
		this.price = price;
		this.mileage = mileage;
	}
	
	public Flight(){
		
	}

	public double getMileage() {
		return mileage;
	}

	public double getPrice() {
		return price;
	}
	
	
	
}
