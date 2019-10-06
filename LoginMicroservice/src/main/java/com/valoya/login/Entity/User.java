package com.valoya.login.Entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Objects;
@Setter
@Getter
@ToString
@Entity
@Table(name = "user")

public class User {

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(nullable = false)

    //@NaturalId
    private String name;
    @Column(nullable = false)

    private String email;
    @Column(nullable = false)

    private String password;

    @Column(nullable = false)

    // @ManyToOne(optional = false, fetch = FetchType.EAGER, targetEntity = Role.class)
    private String role;


  }