package com.testcamp.apiCar.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testcamp.apiCar.dto.CarDTO;

@RestController
@RequestMapping("/api/car")
public class CarController {
    
    @PostMapping
    public void create(@RequestBody CarDTO req){
        System.out.println(req.modelo());
    }
}
