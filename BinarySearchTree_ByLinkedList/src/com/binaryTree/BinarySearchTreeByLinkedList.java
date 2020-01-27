package com.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

import com.node.BinaryNode;

public class BinarySearchTreeByLinkedList {

	BinaryNode root;

	public BinaryNode getRoot() {
		return root;
	}

	// creating Constructor
	public BinarySearchTreeByLinkedList() {
		root = null;
	}

	// Inserting values in BST
	public void insert(int nodeValue) {
		root = insert(root, nodeValue);
	}

	// Inserting values in BST
	private BinaryNode insert(BinaryNode currentNode, int nodeValue) {
		if (currentNode == null) {
			System.out.println("successfully inserted value " + nodeValue + " in BST");
			return createNewNode(nodeValue);
		} else if (nodeValue <= currentNode.getValue()) {
			currentNode.setLeft(insert(currentNode.getLeft(), nodeValue));
			return currentNode;
		} else {
			currentNode.setRight(insert(currentNode.getRight(), nodeValue));
			return currentNode;
		}
	}

	// creating new blank node
	private BinaryNode createNewNode(int nodeValue) {
		BinaryNode node = new BinaryNode();
		node.setValue(nodeValue);
		return node;
	}

	// Displaying tree in level order traversal
	public void printTreeGraphically() {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		Queue<Integer> level = new LinkedList<Integer>();

		int currentLevel = 1;
		boolean previousLevelWasAllNull = false;
		queue.add(root);
		level.add(1);

		System.out.println("\nLevel Order Traversal..");
		if (root == null) {
			System.out.println("Tree does not exists..");
			return;
		}

		while (!queue.isEmpty()) {
			if (currentLevel == level.peek()) {
				if (queue.peek() == null) {
					queue.add(null);
					level.add(currentLevel + 1);
				} else {
					queue.add(queue.peek().getLeft());
					level.add(currentLevel + 1);
					queue.add(queue.peek().getRight());
					level.add(currentLevel + 1);
					previousLevelWasAllNull = false;
				}
				System.out.print(queue.remove() + " ");
				level.remove();
			} else {
				System.out.println("\n");
				currentLevel++;
				if (previousLevelWasAllNull == true) {
					break;
				}
				previousLevelWasAllNull = true;
			}
		}

	}

	// searching value in BTree
	public void searchNodeValue(int valueToSearch) {
		searchNodeValue(root, valueToSearch);
	}

	// searching value in BTree
	private BinaryNode searchNodeValue(BinaryNode node, int valueToSearch) {
		if (isTreeExists(node)) {
			if (node.getValue() == valueToSearch) {
				System.out.println("value : " + valueToSearch + " found in BST");
				return node;
			} else if (valueToSearch < node.getValue()) {
				return searchNodeValue(node.getLeft(), valueToSearch);
			} else {
				return searchNodeValue(node.getRight(), valueToSearch);
			}
		} else {
			System.out.println("value : " + valueToSearch + " not found in BST");
			return null;
		}
	}

	// checking for tree existence
	private boolean isTreeExists(BinaryNode node) {
		return node != null;
	}

	// deleting node from BST
	public void deleteNodeOfBST(int valueToDelete) {
		deleteNodeOfBST(root, valueToDelete);
	}

	// deleting node from BST
	private BinaryNode deleteNodeOfBST(BinaryNode node, int valueToDelete) {
		if (isTreeExists(node)) {
			if (valueToDelete < node.getValue()) {
				root.setLeft(deleteNodeOfBST(node.getLeft(), valueToDelete));
			} else if (valueToDelete > node.getValue()) {
				root.setRight(deleteNodeOfBST(node.getRight(), valueToDelete));
			} else {
				if (node.getLeft() != null && node.getRight() != null) {
					BinaryNode tempNode = node;
					BinaryNode minNodeSuccessor = minimumSuccessor(tempNode.getRight());
					node.setValue(minNodeSuccessor.getValue());
					node.setRight(deleteNodeOfBST(node.getRight(), minNodeSuccessor.getValue()));
				} else if (node.getLeft() != null) {
					node = node.getLeft();
				} else if (node.getRight() != null) {
					node = node.getRight();
				} else {
					node = null;
				}
			}
		} else {
			System.out.println("value : " + valueToDelete + " not found in BST");
			return null;
		}
		return node;
	}

	// find minimum successor of deleting node
	private BinaryNode minimumSuccessor(BinaryNode rightNode) {
		if (rightNode.getLeft() == null) {
			return rightNode;
		} else {
			minimumSuccessor(rightNode.getLeft());
		}

		return null;
	}

	public void deleteEntireTree() {
		if (isTreeExists(root)) {
			System.out.println("Deleting the BTree..");
			root = null;
			System.out.println("Deleted the BTree Successfully");
		}
	}
}
