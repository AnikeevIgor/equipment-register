package com.example.equipmentregister.service.impl;

import com.example.equipmentregister.entity.Equipment;
import com.example.equipmentregister.repository.EquipmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@RequiredArgsConstructor
public class EquipmentServiceImpl {
    private final EquipmentRepository equipmentRepository;

    public EquipmentServiceImpl(EquipmentRepository equipmentRepository) {
        this.equipmentRepository = equipmentRepository;
    }

    public List<Equipment> getEquipmentByName (String name){
        return equipmentRepository.getEquipmentByName(name);
    }

}
