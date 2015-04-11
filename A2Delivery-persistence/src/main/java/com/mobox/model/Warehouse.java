package com.mobox.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "WAREHOUSES")
public class Warehouse {

    @Id
    @GeneratedValue
    private int id;
    @ManyToMany
    Set<Product> products;

}
