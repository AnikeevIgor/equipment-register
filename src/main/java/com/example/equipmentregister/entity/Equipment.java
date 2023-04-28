package com.example.equipmentregister.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

//@Getter
//@Setter
//@ToString
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
//@Table(name ="equipment")
public class Equipment {
    public Equipment(Long id, String name, String madeIn, String brand, String onlineOrder, String paymentByInstalments, String availabilityOfModel) {
        this.id = id;
        this.name = name;
        this.madeIn = madeIn;
        this.brand = brand;
        this.onlineOrder = onlineOrder;
        this.paymentByInstalments = paymentByInstalments;
        this.availabilityOfModel = availabilityOfModel;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "made_in")
    private String madeIn;
    @Column(name = "brand")
    private String brand;
    @Column(name = " online_order")
    private String onlineOrder;
    @Column(name = "payment_by_instalments")
    private String paymentByInstalments;
    @Column(name = "availability_of_model")
    private String availabilityOfModel;

    public Equipment() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOnlineOrder() {
        return onlineOrder;
    }

    public void setOnlineOrder(String onlineOrder) {
        this.onlineOrder = onlineOrder;
    }

    public String getPaymentByInstalments() {
        return paymentByInstalments;
    }

    public void setPaymentByInstalments(String paymentByInstalments) {
        this.paymentByInstalments = paymentByInstalments;
    }

    public String getAvailabilityOfModel() {
        return availabilityOfModel;
    }

    public void setAvailabilityOfModel(String availabilityOfModel) {
        this.availabilityOfModel = availabilityOfModel;
    }
}
