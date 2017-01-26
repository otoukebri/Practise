package sandy;

import java.util.Stack;

public class BalancedTree {

	public static void main(String[] args) {
		BTNode root = createSampleTree();
		System.out.println(isTreeBalanced(root));
	}
	
	private static boolean isTreeBalanced(BTNode root) {
		if(root == null)
			return true;
		
		Stack<BTNode> stack = new Stack<BTNode>();
		BTNode cur = root;
		
		while(!stack.empty() || cur != null) {
			if(cur != null) {
				stack.push(cur);
				cur = cur.getLeft();
			}
			else {
				cur = stack.pop();
				
				cur = cur.getRight();
			}
		}
		
		return true;
	}

	private static BTNode createSampleTree() {
		BTNode root = new BTNode(40);
		root.setLeft(new BTNode(20));
		root.setRight(new BTNode(60));
		root.getLeft().setLeft(new BTNode(10));
		root.getLeft().setRight(new BTNode(30));
		root.getRight().setLeft(new BTNode(50));
		root.getRight().setRight(new BTNode(70));
		return root;
	}

}
