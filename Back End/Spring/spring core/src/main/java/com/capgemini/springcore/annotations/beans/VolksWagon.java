package com.capgemini.springcore.annotations.beans;

import com.capgemini.springcore.interfaces.Engine;

public class VolksWagon implements Engine {

	@Override
	public int getCC() {
		return 1300;
	}

	@Override
	public String getType() {
		return "4-Stroke Diesel";
	}

}
