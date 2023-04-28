package com.example.equipmentregister.repository;

import com.example.equipmentregister.entity.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EquipmentRepository extends JpaRepository<Equipment, Long> {

    List<Equipment> getEquipmentByName (String name);

}
