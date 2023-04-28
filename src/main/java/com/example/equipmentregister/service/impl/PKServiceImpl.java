package com.example.equipmentregister.service.impl;

import com.example.equipmentregister.repository.PKRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PKServiceImpl {
    private final PKRepository pkRepository;
}
