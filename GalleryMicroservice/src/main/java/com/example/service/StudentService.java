package com.example.service;

import com.example.domain.Student;

public interface StudentService {
    Student findByEmail(String email);
}

