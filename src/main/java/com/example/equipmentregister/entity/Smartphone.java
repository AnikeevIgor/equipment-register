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
//@Table(name = " smartphone")
public class Smartphone extends Equipment {

    public Smartphone(Long id, String name, String madeIn, String brand, String onlineOrder, String paymentByInstalments, String availabilityOfModel, String nameModel, String serialNumber, String color, String size, Integer price, Integer memory, Integer numberOfCameras, String availability) {
        super(id, name, madeIn, brand, onlineOrder, paymentByInstalments, availabilityOfModel);
        this.nameModel = nameModel;
        this.serialNumber = serialNumber;
        this.color = color;
        this.size = size;
        this.price = price;
        this.memory = memory;
        this.numberOfCameras = numberOfCameras;
        this.availability = availability;
    }
    @Column(name = "name_model")
    private String nameModel;
    @Column(name = "serial_number")
    private String serialNumber;
    @Column(name = "color")
    private String color;
    @Column(name = "size")
    private String size;
    @Column(name = "price")
    private Integer price;
    @Column(name = "memory ")
    private Integer memory;
    @Column(name = "number_of_cameras")
    private Integer numberOfCameras;
    @Column(name = "availability")
    private String availability;

    public Smartphone() {

    }
}
