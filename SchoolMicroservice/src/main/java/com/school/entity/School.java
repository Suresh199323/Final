package com.school.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@Setter
@Getter
@ToString
@Entity
@Table(name = "school")
public class School {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String facultyName;
    @Column
    private String subject;
    @Column
    private String phone;
    @Column
    private String email;

}
