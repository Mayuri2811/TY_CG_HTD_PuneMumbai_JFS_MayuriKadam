package com.capgemini.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springrest.beans.EmployeeInfoBean;
import com.capgemini.springrest.beans.EmployeeResponse;
import com.capgemini.springrest.service.EmployeeService;

//@Controller
@RestController
public class EmployeeRestController {

	@Autowired
	private EmployeeService service;

	@GetMapping(path="/getEmployee",
			produces= MediaType.APPLICATION_JSON_VALUE
			)
	// @ResponseBody
	public EmployeeResponse getEmployee(int empId) {
		EmployeeInfoBean employeeInfoBean=service.getEmployee(empId);
		EmployeeResponse response=new EmployeeResponse();
		if(employeeInfoBean!=null) {
			response.setStatusCode(210);
			response.setMessage("success");
			response.setDescription("Employee Record Found..");
			response.setEmployeeInfoBean(employeeInfoBean);
		}else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Employee Id "+empId+" Not Found!!");
		}
		return response;
	}// End of getEmployee()

	@PutMapping(path="/addEmployee" ,
			consumes= {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
			produces=MediaType.APPLICATION_JSON_VALUE )
	// @ResponseBody
	public EmployeeResponse addEmployee(@RequestBody EmployeeInfoBean employeeInfoBean) {
		boolean isAdded= service.addEmployee(employeeInfoBean);
		
		EmployeeResponse response=new EmployeeResponse();
		
		if(isAdded) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee Added successfully..");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Unable to Add Employee Record..");
		} 
		return response;
	}// End of addEmployee()

	@DeleteMapping(path="/deleteEmployee",
			produces= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public EmployeeResponse deleteEmployee(int empId) {
		boolean isDeleted= service.deleteEmployee(empId);
		
EmployeeResponse response=new EmployeeResponse();
		
		if(isDeleted) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee Deleted successfully..");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Unable to Delete Employee Record..");
		} 
		return response;
	}//End of deleteEmployee()
	
	
	@PostMapping(path="/updateEmployee",
			consumes= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},
			produces= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public boolean updateEmployee(@RequestBody EmployeeInfoBean employeeInfoBean) {
		return service.updateEmployee(employeeInfoBean);
	}//End of updateEmployee()
	
	@GetMapping(path="/getAll",
			produces= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public EmployeeResponse getAllEmployees() {
		List<EmployeeInfoBean> employeeList=service.getAllEmployees();
		EmployeeResponse response=new EmployeeResponse();
		if(employeeList!=null) {
			response.setStatusCode(210);
			response.setMessage("success");
			response.setDescription("Employee Record Found..");
			response.setEmployeeList(employeeList);
		}else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Unable to fetch Employee Record");
		}
		return response;
	}//End of getAllEmployees()
}// End of controller
