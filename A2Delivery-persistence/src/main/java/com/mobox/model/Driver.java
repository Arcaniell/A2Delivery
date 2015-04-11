package com.mobox.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "DRIVERS")
@PrimaryKeyJoinColumn(name = "id")
public class Driver extends Userss{

}
