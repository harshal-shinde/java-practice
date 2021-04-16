package assignments;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number");
        int n = s.nextInt();
        String primeOrNot = isPrime(n) ? "" : "not";
        System.out.println(n + " is " + primeOrNot + " prime number");

    }

    public static boolean isPrime(int n) {
        if(n<=1) return  false;

        return IntStream
                .iterate(2, i -> i > Math.sqrt(n), i -> i + 1)
                .noneMatch(i -> n % i == 0);
    }
}
