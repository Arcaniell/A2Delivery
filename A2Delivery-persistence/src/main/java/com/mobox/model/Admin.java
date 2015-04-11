package com.mobox.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "ADMINS")
@PrimaryKeyJoinColumn(name = "id")
public class Admin extends Userss{

    private boolean isEditUser;
    private boolean isReadUser;
    private boolean isEditDriver;
    private boolean isReadDriver;
    private boolean isEditAdmin;
    private boolean isReadAdmin;
    private boolean isEditProduct;
    private boolean isReadProduct;
    private boolean isEditOrder;
    private boolean isReadOrder;
}
