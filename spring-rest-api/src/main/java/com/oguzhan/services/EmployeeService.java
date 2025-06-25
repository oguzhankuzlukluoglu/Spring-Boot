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
    @Autowired
    private List<Employee> employeeList;

    public List<Employee> getAllEmployeeList() {
        return employeeRepository.getAllEmployeeList();
    }
    public Employee getEmployeeById(String id) {
        return  employeeRepository.getEmployeeById(id);
    }
    public List<Employee> getEmployeeWithParams(String firstName, String lastName) {
        return employeeRepository.getEmployeeWithParams(firstName, lastName);
    }
    public Employee saveEmployee(Employee newEmployee) {
        return employeeRepository.saveEmployee(newEmployee);
    }
    public Boolean deleteEmployee(String id) {
        return employeeRepository.deleteEmployee(id);
    }

}
