package com.ds.bfs.node;

import java.util.ArrayList;

public class GraphNode {
	private String name;
	private int index;
	private ArrayList<GraphNode> neighbours = new ArrayList<GraphNode>();
	private boolean isVisited;
	private GraphNode parent;

	public GraphNode() {
		super();
	}

	public GraphNode(String name, int index) {
		super();
		this.name = name;
		this.index = index;
	}

	public GraphNode(String name, int index, ArrayList<GraphNode> neighbours, boolean isVisited, GraphNode parent) {
		super();
		this.name = name;
		this.index = index;
		this.neighbours = neighbours;
		this.isVisited = isVisited;
		this.parent = parent;
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
		return "GraphNode [name=" + name + ", index=" + index + ", neighbours=" + neighbours + ", isVisited="
				+ isVisited + ", parent=" + parent + "]";
	}

}
