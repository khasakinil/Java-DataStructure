package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

import node.binaryNode.BinaryNode;

public class BinaryTreeByLinkedList {

	BinaryNode root;

	// creating blank binary tree by constructor
	public BinaryTreeByLinkedList() {
		this.root = null;
	}

	// inserting new node at deepest place
	public void insert(int nodeValue) {
		System.out.println("Inserting : " + nodeValue);
		BinaryNode node = new BinaryNode();
		node.setValue(nodeValue);
		if (root == null) {
			root = node;
			System.out.println("Successfully inserted new node at root..");
			return;
		}
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			BinaryNode presentNode = queue.remove();
			if (presentNode.getLeft() == null) {
				presentNode.setLeft(node);
				break;
			} else if (presentNode.getRight() == null) {
				presentNode.setRight(node);
				break;
			} else {
				queue.add(presentNode.getLeft());
				queue.add(presentNode.getRight());
			}
		}
	}

	// Level-Order Traversal of B-Tree
	public void levelOrderTraversal() {
		if (existsTree()) {
			Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
			queue.add(root);
			while (!queue.isEmpty()) {
				BinaryNode presentNode = queue.remove();
				System.out.print(presentNode.getValue() + " ");
				if (presentNode.getLeft() != null) {
					queue.add(presentNode.getLeft());
				}
				if (presentNode.getRight() != null) {
					queue.add(presentNode.getRight());
				}
			}
		} else {
			System.out.println("Tree Does not Exists..");
		}
	}

	// check existence of node
	private boolean existsTree() {
		return root != null;
	}

	// Pre-Order Traversal
	public void preOrderTraversal(BinaryNode node) {
		if (node == null) {
			return;
		}
		System.out.print(node.getValue() + " ");
		preOrderTraversal(node.getLeft());
		preOrderTraversal(node.getRight());
	}

	// Post-Order Traversal
	public void postOrderTraversal(BinaryNode node) {
		if (node == null) {
			return;
		}
		postOrderTraversal(node.getLeft());
		postOrderTraversal(node.getRight());
		System.out.print(node.getValue() + " ");
	}

	// In-Order Traversal
	public void inOrderTraversal(BinaryNode node) {
		if (node == null) {
			return;
		}
		inOrderTraversal(node.getLeft());
		System.out.print(node.getValue() + " ");
		inOrderTraversal(node.getRight());
	}

	// search for given value in Tree
	public void search(int nodeToSearch) {
		if (existsTree()) {
			Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
			queue.add(root);
			while (!queue.isEmpty()) {
				BinaryNode presentNode = queue.remove();
				if (presentNode.getValue() == nodeToSearch) {
					System.out.println("Value " + nodeToSearch + " found in tree");
					return;
				} else {
					if (presentNode.getLeft() != null) {
						queue.add(presentNode.getLeft());
					}
					if (presentNode.getRight() != null) {
						queue.add(presentNode.getRight());
					}
				}
			}
			System.out.println("value : " + nodeToSearch + " not found in the tree..");
		}
	}

	// delete the node from B-Tree
	public void deleteNodeFromBTree(int nodeValue) {
		if (existsTree()) {
			System.out.println("\nDeleting node from B-Tree : " + nodeValue);
			Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
			queue.add(root);
			while (!queue.isEmpty()) {
				BinaryNode presentNode = queue.remove();
				if (presentNode.getValue() == nodeValue) {
					presentNode.setValue(getDeepestNode().getValue());
					deleteDeepesetNode();
					return;
				} else {
					if (presentNode.getLeft() != null) {
						queue.add(presentNode.getLeft());
					}
					if (presentNode.getRight() != null) {
						queue.add(presentNode.getRight());
					}
				}
			}
			System.out.println("Node doesn't exists in the Tree");
		} else {
			System.out.println("Tree does not exists..");
		}
	}

	// delete the deepest node in the tree
	private void deleteDeepesetNode() {
		if (existsTree()) {
			Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
			queue.add(root);
			BinaryNode previousNode, presentNode = null;
			while (!queue.isEmpty()) {
				previousNode = presentNode;
				presentNode = queue.remove();
				if (presentNode.getLeft() == null) {
					previousNode.setRight(null);
					return;
				} else if (presentNode.getRight() == null) {
					presentNode.setLeft(null);
					return;
				}
				queue.add(presentNode.getLeft());
				queue.add(presentNode.getRight());
			}
		} else {
			System.out.println("Tree Doesn't Exists..");
		}
	}

	// get the deepest node from tree
	private BinaryNode getDeepestNode() {
		if (existsTree()) {
			Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
			queue.add(root);
			BinaryNode presentNode = null;
			while (!queue.isEmpty()) {
				presentNode = queue.remove();
				if (presentNode.getLeft() != null) {
					queue.add(presentNode.getLeft());
				}
				if (presentNode.getRight() != null) {
					queue.add(presentNode.getRight());
				}
			}
			System.out.println("\nReturning Deepest node : " + presentNode.getValue());
			return presentNode;
		}
		return null;
	}

	//deleting the entire tree
	public void deleteTree() {
		if(existsTree()) {
			System.out.println("Deleting the Tree");
			root = null;
			System.out.println("Tree Deleted Successfully");
		}else {
			System.out.println("Tree already deleted..");
		}
	}
}
