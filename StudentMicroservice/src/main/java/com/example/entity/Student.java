package com.example.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "StudentDetail")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Access(AccessType.FIELD)
    private Long id;

    @Column
    @Access(AccessType.FIELD)

    private String name;

    @Column
    @Access(AccessType.FIELD)
    private String address;

    @Column
    @Access(AccessType.FIELD)
    private int age;


    @Column
    @NaturalId
    @Access(AccessType.FIELD)
    private String email;


    @Column
    @Access(AccessType.FIELD)
    private int phone;


}
