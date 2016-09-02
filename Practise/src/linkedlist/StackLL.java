package linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StackLL {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		MyStack myStack = new MyStack();
		boolean loopExit = false;
		while(!loopExit) {
			System.out.println("Select your choice: 1.push, 2.pop, 3.size, 4.display, 5.exit");
			int choice = Integer.parseInt(br.readLine());
			switch(choice) {
				case 1: 
					System.out.println("Enter data to push: ");
					//sc.nextLine();
					String data = br.readLine();
					myStack.push(data);
					break;
				case 2:
					if(myStack.stackSize() == 0) {
						System.out.println("Stack is empty");
					}
					else {
						System.out.println("Popped: " +myStack.pop());
					}
					break;
				case 3:
					System.out.println(myStack.stackSize());
					break;
				case 4:
					myStack.displayStack();
					break;
				case 5:
					loopExit = true;
					break;
				default: 
					System.out.println("Invalid choice");
			}
		}
		br.close();
	}
}

class MyStack {
	private StringNode head;
	
	public void push(String data) {
		StringNode node = new StringNode(data);
		node.setNextNode(head);
		head = node;
	}
	
	public String pop() {
		String popData = head.getData();
		head = head.getNextNode();
		return popData;
	}
	
	public int stackSize() {
		int size = 0;
		StringNode temp = head;
		while(temp != null) {
			size++;
			temp = temp.getNextNode();
		}
		return size;
	}
	
	public void displayStack() {
		StringNode temp = head;
		while(temp != null) {
			System.out.print(temp.getData() +" ");
			temp = temp.getNextNode();
		}
		System.out.println();
	}
}

class StringNode {
	private String data;
	private StringNode nextNode;
	
	StringNode(String data) {
		this.data = data;
	}
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public StringNode getNextNode() {
		return nextNode;
	}

	public void setNextNode(StringNode nextNode) {
		this.nextNode = nextNode;
	}
}