package com.mobox.model;

import javax.persistence.*;

@Entity
@Table(name = "USERS")
@Inheritance(strategy = InheritanceType.JOINED)
public class Userss {

    @Id
    @GeneratedValue
    private long id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    private String phoneNumb;
    private String email;
    private String password;

}
