package com.dss;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Emp("Harish",111));
		al.add(new Emp("Saru",222));
		al.add(new Student("Manish",111));
		al.add(new Student("Sandip",222));
		
		for(Object o :al)
		{
			if(o instanceof Emp)
			{
				Emp e =(Emp)o;
				System.out.println(e.ename+" "+e.id);
			}
			if(o instanceof Student)
			{
				Student s =(Student)o;
				System.out.println(s.sname +" "+s.sid);
			}
		}
		
			
		Scanner sc = new Scanner(System.in).useDelimiter("\n");		
		System.out.println("Please enter string :: ");
		String str = sc.next();
		
		if(str.contains("Bearer") || str.contains("bearer"))
		{
			System.out.println(str.substring(str.indexOf(" ")));
		}
		else
		{
			System.out.println(str);
		}
	}
}
