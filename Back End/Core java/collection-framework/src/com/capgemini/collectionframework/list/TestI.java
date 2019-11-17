package com.capgemini.collectionframework.list;

import java.util.ArrayList;

public class TestI {

	public static void main(String[] args) {
		ArrayList<Double> al=new ArrayList<Double>();
		al.add(2.4);
		al.add(9.6);
		al.add(4.1);
		al.add(3.2);
		
		for(Double r:al) {
			System.out.println(r);
		}
	}

}
