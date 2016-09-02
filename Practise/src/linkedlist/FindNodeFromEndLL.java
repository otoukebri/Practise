package linkedlist;

import java.util.Hashtable;
import java.util.Scanner;

public class FindNodeFromEndLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchLL newLL = new SearchLL("1, 2, 3, 4, 5");
		newLL.createLL();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter position to find: ");
		int n = Integer.parseInt(input.nextLine());
		int size = newLL.getSize();
		if(n > 0 && n <= size) {
			System.out.println("Nth node from start: " +newLL.findUsingLoop(n));
			System.out.println("Nth node from end: " +newLL.findUsingLoop(size - n + 1));
			System.out.println("Nth node from start: " +newLL.findUsingHashTable(n));
			System.out.println("Nth node from end: " +newLL.findUsingHashTable(size - n + 1));
			System.out.println("Nth node from end: " +newLL.findUsingFloyd(n));
			System.out.println("Nth node from end: " +newLL.findUsingRecursion(n));
		}
		else {
			System.out.println("Invalid search position");
		}
		input.close();
	}

}

class SearchLL {
	private Node head;
	private String nodeValues;
	private int size;
	
	SearchLL(String nodeValues) {
		this.nodeValues = nodeValues;
		size = nodeValues.split(", ").length;
	}
	
	int getSize() {
		return size;
	}
	
	void createLL() {
		for (String data : nodeValues.split(", ")) {
			Node node = new Node(Integer.parseInt(data));
			if(head == null) {
				head = node;
			}
			else {
				Node cur = head;
				while(cur != null) {
					if(cur.getNextNode() == null) {
						cur.setNextNode(node);
						break;
					}
					else {
						cur = cur.getNextNode();
					}
				}
			}
		}
		
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.getData() +" ");
			temp = temp.getNextNode();
		}
		System.out.println();
	}
	
	int findUsingLoop(int n) {
		Node cur = head;
		for(int i=1; i<n; i++) {
			cur = cur.getNextNode();
		}
		return cur.getData();
	}
	
	int findUsingHashTable(int n) {
		Hashtable<Integer, Node> hashTable = new Hashtable<Integer, Node>();
		Node cur = head;
		int i = 0;
		while(cur != null) {
			hashTable.put(++i, cur);
			cur = cur.getNextNode();
		}
		return hashTable.get(n).getData();
	}
	
	int findUsingFloyd(int n) {
		int curPos = 1;
		Node ptr1 = head;
		Node ptr2 = head;
		while(ptr1.getNextNode() != null) {
			curPos++;
			if(curPos <= n) {
				ptr1 = ptr1.getNextNode();
			}
			else {
				ptr1 = ptr1.getNextNode();
				ptr2 = ptr2.getNextNode();
			}
		}
		return ptr2.getData();
	}
	
	int findUsingRecursion(int n) {
		return recursiveFunction(head, n).getData();
	}

	int counter;
	public Node recursiveFunction(Node headPtr, int n) {
		Node temp = null;
		if(headPtr != null) {
			temp = recursiveFunction(headPtr.getNextNode(), n);
			counter++;
			if(counter == n) {
				temp = headPtr;
			}
		}
		return temp;
	}
}