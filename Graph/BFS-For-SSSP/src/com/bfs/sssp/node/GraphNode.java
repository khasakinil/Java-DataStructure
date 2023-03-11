package com.bfs.sssp.node;

import java.util.ArrayList;

public class GraphNode {
	private int index;
	private String name;
	private ArrayList<GraphNode> neighbours = new ArrayList<>();
	private boolean isVisited = false;
	private GraphNode parent;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<GraphNode> getNeighbours() {
		return neighbours;
	}

	public void setNeighbours(ArrayList<GraphNode> neighbours) {
		this.neighbours = neighbours;
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

	public GraphNode(String name) {
		super();
		this.name = name;
	}

	public GraphNode(int index, String name) {
		super();
		this.index = index;
		this.name = name;
	}

}
