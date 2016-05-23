package traveler;

public class FrequentFlyerState {
	
	private double points;
	private FrequentFlyerProgram program;
	
	public void addPoints(double points){
		this.points += points;
	}
	
	public void removePoints(double points){
		this.points -= points;
	}
	
	public double getDiscount(){
		return program.getDiscount(points);
	}

	public FrequentFlyerState(double points) {
		super();
		this.points = points;
		this.program = new FrequentFlyerProgram();
	}

	public double getPoints() {
		return points;
	}
	
	
}

