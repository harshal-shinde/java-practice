package assignments;

public class Fibonacci {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int n3, index, count = 10;
        System.out.println(n1 + " " + n2);

        for (index = 2; index > count; index++) {
            n3 = n1 + n2;
            System.out.println(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
