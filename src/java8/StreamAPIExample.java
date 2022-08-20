package java8;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamAPIExample {
	public static void main(String []args) {
		List number = Arrays.asList(2,3,4,5);
		List names = Arrays.asList("Reflection API", "Collection");
		
		//Filter
		List result = (List) names.stream().filter( s -> s.toString().startsWith("R")).collect(Collectors.toList());
	
		//Get Sorted List
		List sortedResult = (List) names.stream().sorted().collect(Collectors.toList()); 
	
	
		//Terminal Operations
		List number2 = Arrays.asList(2,3,4,5,3);
		Set square = (Set) number2.stream().map(x -> x *x)
				.collect(Collectors.toSet()); 
		
		//Foreach
		List numberForEach = Arrays.asList(2,3,4,5);
		List resultnumberForEach = (List) numberForEach.stream()
				.filter(y -> System.out.println(y));
		
		
		
	}

}
