package com.school.service;


import com.school.entity.School;
import org.springframework.stereotype.Service;

import java.util.List;

public interface SchoolService {
    public School facultyInfo(String subject);
}
