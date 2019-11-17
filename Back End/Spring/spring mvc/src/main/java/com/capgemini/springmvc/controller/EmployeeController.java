package com.capgemini.springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.capgemini.springmvc.beans.EmployeeInfoBean;
import com.capgemini.springmvc.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@GetMapping("/empLogin")
	public String displayEmpLoginForm() {
		return "empLoginForm";
	}
	
	@PostMapping("/empLogin")
		public String empLogin(int empId, String password, ModelMap modelMap, HttpServletRequest req ) {
		EmployeeInfoBean employeeInfoBean=service.authenticate(empId, password);
		if(employeeInfoBean !=null) {
			//Valid credentials
			HttpSession session=req.getSession(true);
			session.setAttribute("employeeInfoBean", employeeInfoBean);
			return "empHomePage";
		}else {
			//Invalid credentials
			modelMap.addAttribute("msg", "Invalid Credentials..");
			return "empLoginForm";
		}
	}
	@GetMapping("/addEmployeeForm")
	public String displayAddEmpForm(HttpSession session, ModelMap modelMap) {
		if(session.isNew()) {
			modelMap.addAttribute("msg", "Please Login first!!!");
			return "empLoginForm";
		}else {
			return "addEmployeeForm";
		}
	}
	@PostMapping("/addEmployeeForm")
	public String addEmployee(EmployeeInfoBean employeeInfoBean, HttpSession session, ModelMap modelMap) {
		if(session.isNew()) {
			modelMap.addAttribute("msg", "Please Login first!!!");
			return "empLoginForm";
		}else {
			if(service.addEmployee(employeeInfoBean)) {
				modelMap.addAttribute("msg","Employee added succcessfully...");
			}else {
				modelMap.addAttribute("msg", "Unable to add employee..");
			}
			return "addEmployeeForm";
		}
		
	}//End of addEmployee()
	
	
	@GetMapping("/logout")
	public String logout(HttpSession session, ModelMap modelMap) {
		session.invalidate();
		modelMap.addAttribute("msg", "Logged out Successfully!!");
		return "empLoginForm";
	}//end of logout
	
	@GetMapping("updateEmployeeForm")
	public String displayUpdateForm(HttpSession session, ModelMap modelMap) {
		if(session.isNew()) {
			modelMap.addAttribute("msg", "Please Login First");
			return "empLoginForm";
		}else {
			return "updateEmployeeForm";
		}
	}//end of displayUpdateForm()
	
	@PostMapping("/updateEmployeeForm")
		public String updateEmployee(EmployeeInfoBean employeeInfoBean, HttpSession session, ModelMap modelMap) {
		if(session.isNew()) {
			modelMap.addAttribute("msg", "Please Login First..");
			return "empLoginForm";
		} else {
			if(service.updateEmployee(employeeInfoBean)) {
				modelMap.addAttribute("msg", "Employee details updated successfully..");
			}else {
				modelMap.addAttribute("msg", "Unable to update details..");
			}
			return "updateEmployeeForm";
		}	
		
	} //End of updateEmployee()
	
	@GetMapping("/searchEmployeeForm")
	public String displaySearchEmployeeForm(HttpSession session, ModelMap modelMap) {
		if (session.isNew()) {
			// Invalid Session
			modelMap.addAttribute("msg", "Please Login First");
			return "empLoginForm";
		
		} else {
			// Valid Session
			return "searchEmployeeForm";
		}
	}// End of displaySearchEmployeeForm()
	
	@GetMapping("/searchEmployee")
	public String searchEmployee(int empId, HttpSession session, ModelMap modelMap) {
		if (session.isNew()) {
			// Invalid Session
			modelMap.addAttribute("msg", "Please Login First");
			return "empLoginForm";
		
		} else {
			EmployeeInfoBean employeeInfoBean = service.getEmployee(empId);
			if (employeeInfoBean != null) {
				modelMap.addAttribute("employeeInfoBean", employeeInfoBean);
			} else {
				modelMap.addAttribute("msg", "Employee ID " + empId + " Not Found!!!");
			}
			
			return "searchEmployeeForm";
		}
	}// End of searchEmployee()
	
	@GetMapping("/deleteEmployeeForm")
	public String displayDeleteEmployeeForm(HttpSession session, ModelMap modelMap) {
		if (session.isNew()) {
			// Invalid Session
			modelMap.addAttribute("msg", "Please Login First");
			return "empLoginForm";
		
		} else {
			// Valid Session
			return "deleteEmployeeForm";
		}
	}// End of displaySearchEmployeeForm()
	
	@GetMapping("/deleteEmployee")
	public String deleteEmployee(int empId, HttpSession session, ModelMap modelMap) {
		if (session.isNew()) {
			// Invalid Session
			modelMap.addAttribute("msg", "Please Login First");
			return "empLoginForm";
		
		} else {
			// Valid Session
			if(service.deleteEmployee(empId)) {
				modelMap.addAttribute("msg", "Employee Deleted Successfully!");
			} else {
				modelMap.addAttribute("msg", "Employee ID " + empId + " Not Found!");
			}
			
			return "deleteEmployeeForm";
		}
	}// End of searchEmployee()
	
	@GetMapping("/seeAllEmployees")
	public String getAllEmployees(HttpSession session, ModelMap modelMap) {
		
		if (session.isNew()) {
			// Invalid Session
			modelMap.addAttribute("msg", "Please Login First");
			return "empLoginForm";
		
		} else {
			// Valid Session
			List<EmployeeInfoBean> employeesList = service.getAllEmployees();
			modelMap.addAttribute("employeesList", employeesList);
			
			return "displayAllEmployees";
		}
	}// End of getAllEmployees()
	
	@GetMapping("/home")
	public String displayEmpHomePage(HttpSession session, ModelMap modelMap) {

		if (session.isNew()) {
			// Invalid Session
			modelMap.addAttribute("msg", "Please Login First");
			return "empLoginForm";
		
		} else {
			// Valid Session
			return "empHomePage";
		}
	}// End of displayEmpHomePage()
	
}//End of Controller
