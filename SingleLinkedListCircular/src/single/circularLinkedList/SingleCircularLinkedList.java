package single.circularLinkedList;

import node.singleNode.SingleNode;

public class SingleCircularLinkedList {
	private SingleNode head;
	private SingleNode tail;
	private int size;
	
	public SingleNode getHead() {
		return head;
	}
	
	public void setHead(SingleNode head) {
		this.head = head;
	}
	
	public SingleNode getTail() {
		return tail;
	}
	
	public void setTail(SingleNode tail) {
		this.tail = tail;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public SingleNode createSingleCircularLinkedList(int nodeValue) {
		SingleNode node = new SingleNode();
		node.setValue(nodeValue);
		node.setNext(null);
		head = node;
		tail = node;
		size = 1;
		return head;
	}
	
	public void traverseSingleCircularLinkedList() {
		if(existsSingleCircularLinkedList()) {
			SingleNode tempNode  = head;
			for(int i=0; i<size; i++) {
				System.out.print(tempNode.getValue());
				if(i != size-1) {
					System.out.print(" -> ");
				}
				tempNode = tempNode.getNext();
			}
			System.out.println();
		}else {
			System.out.println("Linked List does not exists..");
		}
	}

	private boolean existsSingleCircularLinkedList() {
		return head != null;
	}

	public void insertInLinkedList(int nodeValue, int location) {
		SingleNode node = new SingleNode();
		node.setValue(nodeValue);
		if(!existsSingleCircularLinkedList()) {
			System.out.println("Linked list does not exists..");
			return;
		}else if(location == 0) {
			node.setNext(head);
			head = node;
			tail.setNext(node);
		}else if(location >= size) {
			tail.setNext(node);
			tail = node;
			tail.setNext(head);
		}else {
			SingleNode tempNode = head;
			for(int i=0; i<location - 1; i++) {
				tempNode = tempNode.getNext();
			}
			SingleNode nextNode = tempNode.getNext();
			tempNode.setNext(node);
			node.setNext(nextNode);
		}
		setSize(getSize() + 1);
	}
	
	public void printHeadUsingTail() {
		if(existsSingleCircularLinkedList()) {
			System.out.println("Printing Tail : " + tail.getValue());
			System.out.println("Printing Head : " + head.getValue());
			System.out.println("Printing Head using Tail reference : " + tail.getNext().getValue());
		}else {
			System.out.println("Linked list does not exists..");
		}
	}
	
	public void deletionOfNode(int location) {
		if(existsSingleCircularLinkedList()) {
			if(location == 0) {
				head = head.getNext();
				tail.setNext(head);
				setSize(getSize() - 1);
				if(getSize() == 0) {
					tail = null;
				}
			}else if(location >= size) {
				SingleNode tempNode = head;
				for(int i=0; i<size-1; i++) {
					tempNode = tempNode.getNext();
				}
				if(tempNode == head) {
					tail = head = null;
					setSize(getSize() - 1);
				}
				tempNode.setNext(head);
				tail = tempNode;
				setSize(getSize()  - 1);
			}else {
				SingleNode tempNode = head;
				for(int i = 0; i<location - 1; i++) {
					tempNode = tempNode.getNext();
				}
				tempNode.setNext(tempNode.getNext().getNext());
				setSize(getSize()-1);
			}
		}else {
			System.out.println("Linked list does not exists..");
		}	
	}
	
	//delete linked list
	public void deleteLinkedList() {
		System.out.println("Deleting the linked list");
		head = null;
		if(tail == null) {
			System.out.println("Linked list already deleted");
		}else {
			tail.setNext(null);
			tail = null;
			System.out.println("Linked list deleted successfully..");
		}
	}
	
	public void searchNode(int nodeValue) {
		if(existsSingleCircularLinkedList()) {
			SingleNode tempNode = head;
			for(int i=0; i<size; i++) {
				if(tempNode.getValue() == nodeValue) {
					System.out.println("Node found at location : " + i);
					return;
				}
				tempNode = tempNode.getNext();
			}
			System.err.println("Node is not present in the linked list..");
		}else {
			System.out.println("Linked List does not exists..");
		}
	}
}
