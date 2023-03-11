package com.twoDimension;

public class TwoDimensionArrayMain {

	public static void main(String []args) {
		
		TwoDimensionArray tda = new TwoDimensionArray(4, 4);
		tda.traverseArray();
		
		tda.insertValueInArray(2, 3, 23);
		tda.insertValueInArray(3, 0, 30);
		tda.insertValueInArray(1, 2, 42);
		tda.insertValueInArray(1, 2, 42);
		tda.traverseArray();
		
		tda.accessSingleValue(2, 3);
		tda.accessSingleValue(3, 3);
		tda.accessSingleValue(4, 5);
		
		tda.searchValueInArray(42);
		tda.searchValueInArray(442);
		
		tda.deleteValueFromArray(2, 3);
		tda.deleteValueFromArray(4, 5);
		tda.traverseArray();
		
		tda.deleteThisArray();
		tda.traverseArray();
	}
}
