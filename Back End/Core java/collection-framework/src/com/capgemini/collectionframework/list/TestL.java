package com.capgemini.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestL {

	public static void main(String[] args) {
LinkedList l= new LinkedList();
l.add(9);
l.add('M');
l.add("mayuri");
l.add(2.3);

System.out.println("*********for loop**********");
for(int i=0;i<4;i++) {
	Object r=l.get(i);
	System.out.println(r);
}
	System.out.println("**********for each**********");
	for(Object p:l) {
		System.out.println(p);
	}
		System.out.println("*******Iterator***********");
Iterator it=l.iterator();
while(it.hasNext()) {
	Object m=it.next();
	System.out.println(m);
}
	System.out.println("************List Iterator************");
	ListIterator lt=l.listIterator();
	System.out.println("---------->forward");
	while(lt.hasNext()) {
	Object o=	lt.next();
		System.out.println(o);
	}
	System.out.println("<---------Backward");
	while(lt.hasPrevious()) {
		Object x=lt.previous();
		System.out.println(x);
	}

	}

}
