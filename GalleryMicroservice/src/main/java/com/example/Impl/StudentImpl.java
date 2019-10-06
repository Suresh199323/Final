package com.example.Impl;

import com.example.domain.Student;
import com.example.dao.StudentDao;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentImpl implements StudentService {
    @Autowired
    StudentDao studentDao;

    @Override
    public Student findByEmail(String email) {
        return studentDao.findByEmail(email);
    }
}
