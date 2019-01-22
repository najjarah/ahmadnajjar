package com.example.ahmadnajjar.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository <Car, Long> {

	 // Fetch cars by year
	  List<Car> findByYear(int year);
}
