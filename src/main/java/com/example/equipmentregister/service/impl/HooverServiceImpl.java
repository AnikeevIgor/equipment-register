package com.example.equipmentregister.service.impl;

import com.example.equipmentregister.repository.HooverRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HooverServiceImpl {
    private final HooverRepository hooverRepository;
}
