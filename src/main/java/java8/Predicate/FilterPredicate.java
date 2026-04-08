package java8.Predicate;

import java.util.List;

public class FilterPredicate {

    public static void main(String[] args) {
        List<Integer> ages = List.of(17, 18, 19, 28, 46, 7, 8, 9, 21, 12);
        NotLessThan18<Integer> isAdult = new NotLessThan18<>();
        ages.stream().filter(isAdult).forEach(System.out::println);
    }
}
