package com.capgemini.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class DemoA {

	public static void main(String[] args) {
Stack s=new Stack();
s.add(5);
s.add("Mayuri");
s.add(4.5);
s.add('G');

System.out.println("*********for loop**********");
for(int i=0;i<3;i++) {
	Object r=s.get(i);
	System.out.println(r);
}
	System.out.println("**********for each**********");
	for(Object p:s) {
		System.out.println(p);
	}
		System.out.println("*********Iterator***********");
		Iterator it=s.iterator();
		while(it.hasNext()) {
			Object m=it.next();
			System.out.println(m);
		}
			System.out.println("***********Listiterator");
			System.out.println("---------->Forward");
			ListIterator l= s.listIterator();
			while(l.hasNext()) {
				Object t=l.next();
				System.out.println(t);
			}
			
			System.out.println("<------------Backward");
			while(l.hasPrevious()) {
				Object f=l.previous();
				System.out.println(f);
			}


	}

}
