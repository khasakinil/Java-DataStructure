package com.sssp.bellmaFord;

import java.util.ArrayList;

import com.sssp.bellmaFord.node.WeightedNode;

public class BellmanFordForSSSPMain {
	public static void main(String args[]) {
		ArrayList<WeightedNode> nodeList = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			nodeList.add(new WeightedNode("" + (char) (65 + i)));
		}

		BellmanFordForSSSP graphBellman = new BellmanFordForSSSP(nodeList);

		graphBellman.addWeightedEdge(1, 3, 6); // Add A-> C , weight 6
		graphBellman.addWeightedEdge(2, 1, 3); // Add B-> A , weight 3
		graphBellman.addWeightedEdge(1, 4, 6); // Add A-> D , weight 6
		// Uncomment below line to test negative cycle
		// graphBellman.addWeightedEdge(1,4,-6); //Add A-> D , weight -6 TEST NEGATIVE
		// WEIGHT HERE
		graphBellman.addWeightedEdge(4, 3, 1); // Add D-> C , weight 1
		graphBellman.addWeightedEdge(3, 4, 2); // Add C-> D , weight 2
		graphBellman.addWeightedEdge(4, 2, 1); // Add D-> B , weight 1
		graphBellman.addWeightedEdge(5, 4, 2); // Add E-> D , weight 2
		graphBellman.addWeightedEdge(5, 2, 4); // Add E-> B , weight 4

		graphBellman.bellmanFord(nodeList.get(4));

	}

}
