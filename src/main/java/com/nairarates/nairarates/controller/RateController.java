package com.nairarates.nairarates.controller;

import com.nairarates.nairarates.entity.Rate;
import com.nairarates.nairarates.service.RateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rate")
@RequiredArgsConstructor
public class RateController {
    private final RateService service;
    @GetMapping
    public List<Rate> getRates(){
        return service.getRates();
    }
}
