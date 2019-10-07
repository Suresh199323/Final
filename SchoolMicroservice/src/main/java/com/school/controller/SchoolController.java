package com.school.controller;


import com.school.entity.School;
import com.school.service.GalleryFeign;
import com.school.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@EnableAutoConfiguration
@RefreshScope
@RequestMapping("/api")
public class SchoolController {
    @Autowired
    GalleryFeign galleryFeign;


    private SchoolService schoolService;

    @Autowired
    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }


    /* @GetMapping(value = "/getSchoolDetails/{name}")
     public String getStudents(@PathVariable String name) {


         return galleryFeign.findByName(name);
     }*/
    @GetMapping(value = "/faculty/{subject}")
    public ResponseEntity<?> faculty(@PathVariable String subject ) {


        return new ResponseEntity<>(schoolService.facultyInfo(subject), HttpStatus.OK);

    }
}

