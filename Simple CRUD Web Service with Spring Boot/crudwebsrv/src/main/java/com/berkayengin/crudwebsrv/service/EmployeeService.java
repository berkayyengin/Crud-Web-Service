package com.berkayengin.crudwebsrv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.berkayengin.crudwebsrv.entity.Employee;
import com.berkayengin.crudwebsrv.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	public Employee save(Employee emp) {
		// worker object we get from client and
		//sends it back to the client package		
		
		// write a method in our service and call the save method of the repository
		return employeeRepository.save(emp);
		
	}
	
	
	public Employee getEmployee(int id) {
		return employeeRepository.findById(id).get();
		
		
	}
	
	
	public Employee update(Employee employee) {
		// want to find the employee from database and then update it
		// use employeeRepository
		Employee emp = employeeRepository.findById(employee.getId()).get();
		
		//add the fields from incoming employee to the database
		emp.setName(employee.getName());
		emp.setSurname(employee.getSurname());
		emp.setAge(employee.getAge());
		emp.setSalary(employee.getSalary());
		emp.setWorkYears(employee.getWorkYears());
		emp.setTitle(employee.getTitle());
		
		return employeeRepository.save(emp);
	}
	
	
	public String delete(int id) {
		
		// the identifier of the entity we want to delete
		employeeRepository.deleteById(id);
		
		return "Employee deleted " + id;
	}
	

	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}

	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	
}
