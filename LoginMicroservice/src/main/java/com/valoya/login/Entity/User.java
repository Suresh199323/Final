package com.valoya.login.Entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.*;
import java.io.Serializable;

@Setter
@Getter
@ToString
@Entity
@Table(name = "user")

public class User implements Serializable {

    private static final long serialVersionUID = 1L;
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