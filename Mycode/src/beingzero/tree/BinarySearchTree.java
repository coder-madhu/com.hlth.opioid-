package beingzero.tree;

public class BinarySearchTree {
/*
 	BST is the BT
 		left subtree of node has less or equal to parent node
 		right subtree of the node has key greater than to it parent nodes key
 */
	
/*
 create BST
 	initialize root with null
 Search:
 BST_Search(root,value){
 	if(root ==null)
 		return null;
 	else if (root == value{
 	return root;
 	if(value<root)
 		BST_Search(root.left,value)
 	else if (value > root)
 		BST_Search(root.right,value)
 	}
 */
	/*
	 BST of the traversals are same as BT
	 inorder
	 preorder
	 postorder
	 levelOrder
	 */
	/*
	 Inserting Node at BST:
	 	BST is blank;
	 	BST is non blank;
	 	
	 	BST_Insert(root, value to insert)
		 if(current Node is null){
		 createa node insert valeu to insert in it
		 }else if( value to Insert <= currentNodes value)
		 	currentNode.left= BST_Inset( currentNode.lfet,valueTo Insert)
		 else
		 currentNode.right= BST_Insert(currentNode.right,valuetoInsert)
		return currentNode;
	 	
	 */
	
	/*
	 Delete Node at BST:
	 	Node to be deleted is leaf node
	 		directly delete Leaf node
	 		
	 		DeleteNodeOfBST(root, valToBeDeleted)
	 			if(root ==null) return null;
	 			if(valToBeDele < root.val)
	 				then root.left = deleteNodeOfBST(root.left, valtoBedeleted
	 			else if (valueTobeDele > root. val)
	 				then root.right = dleteNodeOfBST(root.right, valueToBeDeleted)
	 			else if current Node is the node to be deleted
	 				if root has both childern then find min element from right subtree
	 					replace current Node with min Node from right subtree and delete min node from right
	 				else if node to be delete has only left child
	 					then root= root.left
	 				else if node to be delete has only right child
	 					then root= root.right()
	 				else //if node to be delete do not have child
	 					root =null;
	 		
	 		return root;
	 	
	 	
	 */
}
