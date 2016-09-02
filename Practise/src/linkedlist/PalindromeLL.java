package linkedlist;

public class PalindromeLL {

	public static void main(String[] args) {
		CreateSingleLL ll = new CreateSingleLL("1, 2, 3, 2, 1");
		Node slowPtr = ll.getHead();
		Node fastPtr = ll.getHead();
		String firstPart = "" +slowPtr.getData();
		
		while(fastPtr.getNextNode() != null) {
			fastPtr = fastPtr.getNextNode();
			if(fastPtr.getNextNode() != null) {
				fastPtr = fastPtr.getNextNode();
				slowPtr = slowPtr.getNextNode();
				if(fastPtr.getNextNode() != null) {
					//if the length is odd this avoids fetching middle node data
					firstPart += slowPtr.getData();
				}
			}
		}
		
		String lastPart = "";
		while(slowPtr != null) {
			Node temp = slowPtr.getNextNode();
			
		}
	}

}
