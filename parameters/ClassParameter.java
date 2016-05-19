import java.util.Date;

public class ClassParameter {

	private static final int DAY_IN_MILLISECONDS = 24 * 60 * 60 * 1000;

	public static void increment1(Date toIncrement) {
		toIncrement = new Date(toIncrement.getTime() + DAY_IN_MILLISECONDS);
	}

	public static void increment2(Date toIncrement) {
		toIncrement.setTime(toIncrement.getTime() + DAY_IN_MILLISECONDS);
	}

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("Original value: " + date);
		increment1(date);
		System.out.println("After increment1: " + date);
		increment2(date);
		System.out.println("After increment2: " + date);
	}
	
}
