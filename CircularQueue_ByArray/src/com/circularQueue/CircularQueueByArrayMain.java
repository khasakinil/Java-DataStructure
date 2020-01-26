package com.circularQueue;

public class CircularQueueByArrayMain {
	public static void main(String []args) {
		CircularQueueByArray queue = new CircularQueueByArray(7);
		
		System.out.println("Enqueuing 7 values into the Queue..");
		for(int i=1; i<=7; i++) {
			queue.enQueue(i*3);
		}
		
		queue.enQueue(34);
		
		queue.deQueue();
		queue.enQueue(34);
		queue.printArray();
		
		queue.deQueue();
		queue.deQueue();
		queue.deleteQueue();
		queue.printArray();
	}
}
