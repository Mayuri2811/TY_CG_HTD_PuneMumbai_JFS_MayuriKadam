package com.capgemini.objectclass.methods;

public class Marker implements Cloneable {
int id;
String name;
public Marker(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
