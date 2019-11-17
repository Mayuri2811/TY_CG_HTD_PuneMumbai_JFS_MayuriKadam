package com.capgemini.objectclass.methods;

public class Car {
int id;
String name;
public boolean equals(Object ref) {
	Car r= (Car)ref;
	if(this.id==r.id)
	{
		if(this.name==r.name) 
		{
			return true;
		}
		else 
		{
			return false;
		}
		}
		else 
		{
			return false;
			
		}
	}
}

