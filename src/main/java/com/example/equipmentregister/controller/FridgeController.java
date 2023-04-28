package com.example.equipmentregister.controller;

import com.example.equipmentregister.entity.Fridge;
import com.example.equipmentregister.service.impl.FridgeServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("fridge")
public class FridgeController {
    private final FridgeServiceImpl fridgeService;

    public FridgeController(FridgeServiceImpl fridgeService) {
        this.fridgeService = fridgeService;
    }
    @GetMapping("{nameModel}")
    public ResponseEntity<Fridge> getFridgeByNameModel(@PathVariable ("nameModel") String nameModel) {
        Fridge fridge = fridgeService.getFridgeByName(nameModel);
        if (fridge == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(fridge);
    }

    @GetMapping("{color}")
    public List<Fridge> getFridgeByColor(@PathVariable ("color") String color){
        return fridgeService.getFridgeByColor(color);
    }

    @GetMapping(params = {"min", "max"})
    public ResponseEntity<List<Fridge>> getFridgeByPriceBetween(@RequestParam int min, @RequestParam int max) {
        return ResponseEntity.ok(fridgeService.getFridgeByPrice(min, max));
    }
}
