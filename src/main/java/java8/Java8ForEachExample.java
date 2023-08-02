package java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Java8ForEachExample {
	
	public static void main(String[] args) {
		//Create simple integer collection
		
		List<Integer> myList = new ArrayList<>();
		
		for(int i=0; i<10; i++)
			myList.add(i);
		
		
		//Traverse using iterator
		Iterator<Integer> it = myList.iterator();
		
		while(it.hasNext()) {
			int i = it.next();
			System.out.println("Iterator Value = " + i);
		}
		
		//Using for each method
		myList.forEach(new Consumer<Integer>() {
			
			public void accept(Integer t) {
				System.out.println("FOreach anonymous class value = "+ t);
			}
			
		});	
	}
	
	//Consumer implementation that can be changed
	class MyConsumer implements Consumer<Integer> {
		public void accept(Integer t) {
			System.out.println("Consumner implmentation value =" + t);
		}
	}

}
