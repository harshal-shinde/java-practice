package java8.Predicate;

import java.util.function.Predicate;

public class NotLessThan18<E> implements Predicate<Integer> {

    @Override
    public boolean test(Integer v) {
        Integer ADULT = 18;
        return v >= ADULT;
    }
}
