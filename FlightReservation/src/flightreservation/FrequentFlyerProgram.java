package flightreservation;

public class FrequentFlyerProgram {

	
	private enum State {
		BASE (0.0), SILVER (1.0), GOLD (3.0), DIAMOND (5.0);
		
		private final double disocunt;
		State(double discount){
			this.disocunt = discount;
		}
		
		public double getDiscount(){
			return disocunt;
		}
	}
	
	public static double getDiscount(double miles){
		if (miles >= 50000){
			return State.DIAMOND.getDiscount(); 
		} else if (miles >= 30000){
			return State.GOLD.getDiscount();
		} else if (miles >= 10000){
			return State.SILVER.getDiscount();
		} else {
			return State.BASE.getDiscount();
		}
	}
	
	
}
