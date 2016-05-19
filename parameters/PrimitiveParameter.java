public class PrimitiveParameter {

	public static void increment1(int toIncrement) {
		toIncrement++;
	}

	public static void increment2(Integer toIncrement) {
		toIncrement++;
	}

	public static void main(String[] args) {
		int number = 0;
		System.out.println("Original value: " + number);
		increment1(number);
		System.out.println("After increment1: " + number);
		increment2(number);
		System.out.println("After increment2: " + number);
	}
}
