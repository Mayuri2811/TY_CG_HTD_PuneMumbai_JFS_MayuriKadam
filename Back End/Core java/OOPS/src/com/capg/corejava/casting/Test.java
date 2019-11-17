package com.capg.corejava.casting;

public class Test {
public static void main(String[] args) {
	Pen p= new Marker(); //up casting
	Marker m= (Marker)p; //down casting
m.colour();
m.write();
m.cost=20;
m.size=10;
System.out.println(m.cost);
System.out.println(m.size);

	
	
	
	
	
}
}
