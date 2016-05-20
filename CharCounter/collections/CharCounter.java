/**
 * @author Marton Csordas
 * @version 1.0
 * @since   2016-05-20 
 */

package collections;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CharCounter{
	
	public static void main(String args[]){
		if (args.length != 1){
			System.out.println("Use a command line argument!");
		} else {
			try (BufferedReader br = new BufferedReader(new FileReader(args[0]))){
				String line = null;
				while ((line = br.readLine()) != null){
					String[] words = line.trim().split("\\s+");
					for (String word : words){
						System.out.println(word + " -> " + countLetters(word));
					}
				}
				br.close();
			} catch (IOException e){
				System.out.println("There was a problem with the file!");
			}
		}
	}
	
	private static int countLetters(String inputString){
		List<Character> distinctChars = new ArrayList<Character>();
		for (char letter : inputString.toCharArray()){
			if (!distinctChars.contains(letter) && Character.isLetter(letter)){
				distinctChars.add((letter));
			}
		}
		return distinctChars.size();
	}
	
}