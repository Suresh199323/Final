package com.example.dao;

import com.example.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<Student, Long> {

    Student findByEmail(String emial);
}
