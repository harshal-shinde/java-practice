package dataStructure;

public class BinarySearchTree {
	
	/**
	 * Class containing left
	 * and right child of current node
	 * and key value
	 */
	
	class Node {
		int key;
		Node left, right;
		
		public Node(int item) {
			key = item;
			left = right = null;
		}
	}
	
	
	//Root of BST
	Node root;
	
	//Constructor
	BinarySearchTree() { root = null; }
	
	BinarySearchTree(int value) { root = new Node(value); }
	
	void insert(int key) {
		root = insertRecord(root, key);
	} 
	
	Node insertRecord(Node root, int key) {
		/**
		 * If the tree is empty
		 * return a new node
		 */
		
		if(root == null) {
			
			root = new Node(key);
			return root;
		}
		
		//Otherwise , recur  down the tree
		
		if(key < root.key)
			root.left = insertRecord(root.left, key);
		else if (key > root.key)
			root.right = insertRecord(root.right, key);
		
		// return the (unchanged) node pointer
		return root;
	}
	
	void inorder() { inorderRecord(root); }
	
	
	//A utility function to
	//do in order traversal of BST
	
	void inorderRecord(Node root) {
		
		if(root != null) {
			inorderRecord(root.left);
			System.out.println(root.key);
			inorderRecord(root.right);
		}
	}
	
	void deleteKey(int key) { root = deleteRecord(root, key); }
	
	Node deleteRecord (Node root, int key) {
		if(root == null)
			return root;
		
		//Otherwise, recur down the tree
		if(key < root.key)
			root.left = deleteRecord(root.left, key);
		else if (key > root.key)
			root.right = deleteRecord(root.right, key);
		else {
			if(root.left == null)
				return root.right;
			else if(root.right == null)
				return root.left;
			
			
			 root.key = minValue(root.right);
			 
	            // Delete the inorder successor
	         root.right = deleteRecord(root.right, root.key);
		}
		
		return root;
		
	}
	
	int minValue(Node root)
    {
        int minv = root.key;
        while (root.left != null)
        {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }
	
	public static void main(String[] args) {
		
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		
		tree.inorder();
	}
	

}
