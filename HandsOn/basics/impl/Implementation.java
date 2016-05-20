package basics.impl;

import java.io.File;
import java.lang.Math;
import java.util.Random;

public class Implementation{
	
	public static String stringReverse(String str){
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			result.append(str.charAt(str.length()-i-1));
		}
		return result.toString();
	}
	
	public static void fileList(String path){
		File f = new File(path);
		String[] paths = f.list();
		for (String element : paths) {
			if (element.endsWith(".java")){
				System.out.println(element);
			}
		}
	}
	
	public static void numberer(double number){
		System.out.println("Sin of number : " + Math.sin(number));
		System.out.println("Cos of number : " + Math.cos(number));
		System.out.println("Tg of number : " + Math.tan(number));
	}
	
	public static int diceThrow(int numberOfDices){
		Random randomGenerator = new Random(System.currentTimeMillis());
		return randomGenerator.nextInt(numberOfDices * 6) + 1;
	}

}