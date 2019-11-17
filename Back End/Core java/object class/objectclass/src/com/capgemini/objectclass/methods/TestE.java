package com.capgemini.objectclass.methods;

public class TestE {

	public static void main(String[] args) {
Car c= new Car();
c.id = 1;
c.name ="Honda";
Car d= new Car();
d.id=2;
d.name="maruti";
Car e=new Car();
e.id=1;
e.name="Honda";
System.out.println(c.equals(e));
System.out.println(c.equals(d));
	}

}
