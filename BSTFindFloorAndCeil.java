package bst;

public class BSTFindFloorAndCeil {

	public static void main(String[] args) {
		Node root = new Node(50);
		root.left = new Node(30);
		root.right = new Node(70);
		root.left.left = new Node(20);
		root.left.right = new Node(40);
		root.right.left = new Node(60);
		root.right.right = new Node(80);
		
		Node res = findCeil(root, 4);
		if(res == null) 
			System.out.println("-1");
		else 
			System.out.println(res.key);
	}

	private static Node findfloor(Node root, int x) {
		Node curr = root;
		Node res = null;
		while(curr != null) {
			if(curr.key == x) 
				return curr;
			if(curr.key < x) {
				res = curr;
				curr = curr.right;	
			}
			else if (curr.key > x) 
				curr = curr.left;
		}
		
		return res;
	}
	
	private static Node findCeil(Node root, int x) {
		Node curr = root;
		Node res = null;
		while(curr != null) {
			if(curr.key == x) 
				return curr;
			if(curr.key < x) {
				curr = curr.right;	
			}
			else if(curr.key > x) {
				res = curr;
				curr = curr.left;	
			}
		}
		
		return res;
	}
	

}
