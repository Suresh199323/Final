package com.example.controllers;

import com.example.entity.Student;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/demo")
public class StudentController {
    @Autowired
    StudentService studentService;

    @Autowired
    Environment environment;

    @GetMapping(value = "/echoStudentName/{name}")
    public ResponseEntity<?> echoStudentName(@PathVariable String name) {
        System.out.println("Inside MyRestController::backend...");

        String serverPort = environment.getProperty("local.server.port");

        System.out.println("Port : " + serverPort);

        return new ResponseEntity<>(HttpStatus.OK);
    }


    @GetMapping(value = "/getStudentDetails/{email}")
    public ResponseEntity<?> getStudentDetails(@PathVariable String email) {

        return new ResponseEntity<>(studentService.findByEmail(email), HttpStatus.OK);
    }

}