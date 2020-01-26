package doubly.linkedList;

import node.doubleNode.DoubleNode;

public class DoubleLinkedList {
	int size;
	DoubleNode head, tail;
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public DoubleNode getHead() {
		return head;
	}
	
	public void setHead(DoubleNode head) {
		this.head = head;
	}
	
	public DoubleNode getTail() {
		return tail;
	}
	
	public void setTail(DoubleNode tail) {
		this.tail = tail;
	}
	
	//create Doubly linked list
	public DoubleNode createDoubleLinkedList(int nodeValue) {
		DoubleNode node = new DoubleNode();
		node.setValue(nodeValue);
		node.setNext(null);
		node.setPrev(null);
		head = node;
		tail = node;
		size = 1;
		return head;
	}
	
	//Traverse Double LinkedList
	public void traverseDoubleLinkedList() {
		if(existsDoubleLinkedList()) {
			DoubleNode tempNode = head;
			for(int i=0; i<size; i++) {
				System.out.print(tempNode.getValue());
				if(i != size-1)
				{
					System.out.print(" -> ");
				}
				tempNode = tempNode.getNext();
			}
			System.out.println();
		}else {
			System.out.println("Linked list does not exists..");
		}
	}

	private boolean existsDoubleLinkedList() {
		return head!=null;
	}
	
	public void insertInLinkedList(int nodeValue, int location) {
		if(existsDoubleLinkedList()) {
			DoubleNode node = new DoubleNode();
			node.setValue(nodeValue);
			if(location == 0) {
				node.setNext(head);
				node.setPrev(null);
				head.setPrev(node);
				head = node;
			}else if(location > size) {
				node.setNext(null);
				node.setPrev(tail);
				tail.setNext(node);
				tail = node;
			}else {
				//Insert node at specified location
				DoubleNode tempNode = head;
				for(int i=0; i<location -1 ; i++) {
					tempNode = tempNode.getNext();
				}
				node.setPrev(tempNode);
				node.setNext(tempNode.getNext());
				tempNode.setNext(node);
				node.getNext().setPrev(node);
			}
			setSize(getSize() + 1);
		}else {
			System.out.println("Linked List does not exists..");
		}
	}

	public void searchNode(int nodeValue) {
		if(existsDoubleLinkedList()) {
			DoubleNode tempNode = head;
			for(int i=0; i<size; i++) {
				if(tempNode.getValue() == nodeValue) {
					System.out.println("Node found at location : " + i);
					return;
				}
				tempNode = tempNode.getNext();
			}
			System.out.println("Node not found in the list..");
		}else {
			System.out.println("Linked list does not exists..");
		}
	}

	//Traverse Linked list in reverse order
	public void traverseInReverseOrder() {
		if(existsDoubleLinkedList()) {
			DoubleNode tempNode = tail;
			for(int i = 0; i<size; i++) {
				System.out.print(tempNode.getValue());
				tempNode = tempNode.getPrev();
				if(i != size - 1) {
					System.out.print(" <- ");
				}
			}
			System.out.println();
		}else {
			System.out.println("Linked list does not exists..");
		}
	}

	public void deletionOfNode(int location) {
		if(existsDoubleLinkedList()) {
			if(location == 0) {
				//delete node from beginning
				if(getSize() == 1) {
					head = tail = null;
					return;
				}else {
				head = head.getNext();
				head.setPrev(null);
				}
			}else if(location >= getSize()) {
				//deleting node from end
				if(tail == head) {
					head = tail = null;
					return;
				}
				tail = tail.getPrev();
				tail.setNext(null);
				
			}else {
				//deletion node from the specified location.
				DoubleNode tempNode = head;
				for(int i = 0; i<location -1; i++) {
					tempNode = tempNode.getNext();
				}
				tempNode.setNext(tempNode.getNext().getNext());
				tempNode.getNext().setPrev(tempNode);
			}
			setSize(getSize() - 1);
		}else {
			System.out.println("Linked list does not exists..");
		}
	}

	//deleting the linked list
	public void deleteLinkedList() {
		if(existsDoubleLinkedList()) {
			DoubleNode tempNode = head;
			for(int i=0; i<size; i++) {
				tempNode.setPrev(null);
				tempNode = tempNode.getNext();
			}
			head = null;
			tail = null;
			System.out.println("Linked list deleted successfully");
			
		}else {
			System.out.println("Linked list already deleted");
		}
	}
}
