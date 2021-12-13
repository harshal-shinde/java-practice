package assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class BigWiking {
	public static void main(String[] args) {
		String str = "geek1ss,f1o3r,g1e2ekss";
        String[] arrOfStr = str.split(",", 0);
        TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
 
        for (String a : arrOfStr) {

            // Creating array and Storing the array
            // returned by toCharArray()
           char ch[] = a.toCharArray();
      
            // Printing array
           StringBuilder s = new StringBuilder();
           Integer sum =0;
            for (char c : ch) {
                
                if(Character.isDigit(c)) {
                	 System.out.println(c);
                	sum+=(Character.getNumericValue(c));
                }else {
                	s.append(c);
                	
                }
            }//char for loop
            hashMap.put(sum, s.toString());
        }//first for loop
        
        tmap.putAll(hashMap);
        for (Map.Entry<Integer, String> entry : tmap.entrySet())
            System.out.print(entry.getValue() + " ");  
	
	}

}
