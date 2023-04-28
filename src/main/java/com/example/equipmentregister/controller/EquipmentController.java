package com.example.equipmentregister.controller;

import com.example.equipmentregister.entity.Equipment;
import com.example.equipmentregister.service.impl.EquipmentServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("equipment")
public class EquipmentController {

    private final EquipmentServiceImpl equipmentService;

    public EquipmentController(EquipmentServiceImpl equipmentService) {
        this.equipmentService = equipmentService;
    }

    @GetMapping("{name}")
    public List<Equipment> getFridgeByName(@PathVariable("name") String name) {
        return equipmentService.getEquipmentByName(name);
    }
}
