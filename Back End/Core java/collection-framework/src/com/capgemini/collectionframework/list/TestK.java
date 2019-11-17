package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestK {

	public static void main(String[] args) {
		ArrayList<Double> al=new ArrayList<Double>();
		al.add(2.4);
		al.add(9.6);
		al.add(4.1);
		al.add(3.2);
		
		ListIterator<Double> lt=al.listIterator();
		System.out.println("----------->Forward");
		while(lt.hasNext()) {
			Double p=lt.next();
			System.out.println(p);
		}
		
		System.out.println("<----------------Backward");
		while(lt.hasPrevious()) {
			Double t=lt.previous();
			System.out.println(t);
		}
	}

}
