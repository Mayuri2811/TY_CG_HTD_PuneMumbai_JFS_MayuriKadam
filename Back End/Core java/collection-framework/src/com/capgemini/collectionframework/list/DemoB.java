package com.capgemini.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class DemoB {

	public static void main(String[] args) {
Stack<String> s=new Stack<String>();
s.add("Coco");
s.add("Grammy");
s.add("Rifle");

System.out.println("*********for loop**********");
for(int i=0;i<3;i++) {
	String r=s.get(i);
	System.out.println(r);
}
	System.out.println("**********for each**********");
	for(String p:s) {
		System.out.println(p);
	}
		System.out.println("*********Iterator***********");
		Iterator<String> it=s.iterator();
		while(it.hasNext()) {
			String m=it.next();
			System.out.println(m);
		}
			System.out.println("***********Listiterator");
			System.out.println("---------->Forward");
			ListIterator<String> l= s.listIterator();
			while(l.hasNext()) {
				String t=l.next();
				System.out.println(t);
			}
			
			System.out.println("<------------Backward");
			while(l.hasPrevious()) {
				String f=l.previous();
				System.out.println(f);
			}

	}

}
