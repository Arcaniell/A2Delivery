package com.mobox.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DELIVERS")
public class Delivers {

    @Id
    @GeneratedValue
    private long id;

}
