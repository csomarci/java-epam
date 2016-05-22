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

public class WordCounter{
	
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
			Map<String,Integer> wordsCounted = countWords(words);
			for (String word : wordsCounted.keySet()){
				System.out.println(word + " = " + wordsCounted.get(word));
			}
		}
	}
	
	private static Map<String,Integer> countWords(List<String> inputStringArray){
		Map<String,Integer> distinctWords = new HashMap<String,Integer>();
		for (String word : inputStringArray){
			if (distinctWords.containsKey(word)){
				distinctWords.put(word,distinctWords.get(word)+1);
			} else {
				distinctWords.put(word,1);
			}
		}
		return distinctWords;
	}
	
}