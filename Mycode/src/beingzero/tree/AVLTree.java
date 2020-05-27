package beingzero.tree;

public class AVLTree {
/*
 why AVL tree
 	use to improve performace in the Binary Tree for insert, search, delete
 	- For AVL tree it has a function called Rotation
 AVL tree is always balanced binary tree
 	- it uses mechanisim called height balancing
 		height of the immediate subtee of any nodes differ by atmost one
 */
	
	/*
	 * case1: rotation is not required
	 * Case2: rotation is required( when left subtree height and right subtree height is differed by more than 1)
		Left-Left condition - do right rotation
		Left-Right condition - do left rotation + do right rotation
		Right-Right condition - do left condition
		Right-left condition
		
		
		AVL_Insert(root, value){
		
		}
		
		rightRotate(current disbalancedNode)
		{
		newRoot = currentDisBalancedNode.left;
		currentDisalanceNode.left = currentDissbalceNode.left.right
		newRoot.right=currentDisbalanceNode;
		
		currentDisbalanced.height=calculateHeight(currentDisbalancedNode0
		NewRoot.height=calculateHeight(newRoot)
		}
		
			leftRotate(currentDisbalancedNodeLeftChild)
		{
		newRoot = currentDisbalancedNodeLeftChild.right
		currentDisbalancedNodeLeftChild.right = currentDisbalancedNodeLeftChild.right
		newRoot.left=currentDisbalancedNodeLeftChild;
		
		currentDisbalancedNodeLeftChild.height=calculateHeight(currentDisbalancedNode0
		NewRoot.height=calculateHeight(newRoot)
		return newRoot;
		}
	
	 */
}
