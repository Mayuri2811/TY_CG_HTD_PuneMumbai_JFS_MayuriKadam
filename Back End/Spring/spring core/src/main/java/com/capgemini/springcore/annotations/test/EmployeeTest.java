package com.capgemini.springcore.annotations.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.capgemini.springcore.annotations.beans.EmployeeBean;
import com.capgemini.springcore.annotations.config.DepartmentConfig;
import com.capgemini.springcore.annotations.config.EmployeeConfig;

public class EmployeeTest {

	public static void main(String[] args) {
ApplicationContext context=new AnnotationConfigApplicationContext(EmployeeConfig.class);

((AbstractApplicationContext)context).registerShutdownHook();

EmployeeBean employeeBean=context.getBean(EmployeeBean.class);

System.out.println("Emp id: "+employeeBean.getEmpId());
System.out.println("Emp Name: "+employeeBean.getEmpName());
System.out.println("Department info-");Name: 
System.out.println("Dept id: "+employeeBean.getDeptBean().getDeptId());
System.out.println("Dept: "+employeeBean.getDeptBean().getDeptName());
//((AbstractApplicationContext)context).close();

	}

}