package com.capgemini.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestN {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(20);
		v.add("mayuri");
		v.add(2.3);
		System.out.println("*********for loop**********");
		for(int i=0;i<3;i++) {
			Object r=v.get(i);
			System.out.println(r);
		}
			System.out.println("**********for each**********");
			for(Object p:v) {
				System.out.println(p);
			}
				System.out.println("*********Iterator***********");
				Iterator<String> it=v.iterator();
				while(it.hasNext()) {
					Object m=it.next();
					System.out.println(m);
				}
					System.out.println("***********Listiterator");
					System.out.println("---------->Forward");
					ListIterator<String> l= v.listIterator();
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
				

		

	
