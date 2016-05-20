package basics;
import basics.impl.*;

public class Main{
	
	public static void main(String[] args){
		char command = args[0].charAt(0);
		switch(command){
			case('s') : stringReader();
			case('f') : Implementation.fileList(args[1]);
			case('n') : numberReader();
			case('d') : diceReader();
		} 
		//stringReader();
		//Implementation.fileList("D:/Java");
	}
	
	private static void stringReader(){
		String input = System.console().readLine();
		while (!input.isEmpty()) {
			String result = Implementation.stringReverse(input);
			System.out.format("You typed: %s\n", result);
			input = System.console().readLine();
		} 
	}
	
	private static void numberReader(){
		String input = System.console().readLine();
		while (!input.equals("END")) {
			Implementation.numberer(Double.parseDouble(input));
			input = System.console().readLine();
		} 
	}
	
	private static void diceReader(){
		String input = System.console().readLine();
		while (!input.isEmpty()) {
			System.out.println(Implementation.diceThrow(Integer.parseInt(input)));
			input = System.console().readLine();
		} 
	}
}