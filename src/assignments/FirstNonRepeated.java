package assignments;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeated {
    public static void main(String[] args) {
        System.out.println("Please enter the input String");
        Scanner in  = new Scanner(System.in);
        String s = in.nextLine();
        char c = firstNonRepeatedChar(s);
        System.out.println("The first non repeated character is : " +c);
    }

    public static Character firstNonRepeatedChar(String str) {
        HashMap<Character, Integer> hasTable =
                new HashMap<>();
        int index, length;
        Character c;
        length = str.length();
        for(index=0; index< length; index ++) {
            c = str.charAt(index);
            if(hasTable.containsKey(c)) {
                hasTable.put(c, hasTable.get(c)+1);
            } else {
                hasTable.put(c, 1);
            }
        }

        for (index=0; index < length; index++) {
            c = str.charAt(index);
            if(hasTable.get(c) == 1)
                return c;
        }
        return null;
    }


}
