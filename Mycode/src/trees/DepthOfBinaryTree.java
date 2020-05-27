package trees;

public class DepthOfBinaryTree {
	int answer;
	
	void maxDepth(TreeNode root, int depth) {
		if(root==null) {
		}
		if(root.left==null  && root.right==null) {
			answer = Math.max(answer, depth);
		}
		
		maxDepth(root.left, depth+1);
		maxDepth(root.right, depth+1);
	}
	
	
}

class TreeNode{
	
	TreeNode left;
	TreeNode right;
}