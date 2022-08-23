
package basic;

import java.util.*;

public  class  ProblemY {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int noOfFreinds = 1;
            int flag =0; //To check number is prime or not, if number is prime then there is no solution
            int numberOfRolls = scanner.nextInt();

            //Check if entered input is 0 then terminate programm
            if(numberOfRolls == 0) {
                System.exit(0);
            }

            //if there is one roll then you cant invite freinds
            if(numberOfRolls == 1) {
                System.out.println("No solution.");
            }
            //When you have 2 friends you can invite only 1 friend
            else if(numberOfRolls == 2) {
                System.out.println(noOfFreinds);
            }
            //Check how many friends we can invite
            else {
                for(int index = 2; index <= numberOfRolls/2; index ++) {
                    if(numberOfRolls % index == 0) {
                        flag = 1;
                        noOfFreinds = index;
                    }
                }
                //No invite if flag == 0
                if(flag == 0) {
                    System.out.println("No solution.");
                } else {
                    System.out.println(noOfFreinds - 1);
                }
            }
        }

    }
}