package com.capgemini.array.genric;

public class TestE {

	public static void main(String[] args) {
char ch[]= {'a','b','c','d'};
for(int i=0;i<ch.length;i++) {
	System.out.println(ch[i]);
}
System.out.println("---------------");
for(char a:ch) {	//for each loop
	System.out.println(a);
}
	}

}
