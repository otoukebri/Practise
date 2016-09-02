package linkedlist;

import java.util.Scanner;

public class InsertNewNodeSortedLL {

	public static void main(String[] args) {
		CreateSingleLL ll = new CreateSingleLL("1, 11, 21, 31, 41, 51, 61, 71, 91, 101");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter new value to insert into sorted LL: ");
		int newVal = Integer.parseInt(sc.nextLine());
		
		Node newNode = new Node(newVal);
		
		Node cur = ll.getHead();
		if(cur != null) {
			int insertPos = 0;
			Node prev = cur;
			while(cur != null && newVal >= cur.getData()) {
				prev = cur;
				cur = cur.getNextNode();
				insertPos++;
			}
			if(insertPos == 0) {
				ll.setHead(newNode);
			}
			else {
				prev.setNextNode(newNode);
			}
		}
		else {
			ll.setHead(newNode);
		}
		newNode.setNextNode(cur);
		
		ll.displayLL();
		sc.close();
	}
}
