package com.capgemini.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE {

	public static void main(String[] args) {
TreeSet t= new TreeSet();

t.add(15);
t.add('A');
t.add(2.4);
t.add("Deepa");
t.add(null);


System.out.println("*******Using for each***********");
for(Object r:t) {
	System.out.println(r);
}

System.out.println("************Using iterator***********");
Iterator it=t.iterator();
while(it.hasNext()) {
	Object r=it.next();
	System.out.println(r);
}
	}

}
