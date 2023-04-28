package com.example.equipmentregister.repository;

import com.example.equipmentregister.entity.Smartphone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SmartphoneRepository extends JpaRepository<Smartphone, Integer> {
}
