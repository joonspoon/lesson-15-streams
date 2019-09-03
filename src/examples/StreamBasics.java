package examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamBasics {
	
	public static void main(String[] args) {
		
		/* 3 phases in a Stream pipeline: */
		int sum = IntStream.range(5, 50)	// 1. create stream
		.filter(x -> x < 20)				// 2. apply intermediate operation(s)
		.sum();								// 3. terminate stream, reduces it to a value or a collection
		
		/* To create a Stream from a List (or any other Collection): */
		List<Integer> listOfInts =  List.of(1, 2, 3);
		Stream<Integer> streamOfInts = listOfInts.stream();
		
		/* To create a Stream from an old school Array: */
		String[] arrayOfStrings = "hola".split("");
		Stream<String> streamOfStrings = Stream.of(arrayOfStrings);
		
		int[] arrayOfInts = new int[] {1, 2, 3};
		IntStream anotherStreamOfInts = Arrays.stream(arrayOfInts);
		
		
		/* External iterator #1: Classic for loop */
		for (int i = 0; i < arrayOfStrings.length; i++) {
			//System.out.println(arrayOfStrings[i]);
		}
		
		/* External iterator #2: enhanced for-each loop - Java 5+ */
		for (String str: arrayOfStrings) {
			//System.out.println(str);
		}
		
		/* Internal iterator: for-each loop statement - Java 8+ */
		streamOfInts.forEach(System.out::println);
		
	}

}
