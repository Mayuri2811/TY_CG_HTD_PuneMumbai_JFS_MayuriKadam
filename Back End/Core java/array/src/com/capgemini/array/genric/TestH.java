package com.capgemini.array.genric;

public class TestH {
public static void main(String[] args) {
	int m[]= {10,20,30,40};
	receive(m);
}
static void receive(int[] a) {
	for(int i:a) {
		System.out.println(i);
	}
}
}
