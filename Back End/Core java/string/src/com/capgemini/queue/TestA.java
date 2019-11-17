package com.capgemini.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestA {

	public static void main(String[] args) {
PriorityQueue<Integer> p=new PriorityQueue<Integer>();

p.add(10);
p.add(6);
p.add(4);
p.add(9);

		/*
		 * Iterator<Integer> it=p.iterator(); while(it.hasNext()) { Integer r=it.next();
		 * System.out.println(r); }
		 */

while(!p.isEmpty()) {
	int res=p.poll();
	System.out.println(res);
}

	}

}
