package com.capgemini.springcore.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;

import com.capgemini.springcore.annotations.beans.DepartmentBean;
import com.capgemini.springcore.annotations.beans.EmployeeBean;

@Import(DepartmentConfig.class)
@Configuration
public class EmployeeConfig {

	@Bean
	public EmployeeBean getEmployeeBean() {
		EmployeeBean employeeBean=new EmployeeBean();
		employeeBean.setEmpId(123);
		employeeBean.setEmpName("Mayuri");
		return employeeBean;
	}
	
	
}
