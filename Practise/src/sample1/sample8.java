package sample1;

import java.util.Queue;
import java.util.Stack;

public class sample8 {
	public static  Node root;
	public sample8(){
		this.root = null;
	}
	
	public void insert(int id){
		Node newNode;
		if(id<0)
			newNode = null;
		else 
			newNode = new Node(id);
		if(root==null){
			root = newNode;
			return;
		}
		Node current = root;
		Node parent = null;
		while(true){
			parent = current;
			if(id<current.data){				
				current = current.left;
				if(current==null){
					parent.left = newNode;
					return;
				}
			}else{
				current = current.right;
				if(current==null){
					parent.right = newNode;
					return;
				}
			}
		}
	}
	
	public void display(Node root){
		if(root!=null){
			display(root.left);
			System.out.print(" " + root.data);
			display(root.right);
		}
	}
	
	public static void main(String arg[]){
		sample8 b = new sample8();
		b.insert(1);b.insert(2);
		b.insert(3);b.insert(-1);b.insert(-1);b.insert(4);b.insert(-1);b.insert(-1);
		b.insert(5);b.insert(6);
		System.out.println("Original Tree : ");	
		b.display(root);
		
	}
}

class Node{
	int data;
	Node left;
	Node right;	
	public Node(int data){
		this.data = data;
		left = null;
		right = null;
	}
}