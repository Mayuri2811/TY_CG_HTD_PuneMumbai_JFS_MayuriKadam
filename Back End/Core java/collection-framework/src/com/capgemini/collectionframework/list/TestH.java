package com.capgemini.collectionframework.list;

import java.util.ArrayList;

public class TestH {

	public static void main(String[] args) {
		ArrayList<Double> al=new ArrayList<Double>();
		al.add(2.4);
		al.add(9.6);
		al.add(4.1);
		al.add(3.2);

		for(int i=0;i<4;i++) {
			Double r=al.get(i);
			System.out.println(r);
		}
	}

}
