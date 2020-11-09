package com.dss;

public class Student {
	String sname;
	int sid;
	public Student(String sname, int sid) {
		super();
		this.sname = sname;
		this.sid = sid;
	}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", sid=" + sid + "]";
	}
	
	
}
