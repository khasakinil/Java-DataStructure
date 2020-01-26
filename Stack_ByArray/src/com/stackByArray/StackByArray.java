package com.stackByArray;

public class StackByArray {
	int arr[];
	int topOfStack;

	// constructor to initialize the stack
	public StackByArray(int size) {
		this.arr = new int[size];
		topOfStack = -1;
	}

	// pushing value into stack
	public void push(int value) {
		if (isStackFull()) {
			System.out.println("Stack overflow error...!");
		} else {
			arr[++topOfStack] = value;
			//topOfStack++;
			System.out.println("Successfully inserted value " + value + " into stack");
		}
	}

	// check whether stack is full
	private boolean isStackFull() {
		if (topOfStack == arr.length - 1) {
			System.out.println("Stack is full");
			return true;
		}
		return false;
	}

	// poping value from stack
	public void pop() {
		if (isStackEmpty()) {
			System.out.println("Stack underflow error...!!");
		}else {
			System.out.println("Poping value from stack.. " + arr[topOfStack--]);
			//topOfStack--;
		}
		
	}

	// Check whether stack is empty
	private boolean isStackEmpty() {
		return topOfStack == -1;
	}

	public void peekOperation() {
		if(!isStackEmpty()) {
			System.out.println("Top of stack.. " + arr[topOfStack]);
		}else {
			System.out.println("The stack is empty");
		}
		System.out.println();
	}

}
