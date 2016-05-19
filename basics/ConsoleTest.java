public class ConsoleTest {
	public static void main (String[] args) {
		String a = System.console().readLine();
		System.out.format("You typed: %s", a);
	}
}