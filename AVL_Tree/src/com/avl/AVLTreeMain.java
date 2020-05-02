package com.avl;

public class AVLTreeMain {
	public static void main(String[] args) {
		AVLTree at = new AVLTree();
		System.out.println("Insert Node in the Tree..");
		at.insert(30);
		at.insert(5);
		at.insert(3);
		at.insert(4);
		at.insert(50);
		at.insert(65);
		at.insert(1);
		
		at.levelOrderTraversal();
		at.printTreeGraphically();
		
		at.deleteNodeOfBST(5);
		at.printTreeGraphically();
		
		at.insert(2);
		at.printTreeGraphically();
		
		at.deleteNodeOfBST(4);//LR Condition
		at.printTreeGraphically();
		
		at.insert(20);
		at.deleteNodeOfBST(65);//RR Condition
		at.printTreeGraphically();
		
		at.insert(40);
		at.deleteNodeOfBST(20);//RL Condition
		at.printTreeGraphically();
	}
}
