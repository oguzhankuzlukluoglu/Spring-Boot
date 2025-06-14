package com.oguzhan.services;

import com.oguzhan.model.Employee;
import com.oguzhan.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployeeList() {

        employeeRepository.getAllEmployeeList();

        return null;
    }

}
