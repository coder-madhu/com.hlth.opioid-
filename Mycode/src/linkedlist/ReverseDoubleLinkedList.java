package linkedlist;

public class ReverseDoubleLinkedList {

    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {

    if(head==null){
        return head;
    }
    DoublyLinkedListNode curr_node = head;
    DoublyLinkedListNode n_Head= head;
    while(curr_node!=null){
        DoublyLinkedListNode prev = curr_node.prev;
        curr_node.prev = curr_node.next;
        curr_node.next = prev;
        n_Head = curr_node;
        curr_node = curr_node.prev;
    }
        return n_Head;
    }
}
 class DoublyLinkedListNode{
	 DoublyLinkedListNode next;
	 DoublyLinkedListNode prev;
	 int data;
 }