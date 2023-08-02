package geekforgeeks;

import java.util.ArrayList;

class SubarraySum
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        int sum = 0;
        int  i = 0;
        ArrayList <Integer> result = new ArrayList<Integer>(); 
        
            do{
            	if(i<n) {
//            		System.out.println("value of i = " +i);
//            		System.out.println("value of n = " +n);
            		 sum+=arr[i]; 
                     i++; 
            	} else {
            		return result;
            	}
        	
                 
            } while((sum < s));
            
            System.out.println("value of i = " +i);
            
        int j = 0;
        do {
        	
            if(sum == s) {
                result.add(j+1);
                result.add(i);
                break;
            } else {
            	System.out.println("Sum = " + sum);
                sum -=arr[j];
                j++;
            }
        }while(j<i);
        
        return result;
    }
    
    public static void main (String[] args) {
//    	int A[] = {1,2,3,7,5};
//    	int N = 5;
//    	int S = 12;
    	
//    	int N = 3, S = 15;
//    	int A[] = {1,2,3,4,5,6,7,8,9,10};
//    	int A[] = {1,2,3};
    	
    	int N = 42;
    	int S = 468;
    	int B[] = {135, 101, 170, 125, 79, 159, 163, 65, 106, 146, 82, 28, 
    		162, 92, 196, 143, 28, 37, 192, 5, 103, 154, 93, 183, 22, 117, 119, 
    		96, 48, 127, 172, 139, 70, 113, 68, 100, 36, 95, 104, 12, 123, 134};
//    	System.out.println(subarraySum(A, N, S));
    	System.out.println(subarraySum(B, N, S));
    }
}