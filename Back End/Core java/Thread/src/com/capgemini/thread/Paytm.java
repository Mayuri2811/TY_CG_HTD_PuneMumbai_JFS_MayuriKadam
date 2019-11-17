package com.capgemini.thread;

public class Paytm extends Thread {
PVR ref;
public Paytm(PVR r) {
	ref=r;
}
@Override
	public void run() {
		ref.confirm();
	}
}
