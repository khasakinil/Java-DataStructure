package doubly.linkedList;

public class CircularDoubleLinkedListMain {
	public static void main(String[] args) {
		CircularDoubleLinkedList list = new CircularDoubleLinkedList();
		list.createCircularLinkedList(23);
		list.traverseCircularDoubleLinkedList();
		
		list.insertInCircularDoubleLinkedList(11, 0);
		list.traverseCircularDoubleLinkedList();
		list.insertInCircularDoubleLinkedList(99, 10);
		list.traverseCircularDoubleLinkedList();
		list.insertInCircularDoubleLinkedList(22, 1);
		list.traverseCircularDoubleLinkedList();
		list.insertInCircularDoubleLinkedList(33, 2);
		list.traverseCircularDoubleLinkedList();
		list.insertInCircularDoubleLinkedList(44, 3);
		list.traverseCircularDoubleLinkedList();
		list.insertInCircularDoubleLinkedList(55, 4);
		list.traverseCircularDoubleLinkedList();
		list.insertInCircularDoubleLinkedList(66, 5);
		list.traverseCircularDoubleLinkedList();
		list.insertInCircularDoubleLinkedList(77, 6);
		list.traverseCircularDoubleLinkedList();
		list.insertInCircularDoubleLinkedList(78, 7);
		list.traverseCircularDoubleLinkedList();
		list.insertInCircularDoubleLinkedList(88, 8);
		list.traverseCircularDoubleLinkedList();
		
		list.printHeadUsingTail();
		list.searchNode(44);
		list.searchNode(11);
		list.searchNode(34);
		
		System.out.println("Deletion of node from beginning");
		System.out.println("Before Deletion");
		list.traverseCircularDoubleLinkedList();
		list.deletionOfNode(0);
		System.out.println("After Deletion");
		list.traverseCircularDoubleLinkedList();
		
		System.out.println("Deletion of node from end");
		System.out.println("Before Deletion");
		list.traverseCircularDoubleLinkedList();
		list.deletionOfNode(20);
		System.out.println("After Deletion");
		list.traverseCircularDoubleLinkedList();
		
		System.out.println("Deletion of node in between");
		System.out.println("Before Deletion");
		list.traverseCircularDoubleLinkedList();
		list.deletionOfNode(2);
		System.out.println("After Deletion");
		list.traverseCircularDoubleLinkedList();
		
		list.deleteLinkedList();
		list.traverseCircularDoubleLinkedList();
		list.deleteLinkedList();
	}
}
