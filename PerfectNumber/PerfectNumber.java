public class PerfectNumber {

	
	public static void main(String[] args){
		if (args.length != 1){
			throw new IllegalArgumentException("Use a command line argument!");
		}
		try {
			System.out.print(IsPerfectNumber(Integer.parseInt(args[0])));
		}
		catch (Exception e){
			System.out.print("Illegal argument!");
		}
	}
	
	public static boolean IsPerfectNumber(int number){
		int sum = 0;
		for (int i = 1; i < number; i++){
			if (number % i == 0){
				sum += i;
			}
		}
		return sum == number;
	}
	
}