public class FizzBuzz {

	public static final int MAGIC_NUMBER = 100;

	public static void main(String[] args){
		for (int i = 1; i <= MAGIC_NUMBER; i++){
			if (i % 3 == 0 && i % 5 == 0){
				System.out.print("FizzBuzz ");
			}
			else if (i % 5 == 0){
				System.out.print("Buzz ");
			}
			else if (i % 3 == 0){
				System.out.print("Fizz ");
			}
			else{
				System.out.print(i + " ");
			}
		}
	
	}

}