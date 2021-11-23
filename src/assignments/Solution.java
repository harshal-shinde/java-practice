package assignments;

import java.io.*;


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        for (int index=1; index<=10; index++) {
        	int sum = N * index;
        	String s1 = N +"x"+index;
            System.out.println(s1 + "=" + sum);
        }
        bufferedReader.close();
    }
}
