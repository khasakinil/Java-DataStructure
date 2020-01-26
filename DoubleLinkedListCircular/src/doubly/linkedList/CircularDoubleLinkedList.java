package doubly.linkedList;

import node.doubleNode.DoubleNode;

public class CircularDoubleLinkedList {
	DoubleNode head, tail;
	private int size;
	
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
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public DoubleNode createCircularLinkedList(int nodeValue) {
		DoubleNode node = new DoubleNode();
		node.setValue(nodeValue);
		node.setNext(node);
		node.setPrev(node);
		head = node;
		tail = node;
		size = 1;
		return head;
	}
	
	public void traverseCircularDoubleLinkedList() {
		if(existsLinkedList()) {
			DoubleNode tempNode = head;
			for(int i = 0; i<size; i++) {
				System.out.print(tempNode.getValue());
				if(i != size-1) {
					System.out.print(" -> ");
				}
				tempNode = tempNode.getNext();
			}
			System.out.println();
		}else {
			System.out.println("Linked list does not exists anymore..");
		}
	}

	private boolean existsLinkedList() {
		return head != null;
	}
	
	public void insertInCircularDoubleLinkedList(int nodeValue, int location) {
		if(existsLinkedList()) {
			DoubleNode node = new DoubleNode();
			node.setValue(nodeValue);
			if(location == 0) {
				//insert at beginning
				node.setNext(head);
				node.setPrev(tail);
				head.setPrev(node);
				tail.setNext(node);
				head = node;
			}else if(location >= size) {
				//insert end of list
				node.setNext(head);
				node.setPrev(tail);
				head.setPrev(node);
				tail.setNext(node);
				tail = node;
			}else {
				//insert in between
				DoubleNode tempNode = head;
				for(int i=0; i<location -1; i++) {
					tempNode = tempNode.getNext();
				}
				node.setNext(tempNode.getNext());
				node.setPrev(tempNode);
				tempNode.setNext(node);
				node.getNext().setPrev(node);
			}
			size++;
			
		}else {
			System.out.println("Linked list does not exists..");
		}
	}
	
	public void printHeadUsingTail() {
		if(existsLinkedList()) {
			System.out.println("Printing Head : " + head.getValue());
			System.out.println("Printing Tail : " + tail.getValue());
			System.out.println("Head using Tail : " + tail.getNext().getValue());
			System.out.println("Tail using Head : " + head.getPrev().getValue());
		}else {
			System.out.println("Linked list does not exists..");
		}
	}
	
	public void searchNode(int nodevalue) {
		if(existsLinkedList()) {
			DoubleNode tempNode = head;
			for(int i=0; i<size; i++) {
				if(tempNode.getValue() == nodevalue) {
					System.out.println("Node is found at location : " + i);
					return;
				}
				tempNode = tempNode.getNext();
			}
			System.out.println("Node does not exists in the List");
		}else {
			System.out.println("Linked list does not exists..");
		}
	}

	public void deletionOfNode(int location) {
		if(existsLinkedList()) {
			if(location == 0) {
				//delete from beginning
				if(getSize() == 1) {
					head.setNext(null);
					head.setPrev(null);
					head = tail = null;
					return;
				}else {
					head = head.getNext();
					head.setPrev(tail);
					tail.setNext(head);
				}
			}else if(location >= size) {
				//delete from end
				if(getSize() == 1) {
					head.setNext(null);
					head.setPrev(null);
					head = tail = null;
					return;
				}
				tail = tail.getPrev();
				tail.setNext(head);
				head.setPrev(tail);
				
			}else {
				//delete in between
				DoubleNode tempNode = head;
				for(int i=0; i<location -1; i++) {
					tempNode = tempNode.getNext();
				}
				tempNode.setNext(tempNode.getNext().getNext());
				tempNode.getNext().setPrev(tempNode);
			}
			setSize(getSize() - 1);
		}else {
			System.out.println("Linked list does not exists");
		}
	}
	
	public void deleteLinkedList() {
		if(existsLinkedList()) {
			System.out.println("Deleting the linked list");
			DoubleNode tempNode = head;
			for(int i = 0; i<size; i++) {
				tempNode.setPrev(null);
				tempNode = tempNode.getNext();
			}
			head = tail = null;
			System.out.println("Linked list deleted successfully..");
		}else {
			System.out.println("Linked list already deleted..");
		}
	}
}
