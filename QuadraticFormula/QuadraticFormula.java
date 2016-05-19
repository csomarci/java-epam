public class QuadraticFormula {

	public static void main(String[] args){
		if (args.length != 3){
			System.out.println("Use two command line arguments!");
		}
		try {
			Double.parseDouble(args[0]);
			Double.parseDouble(args[1]);
			Double.parseDouble(args[2]);
		}
		catch (Exception e){
			System.out.println("Illegal arguments!");
		}
		double[] result = sqroots(Double.parseDouble(args[0]),Double.parseDouble(args[1]),Double.parseDouble(args[2]));
		for (double element : result){
			System.out.println(element);
		}
	}
	
	private static double[] sqroots(final double a, final double b, final double c) {
		double discriminant = b*b - 4*a*c;
		if (a == 0 || discriminant < 0){
			double[] result = {};
			return result;
		} else if (discriminant == 0){
			double[] result = {-b/(2*a)};
			return result;
		} else {
			double[] result = {(-b+Math.sqrt(discriminant))/(2*a),(-b-Math.sqrt(discriminant))/(2*a)};
			return result;
		}
		
	}
}