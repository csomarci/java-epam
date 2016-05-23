package traveler;

public class Passenger {

	private String name;
	private FrequentFlyerState state;
	
	public double getDiscount(){
		return state.getDiscount();
	}
	
	public void addPoints(double miles){
		state.addPoints(miles);
	}
	
	public void removePoints(double miles){
		state.removePoints(miles);
	}

	public Passenger(String name, FrequentFlyerState state) {
		super();
		this.name = name;
		this.state = state;
	}

	public String getName() {
		return name;
	}
	
	public double getPoints(){
		return state.getPoints();
	}
	
}
