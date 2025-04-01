package com.tvdecontroller.api.controllers;

import com.tvdecontroller.api.models.entities.Driver;
import com.tvdecontroller.api.services.DriverService;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

  @DeleteMapping(path = "/drivers/{id}")
  public ResponseEntity<Void> excluir(@PathVariable @Positive @NotNull Long id) {

    this.service.deletedById(id);
    return ResponseEntity.noContent().build();
  }
}
