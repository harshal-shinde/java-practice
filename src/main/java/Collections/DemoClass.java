package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DemoClass {
    public static void main(String[] args) {

        Collection values = new ArrayList();
        values.add(1);
        values.add("Harshal");
        System.out.println(values);

        Iterator i = values.iterator();
    }
}
