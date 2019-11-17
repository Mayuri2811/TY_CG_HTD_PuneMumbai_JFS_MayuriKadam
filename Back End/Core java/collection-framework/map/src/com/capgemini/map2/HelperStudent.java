package com.capgemini.map2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class HelperStudent {
void displayall(ArrayList<Student> st) {
	Iterator<Student> it=st.iterator();
	while(it.hasNext()) {
		Student s=it.next();
		System.out.println("Id is "+s.id);
		System.out.println("Name is "+s.name);
		System.out.println("Percentage is "+s.percentage);
		System.out.println("Gender is "+s.gender);
		System.out.println("------------------------------------");
	}
}

void displayPassed(ArrayList<Student> st) {
List<Student> li=st.stream().filter(i->i.percentage>35).collect(Collectors.toList());
Iterator<Student> it=li.iterator();
while(it.hasNext()) {
	Student s=it.next();
	System.out.println("Id is "+s.id);
	System.out.println("Name is "+s.name);
	System.out.println("Percentage is "+s.percentage);
	System.out.println("Gender is "+s.gender);
	System.out.println("------------------------------------");
}
}

void displayFailed(ArrayList<Student> st) {
List<Student> li=st.stream().filter(i->i.percentage<35).collect(Collectors.toList());
Iterator<Student> it=li.iterator();
while(it.hasNext()) {
	Student s=it.next();
	System.out.println("Id is "+s.id);
	System.out.println("Name is "+s.name);
	System.out.println("Percentage is "+s.percentage);
	System.out.println("Gender is "+s.gender);
	System.out.println("------------------------------------");
}
}

void displayPassedByGender(ArrayList<Student> st,char g) {
List<Student> li=st.stream().filter(i->i.percentage>35&& i.gender==g).collect(Collectors.toList());
Iterator<Student> it=li.iterator();
while(it.hasNext()) {
	Student s=it.next();
	System.out.println("Id is "+s.id);
	System.out.println("Name is "+s.name);
	System.out.println("Percentage is "+s.percentage);
	System.out.println("Gender is "+s.gender);
	System.out.println("------------------------------------");
}
}

void displayFailedByGender(ArrayList<Student> st,char g) {
List<Student> li=st.stream().filter(i->i.percentage<35&& i.gender==g).collect(Collectors.toList());
Iterator<Student> it=li.iterator();
while(it.hasNext()) {
	Student s=it.next();
	System.out.println("Id is "+s.id);
	System.out.println("Name is "+s.name);
	System.out.println("Percentage is "+s.percentage);
	System.out.println("Gender is "+s.gender);
	System.out.println("------------------------------------");
}
}

void getTopper(ArrayList<Student> st) {
	
	Comparator<Student> comp=(i,j)-> {
			Double x=i.percentage;
			Double y=j.percentage;
			return x.compareTo(y);
			
	};
	
	Student r=st.stream().max(comp).get();
	
		
		System.out.println("Id is "+r.id);
		System.out.println("Name is "+r.name);
		System.out.println("Percentage is "+r.percentage);
		System.out.println("Gender is "+r.gender);
		
	
	
}

}
