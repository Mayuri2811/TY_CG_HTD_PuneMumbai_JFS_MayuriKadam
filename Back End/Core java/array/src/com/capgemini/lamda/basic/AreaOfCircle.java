package com.capgemini.lamda.basic;
interface Circle{
	double area(int r);
}
public class AreaOfCircle {
public static void main(String[] args) {
	Circle c= r -> 3.14*r*r;
	double p=c.area(5);
	System.out.println(p);
}
}
