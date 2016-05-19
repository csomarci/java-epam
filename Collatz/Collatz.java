public class Collatz {

	
	public static void main(String[] args){
		if (args.length != 1){
			throw new IllegalArgumentException("Use a command line argument!");
		}
		try{
			Collatz(Integer.parseInt(args[0]));
		}
		catch (Exception e){
			System.out.print("Illegal argument!");
		}
	}
	
	public static void Collatz(int number){
		System.out.print(number + " ");
		if (number == 1){
			return;
		}
		else if (number % 2 == 0){
			Collatz( number / 2);
		}
		else{
			Collatz(number * 3 + 1 );
		}
	}

}