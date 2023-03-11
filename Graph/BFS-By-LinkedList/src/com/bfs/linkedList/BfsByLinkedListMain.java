package com.bfs.linkedList;

import java.util.ArrayList;

import com.bfs.GraphNode;

public class BfsByLinkedListMain {

	public static void main(String[] args) {
		ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();

		for (int i = 1; i < 11; i++) {
			nodeList.add(new GraphNode("V" + i));
		}

		BfsByLinkedList bbllGrapgh = new BfsByLinkedList(nodeList);

		bbllGrapgh.addUndirectedEdge(1, 2);
		bbllGrapgh.addUndirectedEdge(1, 4);
		bbllGrapgh.addUndirectedEdge(2, 3);
		bbllGrapgh.addUndirectedEdge(2, 5);
		bbllGrapgh.addUndirectedEdge(3, 6);
		bbllGrapgh.addUndirectedEdge(3, 10);
		bbllGrapgh.addUndirectedEdge(4, 7);
		bbllGrapgh.addUndirectedEdge(5, 8);
		bbllGrapgh.addUndirectedEdge(6, 9);
		bbllGrapgh.addUndirectedEdge(7, 8);
		bbllGrapgh.addUndirectedEdge(8, 9);
		bbllGrapgh.addUndirectedEdge(9, 10);

		System.out.println("BFS by Linked List from Source : V1 ");
		bbllGrapgh.bfs();
	}

}
