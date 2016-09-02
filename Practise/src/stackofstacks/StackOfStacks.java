package stackofstacks;

public class StackOfStacks {
	StackOfStacksNode headOfStacks;
	int maxStackSize;
	
	StackOfStacks(int maxStackSize) {
		this.maxStackSize = maxStackSize;
	}
	
	void push(int data) {
		StackNode head = null;
		if(headOfStacks != null) {
			StackNode tempHead = headOfStacks.getStackNodeHead();
			if(getSizeOfStack(tempHead) < maxStackSize) {
				head = headOfStacks.getStackNodeHead();
				StackNode newStackNode = new StackNode(data, head);
				headOfStacks.setStackNodeHead(newStackNode);
			}
			else {
				createNewHeadOfStacks(data);
			}
		}
		else {
			createNewHeadOfStacks(data);
		}
	}
	
	void createNewHeadOfStacks(int data) {
		StackNode newStackNode = new StackNode(data, null);
		StackOfStacksNode newHeadOfStacks = new StackOfStacksNode(newStackNode, headOfStacks);
		headOfStacks = newHeadOfStacks;
	}
	
	void display() {
		StackOfStacksNode tempHeadOfStacks = headOfStacks;
		while(tempHeadOfStacks != null) {
			StackNode tempHead = tempHeadOfStacks.getStackNodeHead();
			while(tempHead != null) {
				System.out.println(tempHead.getData());
				tempHead = tempHead.getNextNode();
			}
			System.out.println("HI");
			tempHeadOfStacks = tempHeadOfStacks.getNext();
		}
	}
	
	int getSizeOfStack(StackNode stackHeadNode) {
		int size = 0;
		while(stackHeadNode != null) {
			size++;
			stackHeadNode = stackHeadNode.getNextNode();
		}
		return size;
	}
}