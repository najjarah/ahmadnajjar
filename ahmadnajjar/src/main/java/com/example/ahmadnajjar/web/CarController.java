package com.example.ahmadnajjar.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ahmadnajjar.domain.Car;
import com.example.ahmadnajjar.domain.CarRepository;

@RestController
public class CarController {
	 @Autowired
     private CarRepository repository;

	 @RequestMapping("/cars")
     public Iterable<Car> getCars() {
       return repository.findAll();
     }


}
