package com.capgemini.exception.custom;

public class TestB {

	public static void main(String[] args) {
Amount a=new Amount();
try {
	a.check(30000);
	System.out.println("collect cash");
} catch (InvalidLimitException e) {
	e.printStackTrace();
}
	}

}
