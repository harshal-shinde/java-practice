package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ImmutableExample {
	public static void main(String[] args) {
		List<String> elements = List.of("Harshal", "Shinde");
		System.out.println(elements);
		
		
		Set<String> fruits = new HashSet<>();
		fruits.add("banana");
		fruits.add("Apple");
		
		fruits = Collections.unmodifiableSet(null);
		Set<String> fruitsq = Set.of("Coconuts");
		
	}

}
