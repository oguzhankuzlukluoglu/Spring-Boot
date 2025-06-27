package com.example.services.impl;

import com.example.entities.Student;
import com.example.repository.StudentRepository;
import com.example.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {

       return studentRepository.save(student);
    }
}
