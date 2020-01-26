package com.singleDimension;

public class SingleDimensionArray {

	int arr[]=null;
	
	//Constructor
	public SingleDimensionArray(int sizeOfArray) {
		arr = new int[sizeOfArray];
		for(int i=0;i<sizeOfArray;i++) {
			arr[i]=Integer.MIN_VALUE;
		}
	}
	
	//Traverse the Array
	public void traverseArray() {
		try {
			System.out.println("Printing the Array..");
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
			}
			
		}catch(Exception e) {
			System.out.println("Array no longer exists..");
		}
	}
	
	//Insert value into Array
	public void insert(int location, int valueToBeInserted) {
		try {
			if(arr[location] == Integer.MIN_VALUE) {
				arr[location] = valueToBeInserted;
				System.out.println("Successfully inserted value " + valueToBeInserted +" at location " + location);
			}
			else {
				System.out.println("Cell number : " + location + " already occupied some value");
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index to insert element into an array");
		}
	}
	
	//Access a particular cell of an array
	public void accessCellValue(int location) {
		try {
			System.out.println(arr[location]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index to access an array");
		}
	}
	
	//Search for value in the given array
	public void searchInAnArray(int valueToSearch) {
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==valueToSearch) {
				System.out.println("Value " + valueToSearch + " found at location " + i);
				return;
			}
		}
		System.out.println(valueToSearch +" is not found in the array..");
	}
	
	//Delete value from the given array
	public void deleteValueFromArray(int location) {
		try {
			arr[location] = Integer.MIN_VALUE;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid cell Index to remove the element from array..");
		}
	}
}
