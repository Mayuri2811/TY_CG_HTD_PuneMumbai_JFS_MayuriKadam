package com.capg.corejava.HasA;

public class MusicSystem {
	static Car c=new Car();
	public static void main(String[] args) {
		MusicSystem.c.play();
		MusicSystem.c.pause();
		MusicSystem.c.stop();
	}
}
