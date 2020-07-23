package assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseStringArrayList {
    public static void main(String[] args) {
        String input = "Afreen afreen";
        char[] hello = input.toCharArray();
        List<Character> trial = new ArrayList<>();

        for (char c : hello)
            trial.add(c);
        Collections.reverse(trial);
        ListIterator li = trial.listIterator();
        while (li.hasNext()) {
            System.out.print(li.next());
        }

    }
}
