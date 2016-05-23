package flightreservation;

public class FrequentFlyerState {
	
	private double points;
	
	public void addPoints(double points){
		this.points += points;
	}
	
	public void removePoints(double points){
		this.points -= points;
	}
	
	public double getDiscount(){
		return FrequentFlyerProgram.getDiscount(points);
	}

	public FrequentFlyerState(double points) {
		super();
		this.points = points;
	}

	public double getPoints() {
		return points;
	}
	
	
}

