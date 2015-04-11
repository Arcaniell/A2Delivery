package com.mobox.model;

import com.mobox.model.enumInfo.OrderStatus;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "ORDERS")
public class Order {

    @Id
    @GeneratedValue
    private long id;
    private String notes;
    @Column(nullable = false)
    private Date deliveryDate;
    @Column(nullable = false)
    private double price;
    @ManyToOne
    private City deliveryCity;
    @Column(nullable = false)
    private String deliveryAddress;
    @ManyToOne
    private OrderStatus status;
    @OneToMany
    private Set<Product> products;
    @ManyToOne
    private Driver driver;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public City getDeliveryCity() {
        return deliveryCity;
    }

    public void setDeliveryCity(City deliveryCity) {
        this.deliveryCity = deliveryCity;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
