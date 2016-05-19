public class HolderParameter {

	public static void increment1(Holder toIncrement) {
		toIncrement = new Holder(toIncrement.getValue() + 1);
	}

	public static void increment2(Holder toIncrement) {
		toIncrement.setValue(toIncrement.getValue() + 1);
	}

	public static void main(String[] args) {
		Holder number = new Holder(0);
		System.out.println("Original value: " + number.getValue());
		increment1(number);
		System.out.println("After increment1: " + number.getValue());
		increment2(number);
		System.out.println("After increment2: " + number.getValue());
	}
	
}

class Holder {

		private int value;

		public Holder(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

}

