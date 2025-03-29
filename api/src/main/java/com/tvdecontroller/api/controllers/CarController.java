package com.tvdecontroller.api.controllers;

import com.tvdecontroller.api.models.entities.Car;
import com.tvdecontroller.api.services.CarService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class CarController {
  private final CarService service;

  CarController(CarService service) {
    this.service = service;
  }

  @GetMapping("/cars")
  List<Car> all() {
    return this.service.all();
  }
}
