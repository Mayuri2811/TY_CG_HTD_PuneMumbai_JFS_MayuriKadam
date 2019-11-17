package com.capgemini.thread;

public class Pen extends Thread {
@Override
public void run() {
	for(int i=1;i<5;i++) {
		System.out.println(i);
	}
	
}
}
