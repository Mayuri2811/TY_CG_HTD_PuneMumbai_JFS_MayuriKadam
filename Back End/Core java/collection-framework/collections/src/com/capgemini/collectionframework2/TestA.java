package com.capgemini.collectionframework2;

import java.util.Collections;
import java.util.LinkedList;

public class TestA {
	public static void main(String[] args) {
		
		LinkedList<Double> al=new LinkedList<Double>();
		al.add(3.6);
		al.add(2.4);
		al.add(4.7);
		al.add(1.6);
 System.out.println("before:  "+al);
 Collections.sort(al);
 
 System.out.println("After:  "+al);
		
	}

}
