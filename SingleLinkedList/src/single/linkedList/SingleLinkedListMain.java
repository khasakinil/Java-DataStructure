package single.linkedList;

public class SingleLinkedListMain {

	public static void main(String []args) {
		
		SingleLinkedList list = new SingleLinkedList();
		list.createSingleLinkedList(34);
		list.traverseLinkedList();
		
		list.insertInLinkedList(45, 3);
		list.insertInLinkedList(23, 1);
		list.traverseLinkedList();
		
		list.insertInLinkedList(67, 0);
		list.insertInLinkedList(68, 1);
		list.traverseLinkedList();
		
		System.out.println("Searching for node in the linked list..");
		list.searchNode(45);
		list.searchNode(32);
		
		System.out.println("Deleting the node from the linked list...");
		System.out.println("Before deleting the node.");
		list.traverseLinkedList();
		list.deteteNode(0);
		System.out.println("After deleting the node..");
		list.traverseLinkedList();
		
		System.out.println("Deleting the last node");
		System.out.println("Before deleting the node.");
		list.traverseLinkedList();
		list.deteteNode(30);
		System.out.println("After deleting the node..");
		list.traverseLinkedList();
		
		System.out.println("Deleting the Middle node");
		System.out.println("Before deleting the node.");
		list.traverseLinkedList();
		list.deteteNode(1);
		System.out.println("After deleting the node..");
		list.traverseLinkedList();
		
		list.deleteLinkedList();
		list.traverseLinkedList();
	}
}
