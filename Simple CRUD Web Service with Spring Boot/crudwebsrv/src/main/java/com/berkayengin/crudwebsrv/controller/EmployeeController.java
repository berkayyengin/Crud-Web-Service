package com.berkayengin.crudwebsrv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.berkayengin.crudwebsrv.entity.Employee;
import com.berkayengin.crudwebsrv.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	// postMapping is used to creating records
	@PostMapping
	public Employee addEmployee(@RequestBody Employee employee) {
		// whatever is saved to the database will be also returned to the client
		return employeeService.save(employee);
		
	}
	
	// specifies the name of the identifier that is your identity
	@GetMapping(path= "/{id}")
	public Employee getEmployee(@PathVariable int id) {
		
		return employeeService.getEmployee(id);
	}
	
	
	// PutMapping used for updating or records in database
	@PutMapping
	public Employee updateEmployee(@RequestBody Employee employee) { 
		/*we get the employee from our Postman application and 
		 * update it to update the employee in our database, 
		 * we use the put entity; to update and use
		*/
		return employeeService.update(employee);
		
	}
	
	
	@DeleteMapping(path= "/{id}")
	public String deleteEmployee(@PathVariable int id) {
		// going to pass the id of the entity that we want to delete 
	
		return employeeService.delete(id);
	}

	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	

}
