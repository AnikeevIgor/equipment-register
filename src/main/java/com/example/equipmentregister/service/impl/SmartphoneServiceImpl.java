package com.example.equipmentregister.service.impl;

import com.example.equipmentregister.repository.SmartphoneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SmartphoneServiceImpl {
    private final SmartphoneRepository smartphoneRepository;
}
