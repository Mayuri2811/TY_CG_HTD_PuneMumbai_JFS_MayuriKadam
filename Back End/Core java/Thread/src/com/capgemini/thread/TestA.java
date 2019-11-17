package com.capgemini.thread;

public class TestA {

	public static void main(String[] args) {
		System.out.println("main started..");

		Pen p=new Pen();
		p.start();

		Pen t=new Pen();
		t.start();


		try { p.join(); 
		} 
		catch (InterruptedException e) { 
			e.printStackTrace(); 
		}


		System.out.println("main ended..");
	}

}
