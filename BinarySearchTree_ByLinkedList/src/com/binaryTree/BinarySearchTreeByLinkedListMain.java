package com.binaryTree;

public class BinarySearchTreeByLinkedListMain {
	public static void main(String[] args) {
		BinarySearchTreeByLinkedList bsTree = new BinarySearchTreeByLinkedList();

		System.out.println("\nInserting the Values..");
		bsTree.insert(100);
		bsTree.insert(80);
		bsTree.insert(70);
		bsTree.insert(90);
		bsTree.insert(50);

		System.out.println("\nPrinting Tree Graphically");
		bsTree.printTreeGraphically();

		System.out.println("\nSeaching a value in BST");
		bsTree.searchNodeValue(23);
		bsTree.searchNodeValue(90);
		bsTree.printTreeGraphically();

		System.out.println("Deleting node from BST");
		bsTree.deleteNodeOfBST(80);
		bsTree.printTreeGraphically();

		System.out.println("Delete Entire BST");
		bsTree.deleteEntireTree();
		
		bsTree.printTreeGraphically();
	}
}
