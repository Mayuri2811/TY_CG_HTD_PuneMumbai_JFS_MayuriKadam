package com.capgemini.lamda.basic;

public interface Square {
int sqr(int i);
}

	
class SquareOfNumber1{
	public static void main(String[] args) {
		Square s= i -> i*i;
		int j=s.sqr(3);
		System.out.println(j);
	}
}