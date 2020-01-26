package com.queue;

public class QueueByLinkedListMain {
	public static void main(String []args) {
		QueueByLinkedList queue = new QueueByLinkedList();
		
		System.out.println("Enqueuing 5 values in Queue..");
		for(int i = 1; i<6; i++) {
			queue.enQueue(i*2);
		}
		
		queue.traverseList();
		
		System.out.println("Peeking value : ");
		System.out.println(queue.peek());
		System.out.println();
		
		System.out.println("Dequeuing values from queue..");
		for(int i=0;i<4;i++) {
			System.out.println(queue.deQueue());
		}
		
		System.out.println("Traversing list : ");
		queue.traverseList();
		System.out.println("Dequeue : "+queue.deQueue());
		System.out.println("Dequeue : "+queue.deQueue());
		System.out.println("Dequeue : "+queue.deQueue());
	}
}
