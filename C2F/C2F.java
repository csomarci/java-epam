public class C2F {

	
	public static void main(String[] args){
		if (args.length != 2){
			throw new IllegalArgumentException("Use a command line argument!");
		}
		try{
			if (Integer.parseInt(args[0]) == 0){
				System.out.print(celsiusToFahrenheit(Double.parseDouble(args[1])) + " Fahrenheit");
			} else {
				System.out.print(fahrenheitToCelsius(Double.parseDouble(args[1])) + " Celsius");
			}
		}
		catch (Exception e){
			System.out.print("Illegal argument!");
		}
	}
	
	public static double celsiusToFahrenheit(double celsius){ 
		return celsius * 1.8 + 32;
	}

	public static double fahrenheitToCelsius(double fahrenheit){
		return (fahrenheit - 32) / 1.8;
	}
}