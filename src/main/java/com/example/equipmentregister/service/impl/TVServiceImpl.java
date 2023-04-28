package com.example.equipmentregister.service.impl;

import com.example.equipmentregister.repository.TVRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TVServiceImpl {
    private final TVRepository tvRepository;
}
