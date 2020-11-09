package com.dss;

public class Emp {
	String ename;
	int id;
	public Emp(String ename, int id) {
		super();
		this.ename = ename;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Emp [ename=" + ename + ", id=" + id + "]";
	}
	
	
}
