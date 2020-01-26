package com.queue;

import com.linkedList.SingleLinkedList;
import com.node.SingleNode;

public class QueueByLinkedList {
	SingleLinkedList list;

	public QueueByLinkedList() {
		list = new SingleLinkedList();
	}
	
	public void enQueue(int value) {
		if(list.getHead() == null) {
			list.createSingleLinkedList(value);
		}else {
			list.insertInLinkedList(value, list.getSize());
		}
	}
	
	public void traverseList() {
		list.traverseLinkedList();
	}

	public int peek() {
		if(!isQueueEmpty()) {
			return list.getHead().getValue();
		}else {
			System.out.println("Queue is empty");
			return -1;
		}
	}

	private boolean isQueueEmpty() {
		return list.getHead()==null;
	}

	public int deQueue() {
		int value = -1;
		if(isQueueEmpty()) {
			System.out.println("Queue underflow error.. !!");
		}else {
			value = list.getHead().getValue();
			list.deletionOfNode(0);
		}
		return value;
	}
}
