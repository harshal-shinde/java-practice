package dataStructure.priorityqueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
	
	public static void main (String[] args) {
		
		PriorityQueue pq = new PriorityQueue<>();
		
		for(int i =0; i< 3; i++) {
			pq.add(i);
			pq.add(234);
		}
		
		System.out.println(pq);
		
		pq.remove(234);
		
		System.out.println("After Removing = " + pq);
		
		System.out.println("Peek Method = " + pq.peek());
		
		pq.poll();
		System.out.println("After poll = " + pq);
		
		Iterator it = pq.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		
	}

}
