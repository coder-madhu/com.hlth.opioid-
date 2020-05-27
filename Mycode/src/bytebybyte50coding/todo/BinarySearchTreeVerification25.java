package bytebybyte50coding.todo;

import java.util.Stack;

public class BinarySearchTreeVerification25 {
	
	boolean isValidBST(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		double left_childval = -Double.MAX_VALUE;
		while (!stack.empty() || root !=null) {
			while(root!=null) {
				stack.push(root);
				root = root.left;
			}
			root=stack.pop();
			if(root.val<=left_childval) return false;
			left_childval = root.val;
			root = root.right;
		}
		return false;
	}
	
	/*
	 * boolean isvalidBST1(TreeNode root) { return validate(root, null, null); }
	 */

	private boolean validate(TreeNode root, Integer maxValue, Integer minValue) {
		if(root==null) {
			return true;
		}else if( maxValue!=null && root.val >=maxValue || minValue!=null && root.val <=minValue) {
			return false;
		}else {
			return validate(root.left,root.val,minValue) && validate(root.right, maxValue,root.val);
		}
	}

}



class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
}