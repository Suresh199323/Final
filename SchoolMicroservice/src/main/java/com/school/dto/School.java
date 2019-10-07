package com.school.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class School {
    private Integer id;

    private String facultyName;

    private String subject;

    private String phone;

    private String email;
}
