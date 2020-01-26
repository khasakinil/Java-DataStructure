package com.queue;

public class LinearQueue_ByArray {
	int arr[];
	int topOfQueue;
	int beginningOfQueue;

	// constructor to initialize the queue
	public LinearQueue_ByArray(int size) {
		arr = new int[size];
		topOfQueue = -1;
		beginningOfQueue = -1;
		System.out.println("successfully created an empty queue with an size : " + size);
	}

	// perform enqueue operation
	public void enQueue(int value) {
		if (isQueueFull()) {
			System.out.println("Queue overflow error..!!!");
			return;
		} else if (isQueueEmpty()) {
			beginningOfQueue = 0;
		}
		topOfQueue++;
		arr[topOfQueue] = value;
		System.out.println("successfully inserted value " + value + " into queue");
	}

	// check whether queue is empty
	private boolean isQueueEmpty() {
		return beginningOfQueue == -1;
	}

	// check whether queue is full
	private boolean isQueueFull() {
		return topOfQueue == arr.length - 1;
	}

	// print queue
	public void printQueue() {
		if (!isQueueEmpty()) {
			System.out.println("Printing Queue..");
			for (int i = beginningOfQueue; i <= topOfQueue; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	}

	public int peek() {
		if (!isQueueEmpty()) {
			return arr[topOfQueue];
		}
		return -1;
	}

	public void deQueue() {
		if(!isQueueEmpty()) {
			System.out.println("removing " + arr[beginningOfQueue]);
			beginningOfQueue++;
			if(beginningOfQueue>topOfQueue) {
				beginningOfQueue = topOfQueue =-1;
			}
		}else {
			System.out.println("Queue underflow error..!!");
		}
	}

	public void deleteQueue() {
		arr = null;
		System.out.println("Queue deleted successfully..");
	}
}
