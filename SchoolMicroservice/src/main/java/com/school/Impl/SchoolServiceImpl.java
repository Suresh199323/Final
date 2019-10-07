package com.school.Impl;


import com.school.entity.School;
import com.school.repository.SchoolRepository;
import com.school.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolServiceImpl implements SchoolService {

    private SchoolRepository schoolRepository;

    @Autowired
    public SchoolServiceImpl(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    @Override
    public School facultyInfo(String subject) {
        return schoolRepository.findAllBySubject(subject);
    }
}
