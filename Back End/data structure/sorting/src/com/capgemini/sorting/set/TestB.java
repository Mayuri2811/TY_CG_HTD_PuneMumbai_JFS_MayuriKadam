package com.capgemini.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestB {
	public static void main(String[] args) {
HashSet<String> hs=new HashSet<String>();
hs.add("Dhanya");
hs.add("Theju");
hs.add("Nikitha");
hs.add("Kavya");
	

	
	System.out.println("*******Using for each***********");
	for(String r:hs) {
		System.out.println(r);
	}

	System.out.println("************Using iterator***********");
	Iterator<String> it=hs.iterator();
	while(it.hasNext()) {
		String r=it.next();
		System.out.println(r);
	}
}
}