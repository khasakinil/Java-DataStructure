package single.circularLinkedList;

public class SingleCircularLinkedListMain {

	public static void main(String... args) {
		SingleCircularLinkedList list = new SingleCircularLinkedList();
		list.createSingleCircularLinkedList(3);
		
		list.traverseSingleCircularLinkedList();
		list.insertInLinkedList(12, 0);
		list.traverseSingleCircularLinkedList();
		list.insertInLinkedList(13, 1);
		list.insertInLinkedList(16, 6);
		list.insertInLinkedList(10, 0);
		list.traverseSingleCircularLinkedList();
		
		list.printHeadUsingTail();
		list.searchNode(13);
		list.searchNode(78);
		
		System.out.println("Deleting the node from the beginning..");
		System.out.println("Before Deletion..");
		list.traverseSingleCircularLinkedList();
		list.deletionOfNode(0);
		System.out.println("After Deletion..");
		list.traverseSingleCircularLinkedList();
		
		System.out.println("Deleting the node from the end");
		System.out.println("Before Deletion..");
		list.traverseSingleCircularLinkedList();
		list.deletionOfNode(20);
		System.out.println("After Deletion..");
		list.traverseSingleCircularLinkedList();
		
		System.out.println("Deleting the node in-between");
		System.out.println("Before Deletion..");
		list.traverseSingleCircularLinkedList();
		list.deletionOfNode(1);
		System.out.println("After Deletion..");
		list.traverseSingleCircularLinkedList();
	
		list.deleteLinkedList();
		list.traverseSingleCircularLinkedList();
	}
}
