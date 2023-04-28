package com.example.equipmentregister.entity;

import jakarta.persistence.*;

//@Getter
//@Setter
//@ToString
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
//@Table(name = "hoover")
public class Hoover extends Equipment {
    public Hoover(Long id, String name, String madeIn, String brand, String onlineOrder, String paymentByInstalments, String availabilityOfModel, String nameModel, String serialNumber, String color, String size, Integer price, Integer dustCollector, Integer numberOfModes, String availability) {
        super(id, name, madeIn, brand, onlineOrder, paymentByInstalments, availabilityOfModel);
        this.nameModel = nameModel;
        this.serialNumber = serialNumber;
        this.color = color;
        this.size = size;
        this.price = price;
        this.dustCollector = dustCollector;
        this.numberOfModes = numberOfModes;
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
    @Column(name = " dust_сollector")
    private Integer dustCollector;
    @Column(name = "number_of_modes")
    private Integer numberOfModes;
    @Column(name = "availability")
    private String availability;

    public Hoover() {

    }
}
