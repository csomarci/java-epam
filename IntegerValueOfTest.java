public class IntegerValueOfTest {
	private static final int NUM = 500;

	public static void main(String[] args) {
		Integer i1 = Integer.valueOf(NUM);
		Integer i2 = Integer.valueOf(NUM);		
		System.out.println(i1 == i2);
		
		i1 = NUM;
		i2 = NUM;
		System.out.println(i1 == i2);
		
		i1 = new Integer(NUM);
		i2 = new Integer(NUM);
		System.out.println(i1 == i2);
		
		

		
		
	}
}

