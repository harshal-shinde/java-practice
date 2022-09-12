package algorithm.huffman;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Huffman {
	
	/**
	 * Recursive function to print the
	 * huffman code through the tree traversal
	 * 
	 */
	public static void printCode(HuffmanNode root, String s) {
		
		//Base case : leaf node 
		if(root.left ==null && root.right ==null && 
				Character.isLetter(root.c)) {
			System.out.println(root.c + ":" + s);
			return;
		}
		
		//if we want to go left then add "0" to the code
		//if we want to go right then add "1" to the code
		printCode(root.left, s+"0");
		printCode(root.right, s+"1");
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//number of characters
		int n = 6;
		char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
		int[] charFreq = {5, 9, 12,13, 16, 45};
		
		PriorityQueue<HuffmanNode> q = new PriorityQueue<HuffmanNode>(n, new MyComparator());
	
		for(int i=0; i <n; i++) {
			//Create huffman object and add to priority queue
			HuffmanNode huffmanNode = new HuffmanNode(); 
			huffmanNode.c = charArray[i];
			huffmanNode.data = charFreq[i];
			q.add(huffmanNode);
		}
		
		//create root node
		HuffmanNode root = null;
		
		
		//Extract 2 minimum value
		while(q.size() >1) {
			//first min extract
			HuffmanNode x = q.peek();
			q.poll();
			
			//Extract second
			HuffmanNode y = q.peek();
			q.poll();
			
			//new node f which is equal
			HuffmanNode f = new HuffmanNode();
			
			//to the sum of the frequency of the two nodes
			//assign values to the f node
			
			f.data = x.data + y.data;
			f.c = '-';
			
			//first extracted node
			f.left = x;
			
			//second extracted node
			f.right = y;
			
			//mark f as root
			root = f;
			
			//add this node to priority q
			q.add(f);
		}
		
		//print the codes by traversing tree
		
		printCode(root, "");
	}


}
