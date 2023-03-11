package com.dfs.linkedList;

import java.util.ArrayList;

import com.dfs.linkedList.node.GraphNode;

public class DfsRecursiveByLinkedListMain {

	public static void main(String[] args) {
		ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();

		for (int i = 1; i < 11; i++) {
			nodeList.add(new GraphNode("V" + i));
		}

		DfsRecursiveByLinkedList dfsGraph = new DfsRecursiveByLinkedList(nodeList);

		dfsGraph.addUndirectedEdge(1, 2);
		dfsGraph.addUndirectedEdge(1, 4);
		dfsGraph.addUndirectedEdge(2, 3);
		dfsGraph.addUndirectedEdge(2, 5);
		dfsGraph.addUndirectedEdge(3, 6);
		dfsGraph.addUndirectedEdge(3, 10);
		dfsGraph.addUndirectedEdge(4, 7);
		dfsGraph.addUndirectedEdge(5, 8);
		dfsGraph.addUndirectedEdge(6, 9);
		dfsGraph.addUndirectedEdge(7, 8);
		dfsGraph.addUndirectedEdge(8, 9);
		dfsGraph.addUndirectedEdge(9, 10);

		System.out.println("DFS using recursion from Vertex V1 : ");

		dfsGraph.dfsRecursion();

	}

}
