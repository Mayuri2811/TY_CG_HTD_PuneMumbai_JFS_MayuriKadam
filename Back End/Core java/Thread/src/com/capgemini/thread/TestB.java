package com.capgemini.thread;

public class TestB {

	public static void main(String[] args) {
PVR a=new PVR();
Paytm t1=new Paytm(a);
Paytm t2=new Paytm(a);

t1.start();
t2.start();
a.leaveme();
	}

}
