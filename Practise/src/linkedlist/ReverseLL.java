package linkedlist;

public class ReverseLL {

	public static void main(String[] args) {
		
//		CreateSingleLL ll = new CreateSingleLL("1, 11, 21, 31, 41, 51, 61, 71, 81, 91, 101");
//		
//		Node cur = ll.getHead();
//		Node prev = null, next = cur;
//		
//		while(cur != null) {
//			next = next.getNextNode();
//			cur.setNextNode(prev);
//			prev = cur;
//			cur = next;
//		}
//		ll.setHead(prev);
//		ll.displayLL();
		
		CreateSingleLL ll2 = new CreateSingleLL("1, 11, 21, 31, 41, 51, 61, 71, 81, 91, 101");
		ll2.setHead(reverseRecursive(ll2.getHead(), null));
		ll2.displayLL();
		
//		ll2.setHead(reverseRecursive2(ll2.getHead(), null));
//		ll2.displayLL();
	}

	private static Node reverseRecursive(Node cur, Node prev) {
		Node next = cur.getNextNode();
		cur.setNextNode(prev);
		Node head;
		if(next != null) {
			head = reverseRecursive(next, cur);
		}
		else {
			return cur;
		}
		return head;
	}
	
//	private static Node reverseRecursive2(Node cur, Node prev) {
//		Node head = null;
//		if(cur != null) {
//			cur.setNextNode(reverseRecursive2(cur.getNextNode(), cur));
//			return prev;
//			head = 
//		}
//		return head;
//	}
}