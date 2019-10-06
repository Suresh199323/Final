package com.school.service;


import com.school.fallback.StudentFeignFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



    @FeignClient(name="STUDENTSERVICE", fallback = StudentFeignFallback.class)//Service Id of EmployeeSerach service
    public interface GalleryFeign {
//needed channge in url
        @RequestMapping(value = "/getStudentDetails/{email}")
        public String findByName(@PathVariable String email);
    }



