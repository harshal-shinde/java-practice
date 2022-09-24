package java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Examples {
	public static void main(String[] args) {
		List<Integer> list  = Arrays.asList(10,15,8,49,25,98,32);
		
		//Get the list of event numbers
		list.stream()
		.filter(l -> l%2 ==0)
		.forEach(System.out :: println);
		
		//find out all the numbers starting with 1 using Stream functions
		list.stream()
		.map(s -> s +"")
		.filter(s -> s.startsWith("1"))
		.forEach(System.out::println);
		
		
		//find duplicate elements in a given integers list in java using Stream
		Set<Integer> hashSet = new HashSet<>();
		list.stream().filter(n -> !hashSet.add(n))
		.forEach(System.out:: println);
		
		
		//Find the first element 
		list.stream().findFirst().ifPresent(System.out::println);
		
		//Total number of elements in list
		list.stream().count();
		
		//Max Integer in list
		int max = list.stream().max(Integer::compare).get();
		
		//Find the first non repeated character in String
		String s = "Java Hungry Blog Alive is Awesome";
		Character result = s.chars() 
				.mapToObj(str -> 
					Character.toLowerCase(
							Character.valueOf((char)str)
							))
				.collect(Collectors
						.groupingBy(Function.identity(),
								LinkedHashMap:: new, 
								Collectors.counting()))
				.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1L)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
			
		
		//Find first repeated character
		
		Character repeatedChar = 
				s.chars()
				.mapToObj(str -> Character.toLowerCase(Character.valueOf((char) str)))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet()
				.stream()
				.filter(entry -> entry.getValue() > 1L)
				.map(entry -> entry.getKey())
				.findFirst()
				.get();
		
		
		//Sort Integer list
		list.stream().sorted().collect(Collectors.toList());
				
		
	}
}
