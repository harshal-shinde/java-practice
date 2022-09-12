package geeks4geeks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseSubList {
	
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		int N = 5;
		int K =3;
		reverseInGroups(arr, N, K);
	}
	
	public static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
		   
		List<Integer> firstList =  arr.subList(0, k);
		List<Integer> secondList = arr.subList(k, arr.size());
		
		System.out.println(firstList.toString());
		System.out.println(secondList.toString());
		
		Collections.reverse(firstList);
		Collections.reverse(secondList);
		firstList.addAll(secondList);
		
		System.out.println(firstList.toString());
	}

}
