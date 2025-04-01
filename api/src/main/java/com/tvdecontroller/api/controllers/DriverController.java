package com.tvdecontroller.api.controllers;

import com.tvdecontroller.api.models.entities.Driver;
import com.tvdecontroller.api.services.DriverService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class DriverController {
  private final DriverService service;

  DriverController(DriverService service) {
    this.service = service;
  }

  @GetMapping("/drivers")
  List<Driver> all() {
    return this.service.all();
  }
}
