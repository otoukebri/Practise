package linkedlist;

public class CreateSingleLL {
	private Node head;
	private String nodeValues;
	private int size;
	
	CreateSingleLL(String nodeValues) {
		if(!nodeValues.trim().isEmpty()) {
			this.nodeValues = nodeValues;
			size = nodeValues.split(", ").length;
			createLL();
		}
	}
	
	public int getSize() {
		return size;
	}
	
	public Node getHead() {
		return head;
	}
	
	public void setHead(Node head) {
		this.head = head;
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
		
		displayLL();
	}
	
	void displayLL() {
		Node cur = head;
		while(cur != null) {
			System.out.print(cur.getData() +" ");
			cur = cur.getNextNode();
		}
		System.out.println();
	}
}