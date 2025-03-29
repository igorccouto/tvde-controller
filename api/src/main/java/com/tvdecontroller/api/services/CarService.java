package com.tvdecontroller.api.services;

import com.tvdecontroller.api.models.entities.Car;
import com.tvdecontroller.api.repositories.CarRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CarService {
  private final CarRepository repository;

  CarService(CarRepository repository) {
    this.repository = repository;
  }

  public List<Car> all() {
    return this.repository.findAll();
  }

}
