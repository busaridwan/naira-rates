package com.nairarates.nairarates.service.impl;

import com.nairarates.nairarates.entity.Rate;
import com.nairarates.nairarates.repository.RateRepository;
import com.nairarates.nairarates.service.RateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RateServiceImpl implements RateService {
    private final RateRepository repository;
    public List<Rate> getRates(){
        return repository.findAll();
    }
}
