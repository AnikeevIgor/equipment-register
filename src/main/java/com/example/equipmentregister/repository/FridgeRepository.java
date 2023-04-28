package com.example.equipmentregister.repository;

import com.example.equipmentregister.entity.Equipment;
import com.example.equipmentregister.entity.Fridge;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FridgeRepository extends JpaRepository<Fridge, Long> {

Fridge getFridgeByNameModel(String nameModel);
    List<Fridge> findEquipmentByColor (String name);

    List<Fridge> findFridgeByPriceBetween(int min,int max);

}
