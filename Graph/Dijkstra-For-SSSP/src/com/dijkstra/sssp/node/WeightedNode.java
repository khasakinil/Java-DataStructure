package com.dijkstra.sssp.node;

import java.util.ArrayList;
import java.util.HashMap;

public class WeightedNode implements Comparable<WeightedNode> {
	private int index;
	private String name;
	private boolean isVisited = false;
	private WeightedNode parent;
	private ArrayList<WeightedNode> neighbours = new ArrayList<>();
	private int distance;
	private HashMap<WeightedNode, Integer> weightMap = new HashMap<>();

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

	public boolean isVisited() {
		return isVisited;
	}

	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}

	public WeightedNode getParent() {
		return parent;
	}

	public void setParent(WeightedNode parent) {
		this.parent = parent;
	}

	public ArrayList<WeightedNode> getNeighbours() {
		return neighbours;
	}

	public void setNeighbours(ArrayList<WeightedNode> neighbours) {
		this.neighbours = neighbours;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public HashMap<WeightedNode, Integer> getWeightMap() {
		return weightMap;
	}

	public void setWeightMap(HashMap<WeightedNode, Integer> weightMap) {
		this.weightMap = weightMap;
	}

	@Override
	public String toString() {
		return "WeightedNode [name=" + name + "]";
	}

	public WeightedNode(String name) {
		super();
		this.name = name;
		distance = Integer.MAX_VALUE;
	}

	@Override
	public int compareTo(WeightedNode o) {
		return this.distance - o.distance;
	}

}
