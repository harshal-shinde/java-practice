package basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateFruitCounter {
	
	public static void main(String[] args) {
	
		List<String> list = Arrays.asList("Banana", "Apple",
				"Kiwi","Banana", "Apple");
		
		Set<String> result = findDup(list);
		
		result.forEach(System.out::println);

	}

	public static <T> Set<T> findDup(List<T> list) {
		Set<T> items = new HashSet<>();
		return list.stream()
				.filter(n -> !items.add(n))
				.collect(Collectors.toSet());
	}
}
