package com.capgemini.queue;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestC {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();

		al.add(5);
		al.add(10);
		al.add(6);
		al.add(3);
		al.add(4);
		
		List<Integer> x=al.stream().filter(i->i%3==0).collect(Collectors.toList());
		
		for(Integer r:x) {
			System.out.println(r);
		}
	}

}
