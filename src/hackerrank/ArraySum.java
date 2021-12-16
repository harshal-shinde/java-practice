package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
	
	public static int simpleArraySum(List<Integer> arr) {
		int sum = 0;
		for(int number: arr ) {
			sum += number;
		}
		return sum;
	}
}

public class ArraySum {
	public static void main(String[] args)  throws IOException{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
		
		String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
		
		List<Integer> ar = new ArrayList<>();
		for(int i = 0; i < arrCount ; i ++) {
			int arItem = Integer.parseInt(arrTemp[i]);
			ar.add(arItem);
		}
		
		int result = Result.simpleArraySum(ar);
		
		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();
		
		bufferedReader.close();
		bufferedWriter.close();
	}

}
