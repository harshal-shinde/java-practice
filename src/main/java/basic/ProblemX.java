package basic;

import java.util.*;

public  class  ProblemX {

    //This method return number of boring days
    private static int getBoringMovieDays(char[] input, int inputLength) {
        int boringDays = 0;
        for (int index = 1; index < input.length; index++) {
            char prev = input[index];
            char next = input[index - 1];
            if ((prev >= 'A' && prev <= 'Z') && (next >= 'A' && next <= 'Z') && (prev == next)) {
                boringDays++;
            }
        }
        return  boringDays;
    }

    //main method
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

            char[] input = inputString.toCharArray();
            int inputLength = input.length;

            if (inputLength == 0 || inputLength < 26) {
                int counter = getBoringMovieDays(input, inputLength);
                System.out.println(counter);
            }
    }
    
}