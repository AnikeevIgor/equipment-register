package com.example.equipmentregister.entity;

import jakarta.persistence.*;

//@Getter
//@Setter
//@ToString
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
//@Table(name = "fridge")
public class Fridge extends Equipment {

    public Fridge(Long id, String name, String madeIn, String brand, String onlineOrder, String paymentByInstalments, String availabilityOfModel, String nameModel, String serialNumber, String color, String size, Integer price, Integer numberDoors, String compressorType, String availability) {
        super(id, name, madeIn, brand, onlineOrder, paymentByInstalments, availabilityOfModel);

        this.nameModel = nameModel;
        this.serialNumber = serialNumber;
        this.color = color;
        this.size = size;
        this.price = price;
        this.numberDoors = numberDoors;
        this.compressorType = compressorType;
        this.availability = availability;
    }
    @Column(name = "name_model")
    private String nameModel;
    @Column(name = "serial_number ")
    private String serialNumber;
    @Column(name = "color ")
    private String color;
    @Column(name = "size")
    private String size;
    @Column(name = " price")
    private Integer price;
    @Column(name = "number_doors")
    private Integer numberDoors;
    @Column(name = "compressor_type")
    private String compressorType;
    @Column(name = "availability")
    private String availability;

   public Fridge() {
      super();
   }

    public String getNameModel() {
       return nameModel;
    }

    public void setNameModel(String nameModel) {
       this.nameModel = nameModel;
    }

    public String getSerialNumber() {
       return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
       this.serialNumber = serialNumber;
    }

    public String getColor() {
       return color;
    }

    public void setColor(String color) {
       this.color = color;
    }

    public String getSize() {
       return size;
    }

    public void setSize(String size) {
       this.size = size;
    }

    public Integer getPrice() {
       return price;
    }

    public void setPrice(Integer price) {
       this.price = price;
    }

    public Integer getNumberDoors() {
       return numberDoors;
    }

    public void setNumberDoors(Integer numberDoors) {
       this.numberDoors = numberDoors;
    }

    public String getCompressorType() {
       return compressorType;
    }

    public void setCompressorType(String compressorType) {
       this.compressorType = compressorType;
    }

    public String getAvailability() {
       return availability;
    }

    public void setAvailability(String availability) {
       this.availability = availability;
    }
 }
