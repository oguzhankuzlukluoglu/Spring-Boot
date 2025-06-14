package com.oguzhan.config;

import com.oguzhan.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public List<Employee> employeeList() {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("1", "Oguzhan","Kuzlukluoglu"));
        employeeList.add(new Employee("2", "Anthony","Soprano"));
        employeeList.add(new Employee("3", "Walter","White"));
        employeeList.add(new Employee("4", "Michael","Corleone"));
        employeeList.add(new Employee("5", "Tony","Montana"));
        employeeList.add(new Employee("6", "Tony","Hustler"));


        return employeeList ;
    }
}
