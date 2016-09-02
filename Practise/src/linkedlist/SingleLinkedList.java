package linkedlist;

import java.util.Scanner;

public class SingleLinkedList {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MyLinkedList list = new MyLinkedList();
        boolean loopExit = false;
       while(!loopExit) {
            System.out.println("\nSingly Linked List Operations\n");
            System.out.println("1. insert at begining");
            System.out.println("2. insert at end");
            System.out.println("3. insert at position");
            System.out.println("4. delete at begining");
            System.out.println("5. delete at end");
            System.out.println("6. delete at position");
            System.out.println("7. check empty");
            System.out.println("8. get size");     
            System.out.println("9. Exit");
            int choice = scan.nextInt();
            switch (choice) {
            case 1: 
                System.out.println("Enter integer element to insert");
                list.addFirst(scan.nextInt());
                break;                          
            case 2: 
                System.out.println("Enter integer element to insert");
                list.addLast(scan.nextInt());                     
                break;
            case 3: 
                System.out.println("Enter integer element to insert");
                int num = scan.nextInt();
                System.out.println("Enter position");
                int pos = scan.nextInt();
                if (pos <= 1 || pos > list.getSize() )
                    System.out.println("Invalid position\n");
                else
                    list.addAt(num, pos);
                break;    
            case 4: 
                list.removeFirst();
                System.out.println("Deleted");
                break;
            case 5: 
            	list.removeLast();
                System.out.println("Deleted");
                break;
            case 6: 
                System.out.println("Enter position");
                int p = scan.nextInt();
                if (p <= 1 || p > list.getSize())
                    System.out.println("Invalid position\n");
                else
                    list.removeAt(p);
                break;
            case 7:
                System.out.println("Empty status = "+ list.isEmpty());
                break;                   
            case 8:
                System.out.println("Size = "+ list.getSize() +" \n");
                break; 
            case 9:
            	loopExit = true;
            	break;
             default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }
            /*  Display List  */ 
            list.display();
        }
       scan.close();
	}

}

class IntNode {
	private int value;
	private IntNode nextNode;
	
	public IntNode() {
		// TODO Auto-generated constructor stub
	}
	
	IntNode(int value, IntNode nextNode) {
		this.value = value;
		this.nextNode = nextNode;
	}
	
	void setValue(int value) {
		this.value = value;
	}
	
	int getValue() {
		return value;
	}
	
	void setNextNode(IntNode nextNode) {
		this.nextNode = nextNode;
	}
	
	IntNode getNextNode() {
		return nextNode;
	}
}

class MyLinkedList {
	private IntNode head;
	private IntNode tail;
	private int size;
	
	public MyLinkedList() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public int getSize() {
		return size;
	}
	
	public void addFirst(int value) {
		IntNode node = new IntNode(value, null);
		size++;
		if(head == null) {
			head = node;
			tail = node;
		}
		else {
			node.setNextNode(head);
			head = node;
		}
	}
	
	public void addLast(int value) {
		IntNode node = new IntNode(value, null);
		size++;
		if(tail == null) {
			head = node;
			tail = node;
		}
		else {
			tail.setNextNode(node);
			tail = node;
		}
	}
	
	public void addAt(int value, int pos) {
		IntNode node = new IntNode(value, null);
		IntNode cur = head;
		for(int i=1; i<pos; i++) {
			if(i == pos-1) {
				IntNode temp = cur.getNextNode();
				node.setNextNode(temp);
				cur.setNextNode(node);
				break;
			}
			cur = cur.getNextNode();
		}
		size++;
	}
	
	public void removeFirst() {
		head = head.getNextNode();
		if(size == 1) {
			tail = head;
		}
		size--;
	}
	
	public void removeLast() {
		IntNode temp = head;
		while(temp != tail) {
			if(temp.getNextNode() == tail) {
				break;
			}
			temp = temp.getNextNode();
		}
		if(size == 1) {
			tail = null;
			head = null;
		}
		else {
			tail = temp;
			tail.setNextNode(null);
		}
		size--;
	}
	
	public void removeAt(int pos) {
		IntNode cur = head, deleteNode = null;
		for(int i=1; i<pos-1; i++) {
			cur = cur.getNextNode();
		}
		deleteNode = cur.getNextNode();
		cur.setNextNode(deleteNode.getNextNode());
		deleteNode = null;
		size--;
	}
	
	public void display() {
		IntNode cur = head;
		for(int i=0; i<size; i++) {
			System.out.print(cur.getValue() +" ");
			cur = cur.getNextNode();
		}
	}
}