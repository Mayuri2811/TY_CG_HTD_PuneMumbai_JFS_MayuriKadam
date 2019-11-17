package com.capgemini.sorting.set;

import java.util.TreeSet;

public class TestI {

	public static void main(String[] args) {
		TreeSet<String> t= new TreeSet<String>();

		t.add("mayuri");
		t.add("priyanka");
		t.add("manasi");
		t.add("Deepa");
		


		System.out.println("*******Using for each***********");
		for(String r:t) {
			System.out.println(r);
		}
	}

}
