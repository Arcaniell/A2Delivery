package com.mobox.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "CLIENTS")
@PrimaryKeyJoinColumn(name = "id")
public class Client extends Userss{

    @OneToMany
    Set<Order> orders;

}
