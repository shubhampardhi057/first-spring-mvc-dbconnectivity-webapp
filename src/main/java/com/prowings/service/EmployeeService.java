package com.prowings.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prowings.dao.EmployeeRepository;
import com.prowings.entity.Employee;

@Service
public class EmployeeService {
	

	@Autowired
	EmployeeRepository repository; 
	
	public void saveEmployee(Employee e)
	{
		repository.saveEmployeeToDb(e);
	}


}
