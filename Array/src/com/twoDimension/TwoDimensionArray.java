package com.twoDimension;

public class TwoDimensionArray {

	int arr[][]=null;
	
	//Constructor
	public TwoDimensionArray(int numOfRows, int numOfCOlumns) {

		this.arr = new int[numOfRows][numOfCOlumns];
		for(int row=0; row<numOfRows;row++) {
			for(int col=0;col<numOfCOlumns;col++) {
				arr[row][col] = Integer.MIN_VALUE;
			}
		}
		
	}
	
	//Traverse Array
	public void traverseArray() {
		try {
			for(int row=0;row<arr.length;row++) {
				for(int col=0; col<arr[row].length;col++) {
					System.out.print(arr[row][col] + "   ");
				}
				System.out.println();
			}
		}catch(Exception e) {
			System.out.println("Array does not exist");
		}
	}
	
	//Insert value into array
	public void insertValueInArray(int row, int col, int value) {
		try {
			if(arr[row][col] == Integer.MIN_VALUE) {
				arr[row][col] = value;
				System.out.println("value successfully inserted at row#" + row +", col#"+col);
			}else {
				System.out.println("This Cell row#" + row +", col#"+col+" already occupied some value");
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index to access array");
		}
	}
	
	//Accessing single value from given array
	public void accessSingleValue(int row, int col) {
		try {
			System.out.println("Cell value is : " + arr[row][col]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index to access array");
		}
	}
	
	//Searching single value from array
	public void searchValueInArray(int value) {
		try {
			for(int row=0;row<arr.length;row++) {
				for(int col=0; col<arr[row].length;col++) {
					if(arr[row][col]==value) {
						System.out.println("value found at row#" + row +", col#"+col);
						return;
					}
				}
			}
			System.out.println("value does not exists in the array..");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	//Deleting value from array
	public void deleteValueFromArray(int row,int col) {
		try {
			arr[row][col] = Integer.MIN_VALUE;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index to delete the value from array");
		}
	}
	
	//Deleting entire array
	public void deleteThisArray() {
		try{
			arr=null;
			System.out.println("Array deleted Successfully");
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
