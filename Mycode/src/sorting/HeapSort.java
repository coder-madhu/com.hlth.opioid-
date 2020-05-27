package sorting;

public class HeapSort {
/*
 Uses Heap Binary tree
 first it sets all elements into heap binary tree
 
 //Heap wont use linkedlist
  * 
  Binary Heap is the binary tree with some special properties
  	- value of give node must be <= value of the child (min Heap)
  	- value of any give node must be >= value of the child (max heap
  	
  	
  	Heapsort uses min Heap property
  	1. create heap
  	2. extract
  	
  	Heapify (is the mechanism to maintain heap property)
  	
 */
	
	public static void main(String[] args) {
		int[] a = new int[] {1,2,3,9,6,78,55,44,22,66,45,58,5,55};
		
		heapSort(a);
		
		
	}

private static void heapSort(int[] a) {
	HeapByArray ar = new HeapByArray(a.length);

	for(int i =0; i<a.length; i++) {
		ar.insertHeap(a[i]);
	}
	for(int i =0; i<a.length; i++) {
	System.out.print(ar.extractHeadOfHeap()+",");
	}
	
}

}

class HeapByArray{
	
	int[] heap;
	int sizeOfTree;
	
	
	public HeapByArray(int size) {
		this.heap = new int[size+1];
		this.sizeOfTree = 0;
		System.out.println("HeapCreated");
	}
	
	void insertHeap(int value) {
		heap[sizeOfTree+1]=value;
		sizeOfTree++;
		heapifyBottom(sizeOfTree);
	//	levelOrder();
	}
	
	int extractHeadOfHeap() {
		if(sizeOfTree==0) return -1;
		int extractedValue = heap[1];
		heap[1] = heap[sizeOfTree];
		sizeOfTree--;
		heapifyTopToBottom(1);
	//	levelOrder();
		return extractedValue;
		
	}
	
	private void heapifyBottom(int index) {
		int parent = index/2;
		if(index<=1) {
			return;
		}
		if(heap[index]<heap[parent]) {
			swap(index, parent);
		}
		heapifyBottom(parent);
	}

	private void swap(int index, int parent) {
		int temp = heap[index];
		heap[index]=heap[parent];
		heap[parent]=temp;
	}
	
	
	private void heapifyTopToBottom(int index) {
	
		int left = index*2;
		int right = (index*2)+1;
		int smallestChild=0;
		if(sizeOfTree<left) {
			return;
		}if(sizeOfTree==left) { //Only one leftChild
			swap(index,left);
			return;
		}else { //has both childs
			if(heap[left]<heap[right]) {
				smallestChild = left;
			}else {
				smallestChild = right;
			}
			if(heap[index] > heap[smallestChild]) {
				swap(index,smallestChild);
			}
		}
		heapifyTopToBottom(smallestChild);
	}

	public void levelOrder() {
		System.out.println("Printing all the elements of this Heap...");// Printing from 1 because 0th cell is dummy
		for (int i = 1; i <= sizeOfTree; i++) {
			System.out.print(heap[i] + " ");
		}
	}//end of method
	
	

	int peek() throws IllegalAccessException {
		if(heap.length>0) {
			return heap[1];
		}
		throw new RuntimeException("Empty heap");
	}
	
	void deleteHeap(){
		this.heap =null;
	}
	
	int sizeOfHeap() {
		return heap.length;
	}
	
	int sizeOfTree() {
		return this.sizeOfTree;
	}
	
	boolean isHeapEmpty() {
		return (this.sizeOfTree<=0);
		
	}
}