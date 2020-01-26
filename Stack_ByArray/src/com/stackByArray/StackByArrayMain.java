package com.stackByArray;

public class StackByArrayMain {
	public static void main(String []args) {
	
		StackByArray stack = new StackByArray(5);
		
		System.out.println("Inserting 6 values into stack..");
		for(int i=1;i<=6;i++) {
			stack.push(i*10);
		}
		
		System.out.println("Peeking value from stack..");
		stack.peekOperation();
		
		stack.pop();
		stack.peekOperation();
		
		for(int i=0;i<5;i++) {
			stack.pop();
		}
	}
}
