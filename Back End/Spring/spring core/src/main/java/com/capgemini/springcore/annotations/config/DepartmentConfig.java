package com.capgemini.springcore.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.capgemini.springcore.annotations.beans.DepartmentBean;

@Configuration
public class DepartmentConfig {

	@Bean(name="dev")
	public DepartmentBean getDevDept() {
		 DepartmentBean bean=new DepartmentBean();
		 bean.setDeptId(901);
		 bean.setDeptName("Dev");
		 return bean;
	 }
	
	@Bean(name="testing")
	public DepartmentBean getTestingDept() {
		DepartmentBean bean=new DepartmentBean();
		 bean.setDeptId(902);
		 bean.setDeptName("Testing");
		 return bean;
	}
	
	@Bean(name="hr")
	//@Primary
	public DepartmentBean getHRDept() {
		DepartmentBean bean=new DepartmentBean();
		 bean.setDeptId(903);
		 bean.setDeptName("HR");
		 return bean;
	}
	
}
