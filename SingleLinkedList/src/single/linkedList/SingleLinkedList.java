package single.linkedList;
import node.singleNode.SingleNode;

public class SingleLinkedList {

	private SingleNode head, tail;
	private int size;
	
	public SingleNode getHead() {
		return head;
	}
	
	public void setHead(SingleNode head) {
		this.head = head;
	}
	
	public SingleNode getTail() {
		return tail;
	}
	
	public void setTail(SingleNode tail) {
		this.tail = tail;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	//create Single Node
	public SingleNode createSingleLinkedList(int value) {
		SingleNode node = new SingleNode();
		node.setValue(value);
		node.setNext(null);
		head = node;
		tail=node;
		size = 1;
		return head;
	}
	
	//traverse Single Linked list
	public void traverseLinkedList() {
		if(existsLinkedList()) {
			SingleNode tempNode = head;
			for(int i=0 ;i<size; i++) {
				System.out.print(tempNode.getValue());
				if(i != size-1) {
					System.out.print(" -> ");
				}
				tempNode = tempNode.getNext();
			}
			System.out.println();
		}else {
			System.out.println("Linked List does not exists.. :)");
		}
	}

	//checking existence of linked list
	private boolean existsLinkedList() {
		return head!=null;
	}
	
	//insert node in Single Linked list.
	public void insertInLinkedList(int nodeValue, int location) {
		SingleNode node = new SingleNode();
		node.setValue(nodeValue);
		if(!existsLinkedList()) {
			System.out.println("Linked List does not exists..");
			return;
		}else if(location == 0) {
			//insert node at 0 location
			node.setNext(head);
			head = node;
		}else if(location >= size) {
			//insert node at last position
			node.setNext(null);
			tail.setNext(node);
			tail = node;
		}else {
			//insert node at specified location 
			SingleNode tempNode = head;
			for(int i=0; i<location-1; i++) {
				tempNode = tempNode.getNext();
			}
			SingleNode nextNode = tempNode.getNext();
			tempNode.setNext(node);
			node.setNext(nextNode);
		}
		setSize(getSize() + 1);
	}
	
	//searching for the node in the list..
	public void searchNode(int nodeValue) {
		if(existsLinkedList()) {
//			while(head != null) {
//				if(head.getValue()==nodeValue) {
//					System.out.println("Node is found in the linked list..");
//					return;
//				}
//				head = head.getNext();
//			}
//			System.out.println("Node does not exists in the linked list..");
			SingleNode tempNode = head;
			for(int i=0; i<size; i++) {
				if(tempNode.getValue() == nodeValue) {
					System.out.println("Node is found at location : " + i);
					return;
				}
				tempNode = tempNode.getNext();
			}
			System.out.println("Node does not exists in the list..");
		}else {
			System.out.println("Linked list does not exists..");
		}
	}

	public void deteteNode(int location) {
		if(!existsLinkedList()) {
			System.out.println("Linked list does not exists..");
		}else {
			if(location == 0) {
				//delete the first node
				head = head.getNext();
				setSize(getSize()-1);
				if(getSize() == 0) {
					tail = null;
				}
			}else if(location >= size) {
				//delete the last node
				SingleNode tempNode = head;
				for(int i = 0; i<size-1; i++) {
					tempNode = tempNode.getNext();
				}
				if(tempNode == head) {
					head = tail = null;
					setSize(getSize() - 1);
					return;
				}
					
				tempNode.setNext(null);
				tail = tempNode;
				setSize(getSize() - 1);
			}else {
				//delete the node from the specified location
				SingleNode tempNode = head;
				for(int i = 0; i<location-1; i++) {
					tempNode = tempNode.getNext();
				}
				tempNode.setNext(tempNode.getNext().getNext());
				setSize(getSize() - 1);
			}
		}
	}
	
	//delete the entire linked list..
	public void deleteLinkedList() {
		System.out.println("Deleting the linked list..");
		head = null;
		tail = null;
		System.out.println("Linked list deleted successfully..");
	}
}


