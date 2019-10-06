package com.example.Impl;

import com.example.entity.Student;
import com.example.repository.StudentRepository;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student findByEmail(String email) {
        return studentRepository.findByEmail(email);
    }
}
