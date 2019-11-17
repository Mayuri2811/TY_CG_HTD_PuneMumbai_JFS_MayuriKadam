package com.capgemini.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {

	public static void main(String[] args) {
		LinkedHashSet<Double> lh=new LinkedHashSet<Double>();
		lh.add(1.2);
		lh.add(2.3);
		lh.add(3.4);
		lh.add(4.5);
		
		System.out.println("*******Using for each***********");
		for(Double r:lh) {
			System.out.println(r);
		}

		System.out.println("************Using iterator***********");
		Iterator<Double> it=lh.iterator();
		while(it.hasNext()) {
			Double r=it.next();
			System.out.println(r);
		}
		
		
		
		
	}

}
