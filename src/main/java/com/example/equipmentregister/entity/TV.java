package com.example.equipmentregister.entity;

import jakarta.persistence.*;

//@Getter
//@Setter
//@ToString
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
//@Table(name ="tv")
public class TV extends Equipment {

    public TV(Long id, String name, String madeIn, String brand, String onlineOrder, String paymentByInstalments, String availabilityOfModel, String nameModel, String serialNumber, String color, String size, Integer price, String category, String technology, String availability) {
        super(id, name, madeIn, brand, onlineOrder, paymentByInstalments, availabilityOfModel);
        this.nameModel = nameModel;
        this.serialNumber = serialNumber;
        this.color = color;
        this.size = size;
        this.price = price;
        this.category = category;
        this.technology = technology;
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
    @Column(name = "category")
    private String category;
    @Column(name = "technology")
    private String technology;
    @Column(name = "availability")
    private String availability;

    public TV() {

    }
}
