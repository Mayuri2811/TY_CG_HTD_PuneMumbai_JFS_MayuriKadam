package com.capg.corejava.interface1;

public class InterfaceImp implements Interface {

	@Override
	public void print() {
System.out.println("implemented print method");		
	}
	@Override
	public void display() {
		System.out.println("overriding");
		}
	public static void main(String[] args) {
		new InterfaceImp().print();
		new InterfaceImp().display();
		Interface i= new InterfaceImp();
		i.display();
		i.print();
		Interface.scan();
		}
		
	

}
