package com.capgemini.array.genric;

public class TestMouse {

	public static void main(String[] args) {
Mouse m=new Mouse();
double t[]= {1.2,2.3,3.4,4.5};
m.walk(t);
System.out.println("----------------");
int c[]= {1,2,3,4};
m.run(c);
System.out.println("----------------");
m.onlyOdd(c);
	}

}
