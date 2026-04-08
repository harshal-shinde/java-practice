/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java8.Predicate;

import java.util.function.Predicate;

public class NegatePredicate {
    public static void main(String[] args) {
        Predicate<Integer> adult = i -> i >= 18;
        System.out.println(adult.negate().test(7));
        System.out.println(adult.negate().test(19));

    }
}
