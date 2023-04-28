package com.example.equipmentregister.service.impl;

import com.example.equipmentregister.entity.Fridge;
import com.example.equipmentregister.repository.FridgeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@RequiredArgsConstructor
public class FridgeServiceImpl {
    private final FridgeRepository fridgeRepository;

    public FridgeServiceImpl(FridgeRepository fridgeRepository) {
        this.fridgeRepository = fridgeRepository;
    }

    public Fridge getFridgeByName(String nameModel) {
        return fridgeRepository.getFridgeByNameModel(nameModel);
    }
    public List<Fridge> getFridgeByColor(String color){
        return fridgeRepository.findEquipmentByColor(color);
    }

    public List<Fridge> getFridgeByPrice(int min, int max){
        return fridgeRepository.findFridgeByPriceBetween(min, max);
    }

}
