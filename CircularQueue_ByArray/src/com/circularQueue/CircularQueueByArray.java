package com.circularQueue;

public class CircularQueueByArray {
	int arr[];
	int topOfQueue;
	int beginningOfQueue;
	int size;

	public CircularQueueByArray(int size) {
		this.arr = new int[size];
		this.size = size;
		this.topOfQueue = -1;
		this.beginningOfQueue = -1;
		System.out.println("Successfully created Queue of size : " + size);
	}

	public void enQueue(int value) {
		if (arr == null) {
			System.out.println("Array is not yet created.. please create first and try for inqueue operation");
		} else if (isQueueFull()) {
			System.out.println("Queue overflow error..!");
		} else {
			if (beginningOfQueue == -1) {
				beginningOfQueue = 0;
			}
			if (topOfQueue + 1 == size) {
				topOfQueue = 0;
			} else {
				topOfQueue++;
			}
			arr[topOfQueue] = value;
			System.out.println("Successfully inserted " + value + " into queue");
		}
	}

	private boolean isQueueFull() {
		if (topOfQueue + 1 == beginningOfQueue) {
			return true;
		} else if (beginningOfQueue == 0 && topOfQueue + 1 == size) {
			return true;
		} else {
			return false;
		}
	}

	public void deQueue() {
		if (isQueueEmpty()) {
			System.out.println("Queue underflow error.. !!");
		} else {
			System.out.println("-----------------------");
			System.out.println("Before deQueue");
			printArray();
			System.out.println("-----------------------");
			arr[beginningOfQueue] = 0;
			if (beginningOfQueue == topOfQueue) {
				beginningOfQueue = topOfQueue = -1;
			} else if (beginningOfQueue == size + 1) {
				beginningOfQueue = 0;
			} else {
				beginningOfQueue++;
			}
			System.out.println("-----------------------");
			System.out.println("After deQueue");
			printArray();
			System.out.println("-----------------------");
		}
	}

	private boolean isQueueEmpty() {
		return topOfQueue == -1;
	}

	public void printArray() {
		if (arr == null) {
			System.out.println("Queue is not available...");
		} else {
			System.out.println("Array Values:");
			{
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println("\nBeginning Of Queue " + beginningOfQueue);
				System.out.println("Top of Queue : " + topOfQueue);
				System.out.println();
			}
		}
	}

	public void deleteQueue() {
		if (arr == null) {
			System.out.println("Queue is already deleted..");
		} else {
			System.out.println("Deleting the entire Queue");
			arr = null;
			System.out.println("Queue is successfully deleted..");
		}
	}
}
