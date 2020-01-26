package com.linkedList;

import com.node.SingleNode;

public class SingleLinkedList {
	private SingleNode head, tail;
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

	public SingleNode createSingleLinkedList(int value) {
		SingleNode node = new SingleNode();
		node.setValue(value);
		node.setNext(null);
		head = node;
		tail = node;
		size = 1;
		return head;
	}

	public void insertInLinkedList(int value, int location) {
		SingleNode node = new SingleNode();
		node.setValue(value);
		if (!existsLinkedList()) {
			System.out.println("Linked list does not exists..");
			return;
		} else if (location == 0) {
			node.setNext(head);
			head = node;
		} else if (location >= size) {
			node.setNext(null);
			tail.setNext(node);
			tail = node;
		} else {
			SingleNode tempNode = head;
			for(int i=0; i<location; i++) {
				tempNode = tempNode.getNext();
			}
			SingleNode nextNode = tempNode.getNext();
			tempNode.setNext(node);
			node.setNext(nextNode);
		}
		setSize(getSize() + 1);
	}
	
	public void traverseLinkedList() {
		if(!existsLinkedList()) {
			System.out.println("Linked list does not exists..");
			return;
		}else {
			SingleNode tempNode = head;
			for(int i = 0; i<size; i++) {
				System.out.print(tempNode.getValue());
				tempNode = tempNode.getNext();
				if(i != getSize()-1) {
					System.out.print("->");
				}
			}
			System.out.println();
		}
	}

	private boolean existsLinkedList() {
		return head != null;
	}

	public void deletionOfNode(int location) {
		if(!existsLinkedList()) {
			System.out.println("Linked list does not exists..");
			return;
		}else if(location == 0) {
			head = head.getNext();
			setSize(getSize() - 1);
			if(getSize() == 0) {
				tail = null;
			}
		}
		
	}
}
