package assignments;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.print("Enter the number to check armstrong");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        if(number < 0) {
            System.out.println("Please Enter positive number");
        }
        while((number % 10) != 0) {

        }

    }
}
