public class Euclid {

	public static void main(String[] args){
		if (args.length != 2){
			System.out.println("Use two command line arguments!");
		}
		try {
			Integer.parseInt(args[0]);
			Integer.parseInt(args[1]);
		}
		catch (Exception e){
			System.out.println("Illegal arguments!");
		}
		System.out.println("Using simple function: " + greatestCommonDivisor(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
		System.out.println("Using recursive function: " + greatestCommonDivisorRecursive(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
	}
	
	public static int greatestCommonDivisor(int firstNumber, int secondNumber){
		if (firstNumber == 0){
			return secondNumber;
		}
		while (secondNumber != 0){
			if (firstNumber > secondNumber){
				firstNumber = firstNumber - secondNumber;
			} else {
				secondNumber = secondNumber - firstNumber;
			}
		}
		return firstNumber;
	}
	
	public static int greatestCommonDivisorRecursive(int firstNumber, int secondNumber){
		if (firstNumber == 0){
			return secondNumber;
		} else if (secondNumber == 0) {
			return firstNumber;
		} else {
			if (firstNumber > secondNumber){
				return greatestCommonDivisorRecursive(firstNumber - secondNumber, secondNumber);
			} else {
				return greatestCommonDivisorRecursive(firstNumber, secondNumber - firstNumber);
			}
		}
	}
}