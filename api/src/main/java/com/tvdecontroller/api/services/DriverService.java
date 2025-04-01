package com.tvdecontroller.api.services;

import com.tvdecontroller.api.models.entities.Driver;
import com.tvdecontroller.api.repositories.DriverRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class DriverService {
  private final DriverRepository repository;

  DriverService(DriverRepository repository) {
    this.repository = repository;
  }

  public List<Driver> all() {
    return this.repository.findAll();
  }
}
