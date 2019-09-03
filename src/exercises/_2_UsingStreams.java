package exercises;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;


public class _2_UsingStreams {

	/* Count the eggs that are not cracked. */
	@Test
	public void testSearch() {
		List<String> eggs = Arrays.asList(new String[]{"whole", "whole", "whole", "whole", "cracked", "whole", "whole", "whole", "cracked", "whole", "whole", "whole"});
		assertEquals(10, AlgorithmsUsingStreams.countGoodEggs(eggs));
	}

	/* Find the height of the tallest person. */
	@Test
	public void testFindMaxiumum() throws Exception {
		List<Double> peeps = Arrays.asList(new Double[]{5.7, 6.2, 3.4, 6.2, 5.0, 5.5, 4.7, 6.2, 3.4, 4.2, 5.0, 4.5, 5.1, 6.6});
		assertEquals(6.6, AlgorithmsUsingStreams.findTallest(peeps));
	}

	/* Add all numbers in a String. */
	@Test
	void testAddingAStringOfNumbers() throws Exception {
		//String numbers = "38472394729374923874";
		String numbers = "123";
		assertEquals(6, AlgorithmsUsingStreams.addStringOfNumbers(numbers));
	}
	

//	/* Count how many oysters contain pearls. */
//	@Test
//	public void testSearchAndAccumulate() throws Exception {
//		List<Boolean> oysters = Arrays.asList(new Boolean[]{false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false,
//				false, false, false, false, false, false, true});
//		assertEquals(2, (long) AlgorithmsUsingStreams.countPearls(oysters));
//	}
//
//	/* Create a method that will find the longest word. */
//	@Test
//	public void testFindMaxiumumString() throws Exception {
//		List<String> words = Arrays.asList(new String[]{"accoutrements", "acumen", "anomalistic", "auspicious", "bellwether", "callipygian", "circumlocution", "concupiscent",
//				"conviviality", "coruscant", "cuddlesome", "cupidity", "cynosure", "ebullient", "equanimity", "excogitate", "gasconading", "idiosyncratic", "luminescent",
//				"magnanimous", "nidificate", "osculator", "parsimonious", "penultimate", "perfidiousness", "perspicacious", "proficuous", "remunerative", "saxicolous",
//				"sesquipedalian", "superabundant", "unencumbered", "unparagoned", "usufruct",});
//		assertEquals("circumlocution", AlgorithmsUsingStreams.findLongestWord(words));
//	}
//
//	/* Sort the exam results from lowest to highest. */
//	@Test
//	public void testSort() throws Exception {
//		List<Double> results = Arrays.asList(new Double[]{60.3, 60.2, 80.4, 67.2, 95.0, 85.5, 40.7, 68.2, 38.4, 94.2, 85.0, 84.5, 50.1, 66.6});
//		assertEquals(38.4, (double) AlgorithmsUsingStreams.sortScores(results).get(0));
//		assertEquals(40.7, (double) AlgorithmsUsingStreams.sortScores(results).get(1));
//		assertEquals(95.0, (double) AlgorithmsUsingStreams.sortScores(results).get(13));
//	}
//
//	/* Sort the DNA sequences by length from shortest to longest. */
//	@Test
//	public void testSortStringLength() throws Exception {
//		List<String> unsortedSequences = Arrays.asList(new String[]{"ATAGCTGATCGTAGCTACGTACGATCG", "CATCGTACATGC", "TATGTGT", "GCTGATCGTGACTGTAC", "ACTGT"});
//		List<String> sortedSequences = Arrays.asList(new String[]{"ACTGT", "TATGTGT", "CATCGTACATGC", "GCTGATCGTGACTGTAC", "ATAGCTGATCGTAGCTACGTACGATCG"});
//		assertEquals(sortedSequences, AlgorithmsUsingStreams.sortDNA(unsortedSequences));
//	}
//
//	/* Sort the words in alphabetical order. */
//	@Test
//	public void testSortStringContents() throws Exception {
//		List<String> words = Arrays.asList(new String[]{"aby", "dap", "alt", "alb", "ama", "ard", "ana", "ala", "awn", "dah", "bar", "bee", "bel", "bot", "bis", "cep", "alk",
//				"cog", "col", "cwm", "dag", "ait", "dal", "daw"});
//		assertEquals("aby", AlgorithmsUsingStreams.sortWords(words).get(0));
//		assertEquals("bar", AlgorithmsUsingStreams.sortWords(words).get(10));
//		assertEquals("daw", AlgorithmsUsingStreams.sortWords(words).get(words.size() - 1));
//	}
//
//	/* Remove the duplicate spells from a list, and alphabetize them. */
//	@Test
//	public void testRemoveDuplicates() throws Exception {
//		List<String> spellsCastThisWeek = List.of("expelliarmus", "riddikulus", "lumos", "obliviate", "lumos", "accio", "accio", "accio", "lumos", "alohomora", "lumos",
//				"expelliarmus");
//
//		List<String> spellsCastThisWeek2 = List.of("accio, alohomora, expelliarmus, lumos, obliviate, riddikulus");
//		assertEquals(spellsCastThisWeek2.toString(), AlgorithmsUsingStreams.getDistinctSpellsInAlphabeticalOrder(spellsCastThisWeek).toString());
//	}
//
//	/* Search the String array for instances of "bam" and "pow", then capitalize them. */
//	@Test
//	public void testMap() throws Exception {
//		String[] batmanScript = "Bam. If you kill a killer, the number of killers in the room remains the same. Bam. Pow. I have one power. I never give up. Pow.".split("\\.");
//		assertEquals("[BAM, BAM, POW, POW]", AlgorithmsUsingStreams.getBatPhrases(batmanScript).toString());
//
//	}
//
//	/* Count the number of X's in a String. */
//	@Test
//	public void testMap2() throws Exception {
//		String xString = "xxxoooxxxxxxxxoxoxoxoxoxo";
//		assertEquals(9, AlgorithmsUsingStreams.countXs(xString));
//	}
//
//	/* Add all the even numbers. */
//	@Test
//	public void testCountingEvenNumbers() throws Exception {
//		String numbers = "37726498761230983456376419";
//		assertEquals(6, AlgorithmsUsingStreams.addEven("1234"));
//		assertEquals(56, AlgorithmsUsingStreams.addEven(numbers));
//	}
//
//	/* Get the average of an array of numbers. */
//	@Test
//	public void testAveraging() throws Exception {
//		int[] numbers = new int[]{38, 72, 64, 98, 77, 123, 98, 34, 56, 37, 64, 190};
//		assertEquals(79.25, AlgorithmsUsingStreams.getAverage(numbers));
//	}
//	
//	@Test
//	void testCountOccurrences() {
//		String[] strArr = {
//			"one", "two", "two",
//			"three", "three", "three",
//			"four", "four", "four", "four"
//		};
//		assertEquals(1, AlgorithmsUsingStreams.countOccurrences(strArr, "one"));
//		assertEquals(2, AlgorithmsUsingStreams.countOccurrences(strArr, "two"));
//		assertEquals(3, AlgorithmsUsingStreams.countOccurrences(strArr, "three"));
//		assertEquals(4, AlgorithmsUsingStreams.countOccurrences(strArr, "four"));
//	}
}
