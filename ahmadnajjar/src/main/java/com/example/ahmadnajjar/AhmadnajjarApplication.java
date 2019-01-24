package com.example.ahmadnajjar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.ahmadnajjar.domain.Car;
import com.example.ahmadnajjar.domain.CarRepository;
import com.example.ahmadnajjar.domain.Trip;
import com.example.ahmadnajjar.domain.TripRepository;

@SpringBootApplication
public class AhmadnajjarApplication {

  @Autowired 
  private CarRepository repository;
  
  @Autowired 
  private TripRepository repository1;

  public static void main(String[] args) {
    SpringApplication.run(AhmadnajjarApplication.class, args);

  }
  @Bean
  CommandLineRunner runner(){
    return args -> {
      // Save demo data to database
      repository.save(new Car("Ford", "Mustang", "Red",
       "ADF-1121", 2017, 59000));
      repository.save(new Car("Nissan", "Leaf", "White",
       "SSJ-3002", 2014, 29000));    
       repository.save(new Car("Toyota", "Prius", "Silver",
       "KKO-0212", 2018, 39000));
       
//       repository1.save("haifa", "israel", 10 , 50);
//       repository1.save(new Trip("telaviv", "israel", 11 , 100));
//       repository1.save(new Trip("jerusalem", "moscow", 12 , 200));
    };
  } 
}


