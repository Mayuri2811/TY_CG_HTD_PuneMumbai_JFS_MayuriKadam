package com.capgemini.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SchoolTest {

	private School school;
	
	@BeforeEach
	public void createObject() {
		school=new School();
	}

	@Test
	public void testRegisterStudent(){
	Student student=new Student("Mayuri", 67.97, 'F');
	Student stu=school.registerStudent(student);
	assertEquals(1, stu.getId());
	}	
	
	public void testRegisterstudentForNull() {
		assertThrows(NullPointerException.class,()->school.registerStudent(null));
	}
}
