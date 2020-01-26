package com.stack;

import com.linkedList.SingleLinkedList;

public class StackByLinkedList {

	SingleLinkedList list;
	
	public StackByLinkedList() {
		list = new SingleLinkedList();
	}
	
	public void push(int value) {
		if(list.getHead() == null) {
			list.createLinkedList(value);
		}else {
			list.insertInLinkedList(value, 0);
		}
		System.out.println("Inserted " + value + " in stack");
	}

	public int peek() {
		if(!stackIsEmpty()) {
			return list.getHead().getValue();
		}
		System.out.println("Stack is empty");
		return -1;
	}

	private boolean stackIsEmpty() {
		return list.getHead() == null;
	}

	public int pop() {
		int value = -1;
		if(stackIsEmpty()) {
			System.out.println("Stack is underflow");
		}else {
			value = list.getHead().getValue();
			list.deletionOfNode(0);
		}
		return value;
	}

}
