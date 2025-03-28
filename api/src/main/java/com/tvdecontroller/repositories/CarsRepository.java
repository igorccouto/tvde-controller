package com.tvdecontroller.repositories;

import com.tvdecontroller.models.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

interface CarRepository extends JpaRepository<Car, Long> {
}
