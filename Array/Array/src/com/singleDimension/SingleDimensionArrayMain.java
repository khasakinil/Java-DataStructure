package com.singleDimension;

public class SingleDimensionArrayMain {
	
	public static void main(String []args) {
		System.out.println("Creating blank array of size 10");
		SingleDimensionArray sda = new SingleDimensionArray(10);
		sda.traverseArray();
		sda.insert(0, 11);
		sda.insert(1, 12);
		sda.insert(2, 13);
		sda.insert(3, 14);
		sda.insert(4, 15);
		sda.insert(5, 16);
		sda.insert(6, 17);
		sda.insert(7, 18);
		sda.insert(8, 19);
		sda.insert(9, 20);
		sda.insert(0, 20);
		sda.insert(23, 20);
		sda.accessCellValue(2);
		sda.accessCellValue(56);
		sda.searchInAnArray(16);
		sda.searchInAnArray(164);
		sda.deleteValueFromArray(5);
		sda.traverseArray();
		sda.insert(5, 55);
		sda.traverseArray();
		sda.deleteValueFromArray(12);
		
	}
}
