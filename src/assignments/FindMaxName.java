package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class FindMaxName {
	
	public static String getMaxOccuredName(String names) {
		
		String[] splitedNames;
		splitedNames = names.split(" ");
		
		int size = splitedNames.length;
		
		ConcurrentHashMap result  = new ConcurrentHashMap();
		for(int i=0; i< size ; i++) {
			Object tempName = result.get(splitedNames[i]);
			if(result.get(splitedNames[i]))
		}
		
		return "";
		
	}
	
	public static void main(String args[]) {
		String names = "ram ram  ram ram Priya Priya Priya Mahesh Mahesh Shyam";
		
		String MaxNoOfOccurance = getMaxOccuredName(names);
	}

}
