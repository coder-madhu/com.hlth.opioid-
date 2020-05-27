package linkedlist;

public class LL {
	
	Node head;
	
	LL insert(LL ll,int data){
	 Node new_node = new Node(data);
	 if(ll.head==null) {
		 ll.head= new_node;
	 }else {
		 Node currentNode = ll.head;
		 while(currentNode.next!=null) {
			 currentNode = currentNode.next;
		 }
		 currentNode.next=new_node;
	 }
		return ll;
	}
	
	void traverse(LL ll) {
	 Node currentNode = ll.head;
	 if(currentNode!=null) {
			 while(currentNode.next!=null) {
				 System.out.println(currentNode.data);
				 currentNode = currentNode.next;
			 }
			 System.out.println(currentNode.data);
	 }
	}
	public static void main(String[] args) {
		
		LL ll = new LL();
		ll = ll.insert(ll, 1);
		ll = ll.insert(ll, 2);
		ll = ll.insert(ll, 3);
		ll = ll.insert(ll, 4);
		ll = ll.insert(ll, 5);
		ll = ll.insert(ll, 6);
		ll = ll.insert(ll, 7);
		
		//ll.traverse(ll);
		//
		reverseList(ll);
		ll.traverse(ll);
	}

	//Reversee Linked List.:
	private static LL reverseList(LL ll) {
		Node head = ll.head;
		Node prevNode = null;
		while(head!=null) {
			Node next = head.next;
			head.next = prevNode;
			prevNode = head;
			head=next;
		}
		ll.head = prevNode;
		return ll;
		
	}
	
	/*
	 * void create() {
	 * 
	 * }
	 * 
	 * void traverse() {
	 * 
	 * }
	 * 
	 * void insert() {
	 * 
	 * }
	 * 
	 * void deleteNode() {
	 * 
	 * }
	 * 
	 * void deleteEntire(){
	 * 
	 * } void insertByIndex(){
	 * 
	 * }
	 */
}
