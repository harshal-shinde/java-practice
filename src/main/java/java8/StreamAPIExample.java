package java8;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamAPIExample {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2, 3, 4, 5);
        List<String> names = Arrays.asList("Reflection API", "Collection");

        //Filter
        List result = (List) names.stream().filter(s -> s.toString().startsWith("R")).collect(Collectors.toList());

        //Get Sorted List
        List sortedResult = (List) names.stream().sorted().collect(Collectors.toList());

        //Terminal Operations
        List number2 = Arrays.asList(2, 3, 4, 5, 3);
        Set square = (Set) number2.stream().collect(Collectors.toSet());

        //Foreach
        List numbers = Arrays.asList(2, 3, 4, 5);
        numbers.stream().forEach(System.out::println);

        number.stream().findFirst();
        number.stream().count();


        //Get employees having address stars with p
//        employees
//                .stream()
//                .filter(e -> e.getAddress().stream().anyMatch(addr -> addr.getCity().startsWith('p')))
//                .forEach(System.out::println);
        Map<String, Integer> map = new HashMap<>();
        map.put("anil", 1000);
        map.put("ankit", 1200);
        map.put("bhavna", 1300);
        map.put("james", 1400);
        map.put("micael", 1500);
        map.put("tom", 1600);
        map.put("daniel", 1700);

        }

}
