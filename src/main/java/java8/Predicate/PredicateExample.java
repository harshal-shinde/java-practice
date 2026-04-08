package java8.Predicate;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {

        //Creating predicate method
        Predicate<Integer> lesserThan = i -> (i < 18);

        //Calling predicate method
        System.out.println(lesserThan.test(10));
    }
}
