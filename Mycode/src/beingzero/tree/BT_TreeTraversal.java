package beingzero.tree;

public class BT_TreeTraversal {
	
	/*
	preOrderTraversal(root){	
	if(root == null{
		return error;
	}
	else {
		print root;
		preOrderTraversal(root.left);
		preOrderTraversal(root.rigth);
	}
	}
	*/
	
/*
	InOrderTraversal(root){	
	if(root == null{
		return error;
	}
	else {
	
		InOrderTraversal(root.left);
			print root;
		InOrderTraversal(root.rigth);
	}
	}
	*/
	
	
	/*
	PostOrderTraversal(root){	
	if(root == null{
		return error;
	}
	else {
	
		PostOrderTraversal(root.left);
		PostOrderTraversal(root.rigth);
		print root;
	}
	}
	*/
	
	/*
	 LevelOrderTraversal(root){
	 createQueue(Q)
		 enqueue(root);
		 while(Q is not empty)
		 enqueue all the child of first element
		 dequeue and print
	 	 
	 */
	
	/*
	 Search Value in BT
	  to search we use level order traveral
	  it uses Queue
	 	searchForGiven(value){
	 	if (root==null)
	 		return error message;
	 	else
	 		do a level order traversal
	 		if value found
	 			return success
	 		return unsuccssful
	 
	 */
	//Insert value in BT
	/*
	 Insertion:
	 	when root is blank - crete root and insert
	 	do level order traversal find the first vacant place and insert there
	 
	 Deletion:
	 	when the value is to be deleted is not existing in tree- return false
	 	when value to be deleted exists in the tree
	 		delete the deeptest done of the bt and replace in place of deleted node
	 	if value found to be deleted
	 		use Level order traversal and find the deepest node
	 		delete the node and replace with deepest node
	 */
}
