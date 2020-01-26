package com.queue;

public class LinearQueue_ByArrayMain {
	public static void main(String[] args) {
		System.out.println("Creating an empty queue..");
		LinearQueue_ByArray queue = new LinearQueue_ByArray(7);

		System.out.println("Enqueuing 8 values in the queue..");
		for (int i = 1; i <= 8; i++) {
			queue.enQueue(i * 5);
		}

		queue.printQueue();

		System.out.println("Peek value from Queue..");
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		System.out.println(queue.peek());

		System.out.println("deleting 5 element from queue..");
		for (int i = 0; i < 5; i++) {
			queue.deQueue();
		}
		
		System.out.println("Peek value from Queue..");
		System.out.println(queue.peek());
		
		System.out.println("deleting 5 element from queue..");
		for (int i = 0; i < 5; i++) {
			queue.deQueue();
		}
		
		System.out.println("Deleting the entire queue..");
		queue.deleteQueue();
		
		queue.printQueue();
	}
}
