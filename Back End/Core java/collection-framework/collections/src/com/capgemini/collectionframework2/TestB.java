package com.capgemini.collectionframework2;

import java.util.ArrayList;
import java.util.Collections;

public class TestB {

	public static void main(String[] args) {
ArrayList al=new ArrayList();
al.add('M');
al.add('E');
al.add('G');
al.add('C');

System.out.println("Before:  "+al);

Collections.shuffle(al);

System.out.println("After:    "+al);
	}

}
