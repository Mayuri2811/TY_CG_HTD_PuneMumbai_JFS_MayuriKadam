package com.capgemini.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestM {

	public static void main(String[] args) {
LinkedList<String> lt=new LinkedList<String>();
lt.add("Mayuri");
lt.add("Priyanka");
lt.add("Manasi");

System.out.println("*********for loop**********");
for(int i=0;i<3;i++) {
	String r=lt.get(i);
	System.out.println(r);
}
	System.out.println("**********for each**********");
	for(String p:lt) {
		System.out.println(p);
	}
		System.out.println("*********Iterator***********");
		Iterator<String> it=lt.iterator();
		while(it.hasNext()) {
		String m=it.next();
		System.out.println(m);
		}
		System.out.println("***********Listiterator");
ListIterator<String> l= lt.listIterator();
System.out.println("--------->Forward");
while(l.hasNext()) {
	String t=l.next();
	System.out.println(t);
	}
System.out.println("<-----------Backward");
while(l.hasPrevious()) {
	String c=l.previous();
	System.out.println(c);
}

		
	}

}
