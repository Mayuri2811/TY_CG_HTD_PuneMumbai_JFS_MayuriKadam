package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestD {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(24);
		al.add("chinnu");
		al.add(2.9);
		al.add('F');

		ListIterator m=al.listIterator();

		System.out.println("--------------->Forward");
		while(m.hasNext()) {
			Object r=m.next();
			System.out.println(r);
		}
		System.out.println("<----------------Backward");
		while(m.hasPrevious()) {
			Object p=m.previous();
			System.out.println(p);
		}

	}

}
