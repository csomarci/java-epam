package traveler;

public class FrequentFlyerProgram {
	
	private final String BASE = "Base";
	private final int BASE_LIMIT = 0;
	private final String SILVER = "Silver";
	private final int SILVER_LIMIT = 10000;
	private final String GOLD = "Gold";
	private final int GOLD_LIMIT = 30000;
	private final String DIAMOND = "Diamond";
	private final int DIAMOND_LIMIT = 50000;
	private final double BASE_DISCOUNT = 0.0;
	private final double SILVER_DISCOUNT = 1.0;
	private final double GOLD_DISCOUNT = 3.0;
	private final double DIAMOND_DISCOUNT = 5.0;
	
	
	public double getDiscount(double points){
		if (points >= DIAMOND_LIMIT) {
			return DIAMOND_DISCOUNT;
		} else if (points >= GOLD_LIMIT) {
			return GOLD_DISCOUNT;
		} else if (points >= SILVER_LIMIT) {
			return SILVER_DISCOUNT;
		} else {
			return BASE_DISCOUNT;
		}
	}
	
	public String getDiscountCategory(double points){
		if (points >= DIAMOND_LIMIT) {
			return DIAMOND;
		} else if (points >= GOLD_LIMIT) {
			return GOLD;
		} else if (points >= SILVER_LIMIT) {
			return SILVER;
		} else {
			return BASE;
		}
	}
	
}
