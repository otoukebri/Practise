package stackofstacks;

public class StackOfStacksNode {
	StackNode stackNodeHead;
	StackOfStacksNode next;
	
	StackOfStacksNode(StackNode stackNodeHead, StackOfStacksNode next) {
		this.stackNodeHead = stackNodeHead;
		this.next = next;
	}
	
	void setNext(StackOfStacksNode next) {
		this.next = next;
	}
	
	StackOfStacksNode getNext() {
		return next;
	}
	
	void setStackNodeHead(StackNode stackNodeHead) {
		this.stackNodeHead = stackNodeHead;
	}
	
	StackNode getStackNodeHead() {
		return stackNodeHead;
	}
}