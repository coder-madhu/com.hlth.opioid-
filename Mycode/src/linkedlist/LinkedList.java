package linkedlist;

public class LinkedList {
	Node head;
	LinkedList insert(LinkedList ll, int d) {
		Node newNode = new Node(d);
		if(head == null) {
			head = newNode;
		}else {
			Node last = ll.head;
			while(last.next !=null) {
				last = last.next;
			}
			last.next = newNode;
		}
		return ll;
	}
	
	void delete(LinkedList ll, int index) {
		Node head = ll.head;
		if(head==null) {
			System.out.println(" List is empty");
		}else {
			int counter = 0;
			Node node = head.next;
			while(node.next!=null) {
				counter++;
			}
		}
	}
	int get(LinkedList ll, int index) {
		return index;
	}
	void traverse(LinkedList ll) {
		
	}


}



	
