package com.capgemini.thread;

public class PVR {
synchronized void confirm() {
	for(int i=0;i<5;i++) {
		System.out.println(i);
		try {
			wait();
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
synchronized void leaveme() {
	System.out.println("notify called..");
	notify();
}
}
