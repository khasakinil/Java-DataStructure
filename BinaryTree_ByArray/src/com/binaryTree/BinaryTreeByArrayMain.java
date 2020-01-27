package com.binaryTree;

public class BinaryTreeByArrayMain {
	public static void main(String[] args) {
		System.out.println("Creating blank Binary Tree..");
		// creating blank array
		BinaryTreeByArray bTree = new BinaryTreeByArray(7);

		// inserting values into B-Tree
		System.out.println("Inseting values into B-Tree");
		for (int i = 1; i <= 7; i++) {
			bTree.insert(i * 2);
		}
		
		//Level Order Traversal
		bTree.levelOrderTraversal();
		
		//Pre-Order Traversal
		System.out.println("\nPre-Order Traversal");
		bTree.preOrderTraversal(1);
		
		//Post-Order Traversal
		System.out.println("\nPost-Order Traversal");
		bTree.postOrderTraversal(1);

		//In-Order Traversal
		System.out.println("\nIn-Order Traversal");
		bTree.inOrderTraversal(1);

		//searching for values in B-Tree
		System.out.println("\nSearching value in B-Tree");
		bTree.search(3);
		bTree.search(10);
		
		//deleting value from B-Tree
		bTree.delete(4);
		
		bTree.levelOrderTraversal();
		
		//deleting value from B-Tree
		bTree.delete(46);
		
		//Delete B-Tree
		bTree.deleteBTree();
		bTree.postOrderTraversal(1);
	}
}
