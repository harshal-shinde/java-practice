package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String args[]) {
		
	//Create list of integers
	List<Integer> number = Arrays.asList(2,3,4,5);
		
	//Demonstration of map method
	List<Integer> sqaure = number.stream().map(x -> x*x)
			.collect(Collectors.toList());
	
	System.out.println(sqaure);
	
	//Create list of String 
	List<String> names = Arrays.asList("Reflections", "Apple", "Collection", "Stream");
	
	//Demo of filter method
	List<String> result = names.stream().filter(s ->s.startsWith("S"))
			.collect(Collectors.toList());
	
	System.out.println(result);
	
	//Sorting
	
	List<String> show = names.stream().sorted().collect(Collectors.toList());
	
	System.out.println(show);
	
	
	//For each method
	number.stream().map( x -> x *x).forEach( y -> System.out.println(y));
	
	//Reduce method
	int even = number.stream().filter(x -> x%2 ==0).reduce(0,(ans, i) ->ans +i);
	System.out.println(even);
	}
}
