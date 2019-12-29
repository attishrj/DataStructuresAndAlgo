package com.java.collection.map;

public class EmployeeForHashMap {
	private String name;
	private int id;
	public EmployeeForHashMap(String name, int id) {
		this.name = name;
		this.id = id;
	}
	@Override
	public int hashCode() {
		return 1;
	}
	@Override
	public boolean equals(Object obj) {
		return true;
	}
	@Override
	public String toString() {
		return "EmployeeForHashMap [name=" + name + ", id=" + id + "]";
	}

}
