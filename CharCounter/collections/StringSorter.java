/**
 * @author Marton Csordas
 * @version 1.0
 * @since   2016-05-22 
 */

package collections;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.*;

public class StringSorter{
	
	public static void main(String args[]){
		if (args.length != 1){
			System.out.println("Use a command line argument!");
		} else {
			List<String> words = new ArrayList<String>();
			try (BufferedReader br = new BufferedReader(new FileReader(args[0]))){
				String line = null;
				while ((line = br.readLine()) != null){
					String[] wordsinline = line.trim().split("\\s+");
					for (String word : wordsinline){
						words.add(word);
					}
				}
				br.close();
			} catch (IOException e){
				System.out.println("There was a problem with the file!");
			}
			Collections.sort(words);
			try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt"), "utf-8"))) {
				writer.write("[");
				for (String word : words){
					writer.write(removeNonAlphaNumberic(word) + ", ");
				}
				writer.write("]");
			} catch (IOException e){
				System.out.println("There was a problem with the file!");
			}
			for (String word : words){
				System.out.println(removeNonAlphaNumberic(word));
			}
		}
	}
	
	private static String removeNonAlphaNumberic(String inputString){
		StringBuilder result = new StringBuilder();
		for (char letter : inputString.toCharArray()){
			if (Character.isLetter(letter)){
				result.append(letter);
			}
		}
		return result.toString();
	}
	
}