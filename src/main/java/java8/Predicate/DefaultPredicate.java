package java8.Predicate;

import java.util.function.Predicate;

public class DefaultPredicate {
    public static void main(String[] args) {
        Predicate<Integer> adultYet = i -> i >= 18;
        Predicate<Integer> adultStill = i -> i < 65;

        System.out.println(adultYet.and(adultStill).test(5));
        System.out.println(adultYet.and(adultStill).test(38));
        System.out.println(adultYet.and(adultStill).test(90));

        Predicate<String> containsA = t -> t.contains("Crayon");
        Predicate<String> containsB = t -> t.contains("my");

        System.out.println(containsA.or(containsB).test("here is my crayon"));
        System.out.println(containsA.or(containsB).test("here is my pencil"));
        System.out.println(containsA.or(containsB).test("here is John's crayon"));
        System.out.println(containsA.or(containsB).test("here is John's pencil"));


    }
}
