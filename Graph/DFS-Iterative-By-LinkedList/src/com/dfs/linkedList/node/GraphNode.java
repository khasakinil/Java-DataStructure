package com.dfs.linkedList.node;

import java.util.ArrayList;

public class GraphNode {
	private int index;
	private String name;
	private ArrayList<GraphNode> neighbors = new ArrayList<>();
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

	public ArrayList<GraphNode> getNeighbors() {
		return neighbors;
	}

	public void setNeighbors(ArrayList<GraphNode> neighbors) {
		this.neighbors = neighbors;
	}

	public boolean isVisted() {
		return isVisited;
	}

	public void setVisted(boolean isVisted) {
		this.isVisited = isVisted;
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

}
