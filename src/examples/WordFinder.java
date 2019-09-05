package examples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class WordFinder {

	public static void main(String[] args) {
		/* Find the word with the most Js in the dictionary. */
		
		// map strings to Words
		Stream<Word> wordsWithJayCount = loadWordList().stream().map(wordAsString -> new Word(wordAsString, countOccurrences(wordAsString, 'j')));
		
		// sort the words by most Js
		Word mostJays = wordsWithJayCount.sorted((word1, word2) -> word2.numberOfJays - word1.numberOfJays).findFirst().get();
		
		// the first item is the answer!
		System.out.println(mostJays);
		
	}

	private static int countOccurrences(String haystack, char needle) {
		return (int) haystack.chars().filter(ch -> ch == needle).count();
	}

	public static List<String> loadWordList() {
		List<String> messages = new ArrayList<String>();
		File file = new File("resource/words.txt");

		try {
			BufferedReader buffer = new BufferedReader(new FileReader(file));
			String aLine;
			while ((aLine = buffer.readLine()) != null) {
				messages.add(aLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return messages;
	}

}

class Word {
	
	int numberOfJays;
	String theWord;
	
	public Word(String theWord, int numberOfJays) {
		super();
		this.numberOfJays = numberOfJays;
		this.theWord = theWord;
	}
	
	@Override
	public String toString() {
		return theWord + " " + numberOfJays;
	}
	
}
