package stackofstacks;

public class StackNode {
	int data;
	StackNode nextNode;
	
	StackNode(int data, StackNode nextNode) {
		this.data = data;
		this.nextNode = nextNode;
	}
	
	void setData(int data) {
		this.data = data;
	}
	
	void setNextNode(StackNode nextNode) {
		this.nextNode = nextNode;
	}
	
	int getData() {
		return data;
	}
	
	StackNode getNextNode() {
		return nextNode;
	}
}