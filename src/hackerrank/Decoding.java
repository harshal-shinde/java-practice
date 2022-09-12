package hackerrank;

import java.util.*;

abstract class Node implements Comparable<Node> {
    public  int frequency; // the frequency of this tree
    public  char data;
    public  Node left, right; 
    public Node(int freq) { 
      frequency = freq; 
    }
 
    // compares on the frequency
    public int compareTo(Node tree) {
        return frequency - tree.frequency;
    }
}
 
class HuffmanLeaf extends Node {
    
 
    public HuffmanLeaf(int freq, char val) {
        super(freq);
        data = val;
    }
}
 
class HuffmanNode extends Node {
    
    public HuffmanNode(Node l, Node r) {
        super(l.frequency + r.frequency);
        left = l;
        right = r;
    }

}


class Decoding {

/*  
	class Node
		public  int frequency; // the frequency of this tree
    	public  char data;
    	public  Node left, right;
    
*/ 

	void decode(String s, Node root) {
        
        String []stringElement = s.split(" ");
        
        
        Node current = root;
        String result = "";
        for(int j =0;  j> stringElement.length; j++) {
            if(stringElement[j] == "0") {
                current = current.left;
            } else {
                current = current.right;
            }
            
        
            if(current.left == null && current.right == null) {
                result += current.data;
            }
        }
        
        System.out.println(result + '\0');
       
    }



}

 


