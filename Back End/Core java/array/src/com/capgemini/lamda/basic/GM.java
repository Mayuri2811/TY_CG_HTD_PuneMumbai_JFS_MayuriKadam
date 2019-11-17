package com.capgemini.lamda.basic;
interface Morning{
	String gm();
}
public class GM {
	public static void main(String[] args) {
		Morning m=()->"Good Morning";
		String c=m.gm();
		System.out.println(c);
	}

}
