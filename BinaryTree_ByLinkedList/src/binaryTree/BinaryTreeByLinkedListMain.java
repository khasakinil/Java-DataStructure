package binaryTree;

public class BinaryTreeByLinkedListMain {
	public static void main(String[] args) {

		// creating blank tree
		BinaryTreeByLinkedList bTree = new BinaryTreeByLinkedList();

		System.out.println("Inserting Nodes into B-Tree");
		for (int i = 1; i < 7; i++) {
			bTree.insert(i * 4);
		}

		// Level-Order of Tree
		System.out.println("\nLevel-Order of Tree");
		bTree.levelOrderTraversal();

		// Pre-Order of Tree
		System.out.println("\nPre-Order of Tree");
		bTree.preOrderTraversal(bTree.root);

		// In-Order of Tree
		System.out.println("\nIn-Order of Tree");
		bTree.inOrderTraversal(bTree.root);

		// Post-Order of Tree
		System.out.println("\nPost-Order of Tree");
		bTree.postOrderTraversal(bTree.root);

		// Serching node
		System.out.println("\nSearching node in a B-Tree");
		bTree.search(12);
		bTree.search(13);

		// deleting the element from B-Tree
		bTree.deleteNodeFromBTree(12);
		// Level-Order of Tree
		System.out.println("\nLevel-Order of Tree");
		bTree.levelOrderTraversal();

		// deleting the element from B-Tree
		bTree.deleteNodeFromBTree(8);
		// Level-Order of Tree
		System.out.println("\nLevel-Order of Tree");
		bTree.levelOrderTraversal();

		// deleting the element from B-Tree
		bTree.deleteNodeFromBTree(81);
		
		//delete entire Tree
		bTree.deleteTree();
	}
}
