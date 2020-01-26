package com.linkedList;

import com.node.SingleNode;

public class SingleLinkedList {
	private SingleNode head;
	private SingleNode tail;
	private int size;
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

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

	public SingleNode createLinkedList(int value) {
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
		if(!existsLinkedList()) {
			System.out.println("Linked List does not exists..");
			return;
		}else if (location == 0) {
			node.setNext(head);
			head = node;
		}else if(location >= size) {
			node.setNext(null);
			tail.setNext(node);
			tail = node;
		}else {
			SingleNode tempNode = head;
			for(int i=0; i<location-1; i++) {
				tempNode = tempNode.getNext();
			}
			SingleNode nextNode = tempNode.getNext();
			tempNode.setNext(node);
			node.setNext(nextNode);
		}
		setSize(getSize() + 1);
	}

	private boolean existsLinkedList() {
		// TODO Auto-generated method stub
		return head!=null;
	}

	public void deletionOfNode(int location) {
		if(!existsLinkedList()) {
			System.out.println("Linked List does not exists..");
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
