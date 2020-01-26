package doubly.linkedList;

public class DoubleLinkedListMain {
	public static void main(String args[]) {
		DoubleLinkedList list = new DoubleLinkedList();
		list.createDoubleLinkedList(23);
		list.traverseDoubleLinkedList();
		
		list.insertInLinkedList(34, 0);
		list.traverseDoubleLinkedList();
		list.insertInLinkedList(35, 10);
		list.traverseDoubleLinkedList();
		list.insertInLinkedList(36, 1);
		list.traverseDoubleLinkedList();
		list.insertInLinkedList(37, 2);
		list.traverseDoubleLinkedList();
		list.insertInLinkedList(38, 3);
		list.traverseDoubleLinkedList();
		list.insertInLinkedList(15, 0);
		list.traverseDoubleLinkedList();
		
		System.out.println("Searching for Node");
		list.searchNode(14);
		list.searchNode(38);
		
		System.out.println("Traversing linked list in normal way..");
		list.traverseDoubleLinkedList();
		System.out.println("Traversing linked list in reverse Order..");
		list.traverseInReverseOrder();
		
		System.out.println("Deletion of Node at specified location:");
		System.out.println("Before deleting the node");
		list.traverseDoubleLinkedList();
		list.deletionOfNode(3);
		System.out.println("After deleting the node");
		list.traverseDoubleLinkedList();
		
		System.out.println("Deletion of Node at 0th location:");
		System.out.println("Before deleting the node");
		list.traverseDoubleLinkedList();
		list.deletionOfNode(0);
		System.out.println("After deleting the node");
		list.traverseDoubleLinkedList();
		
		System.out.println("Deletion of Node at last location:");
		System.out.println("Before deleting the node");
		list.traverseDoubleLinkedList();
		list.deletionOfNode(30);
		System.out.println("After deleting the node");
		list.traverseDoubleLinkedList();
		
		System.out.println("Deleting the entire linked list");
		list.deleteLinkedList();
		list.traverseDoubleLinkedList();
		list.deleteLinkedList();
	}
}
