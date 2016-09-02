package binarytree;

public class BTNode<Type> {
	Type data;
	BTNode<Type> left;
	BTNode<Type> right;
	
	public BTNode(Type data) {
		this.data = data;
	}

	public Type getData() {
		return data;
	}

	public void setData(Type data) {
		this.data = data;
	}

	public BTNode<Type> getLeft() {
		return left;
	}

	public void setLeft(BTNode<Type> left) {
		this.left = left;
	}

	public BTNode<Type> getRight() {
		return right;
	}

	public void setRight(BTNode<Type> right) {
		this.right = right;
	}
}