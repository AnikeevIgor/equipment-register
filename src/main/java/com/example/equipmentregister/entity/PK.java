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
//@Table(name ="pk")
public class PK extends Equipment {
    public PK(Long id, String name, String madeIn, String brand, String onlineOrder, String paymentByInstalments, String availabilityOfModel, String nameModel, String serialNumber, String color, String size, Integer price, String category, String processorType, String availability) {
        super(id, name, madeIn, brand, onlineOrder, paymentByInstalments, availabilityOfModel);
        this.nameModel = nameModel;
        this.serialNumber = serialNumber;
        this.color = color;
        this.size = size;
        this.price = price;
        this.category = category;
        this.processorType = processorType;
        this.availability = availability;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
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
    @Column(name = "category")
    private String category;
    @Column(name = "processor_type")
    private String processorType;
    @Column(name = "availability")
    private String availability;

    public PK() {

    }
}
