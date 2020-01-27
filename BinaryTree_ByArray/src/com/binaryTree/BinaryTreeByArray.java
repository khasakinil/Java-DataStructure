package com.binaryTree;

public class BinaryTreeByArray {
	int[] arr;
	int lastUsedIndex;

	// constructor to create blank array
	public BinaryTreeByArray(int size) {
		arr = new int[size + 1];
		this.lastUsedIndex = 0;
	}

	// Insert value into B-Tree
	public void insert(int value) {
		if (!isTreeFull()) {
			arr[++lastUsedIndex] = value;
		} else {
			System.out.println("Could not insert value into B-Tree as it is Full..");
		}
	}

	// Checking Tree is full or not
	private boolean isTreeFull() {
		return lastUsedIndex == arr.length - 1;
	}

	// Level-Order Traversal of B-Tree
	public void levelOrderTraversal() {
		if (isBTreeExists()) {
			System.out.println("\nLevel-Order Traversal..");
			for (int i = 1; i <= lastUsedIndex; i++) {
				System.out.print(arr[i] + " ");
			}
		} else {
			System.out.println("B-Tree Doesn't Exists..");
		}
	}

	// Checking Tree existence..
	private boolean isBTreeExists() {
		// TODO Auto-generated method stub
		return arr != null;
	}

	// Pre-Order Traversal
	public void preOrderTraversal(int index) {
		if (isBTreeExists()) {
			if (index > lastUsedIndex) {
				return;
			}
			System.out.print(arr[index] + " ");
			preOrderTraversal(index * 2);
			preOrderTraversal(index * 2 + 1);
		} else {
			System.out.println("B-Tree Doesn't Exists..");
		}
	}

	// Post-Order Traversal
	public void postOrderTraversal(int index) {
		if (isBTreeExists()) {
			if (index > lastUsedIndex) {
				return;
			}
			postOrderTraversal(index * 2);
			postOrderTraversal(index * 2 + 1);
			System.out.print(arr[index] + " ");
		} else {
			System.out.println("B-Tree Doesn't Exists..");
		}
	}

	// In-Order Traversal
	public void inOrderTraversal(int index) {
		if (isBTreeExists()) {
			if (index > lastUsedIndex) {
				return;
			}
			inOrderTraversal(index * 2);
			System.out.print(arr[index] + " ");
			inOrderTraversal(index * 2 + 1);
		} else {
			System.out.println("B-Tree Doesn't Exists..");
		}
	}

	// Search Value in B-Tree
	public int search(int searchValue) {
		if (isBTreeExists()) {
			for (int i = 1; i < lastUsedIndex; i++) {
				if (arr[i] == searchValue) {
					System.out.println("\nsearch value :" + searchValue + " is found in B-Tree");
					return i;
				}
			}
			System.out.println("\nSearch value :" + searchValue + " does not found in the B-Tree");
		} else {
			System.out.println("B-Tree Doesn't Exists..");
		}
		return -1;
	}

	// Delete value from B-Tree
	public void delete(int valueToBeDeleted) {
		if (isBTreeExists()) {
			int location = search(valueToBeDeleted);
			if (location == -1) {
				return;
			} else {
				arr[location] = arr[lastUsedIndex--];
				System.out.println("\nDeleted : " + valueToBeDeleted + " from B-Tree");
			}
		}
	}

	// Deleting B-Tree
	public void deleteBTree() {
		if (isBTreeExists()) {
			System.out.println("Deleting B-Tree");
			arr = null;
			System.out.println("Deleted B-Tree Successfully..");
		}else {
			System.out.println("B-Tree not available..");
		}
	}

}
