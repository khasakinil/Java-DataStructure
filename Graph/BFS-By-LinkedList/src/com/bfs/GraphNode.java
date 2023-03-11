package com.bfs;

import java.util.ArrayList;

public class GraphNode {
	private String name;
	private int index;
	private ArrayList<GraphNode> neighborNodes = new ArrayList<GraphNode>();
	private boolean isVisited = false;
	private GraphNode parent;

	public GraphNode(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public ArrayList<GraphNode> getNeighborNodes() {
		return neighborNodes;
	}

	public void setNeighborNodes(ArrayList<GraphNode> neighborNodes) {
		this.neighborNodes = neighborNodes;
	}

	public boolean isVisited() {
		return isVisited;
	}

	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}

	public GraphNode getParent() {
		return parent;
	}

	public void setParent(GraphNode parent) {
		this.parent = parent;
	}

	@Override
	public String toString() {
		return "GraphNode [name=" + name + "]";
	}

}
