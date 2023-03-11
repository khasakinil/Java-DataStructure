package com.bfs.sssp;

import java.util.ArrayList;

import com.bfs.sssp.node.GraphNode;

public class BfsForSsspMain {

	public static void main(String args[]) {
		ArrayList<GraphNode> nodeList = new ArrayList<>();

		for (int i = 1; i < 11; i++) {
			nodeList.add(new GraphNode("V" + (i - 1)));
		}

		BfsForSSSP graphSssp = new BfsForSSSP(nodeList);

		graphSssp.addUndirectedEdge(0,8);
		graphSssp.addUndirectedEdge(8,2);
		graphSssp.addUndirectedEdge(8,9);
		graphSssp.addUndirectedEdge(2,1);
		graphSssp.addUndirectedEdge(9,1);
		graphSssp.addUndirectedEdge(2,4);
		graphSssp.addUndirectedEdge(1,3);
		graphSssp.addUndirectedEdge(1,7);
		graphSssp.addUndirectedEdge(3,4);
		graphSssp.addUndirectedEdge(3,5);
		graphSssp.addUndirectedEdge(7,6);
		graphSssp.addUndirectedEdge(5,6);
		
		System.out.println("Single Source Shortest Path using BFS from source 2");
		
		graphSssp.bfsForSssp(nodeList.get(2));
		
		
	}

}
