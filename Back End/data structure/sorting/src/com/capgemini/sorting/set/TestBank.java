package com.capgemini.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestBank {

	public static void main(String[] args) {
		ById comp=new ById();
		ByName compname=new ByName();
		ByMicr compmicr=new ByMicr();
TreeSet<Bank> ts=new TreeSet<Bank>(compmicr);


Bank b1=new Bank(123, "SBI", 123456l);
Bank b2=new Bank(234, "HDFC", 234567l);
Bank b3=new Bank(345, "Axis", 345678l);
Bank b4=new Bank(456, "ICICi", 456789l);

ts.add(b1);
ts.add(b2);
ts.add(b3);
ts.add(b4);

Iterator<Bank> it=ts.iterator();
while(it.hasNext()) {
	Bank b=it.next();
	System.out.println("pin is: "+b.pin);
	System.out.println("name is: "+b.name);
	System.out.println("micr is: "+b.micr);
	System.out.println("-------------------------");
}


	}

}
