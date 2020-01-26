package com.stack;

public class StackByLinkedListMain {
	public static void main(String []args) {
		StackByLinkedList stack = new StackByLinkedList();
		
		System.out.println("Pushing 15 values into stack..");
		for(int i=1; i<=15; i++) {
			stack.push(i*5);
		}
		
		System.out.println("Peeking value..");
		System.out.println(stack.peek());
		
		System.out.println("Poping values from stack..");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println("Peeking value..");
		System.out.println(stack.peek());
		
		System.out.println("Poping values..");
		for(int i=1; i<=15; i++) {
			System.out.println(stack.pop());
		}
	}
}
