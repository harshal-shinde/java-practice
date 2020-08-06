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
        int output =0;
        while(number!= 0) {
            int mod = number % 10;
            number = number / 10;
            output = output + ((mod * mod)* mod);
        }
        System.out.println("Output = " + output);
    }
}
