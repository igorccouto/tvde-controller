package com.tvdecontroller.api.configuration;

import com.tvdecontroller.api.models.entities.Car;
import com.tvdecontroller.api.models.enums.FuelType;
import com.tvdecontroller.api.repositories.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadFakeDatabase {
  @Bean
  public CommandLineRunner initDatabase(CarRepository repository) {
    return args -> {
      Car mokka = Car.builder().brand("Opel").model("Mokka-e").color("green").fuel(FuelType.ELETRIC)
          .monthOfFirstRegistration(5).yearOfFirstRegistration(2021).seats(5).build();

      Car zoe = Car.builder().brand("Renault").model("Zoe").color("purple").fuel(FuelType.ELETRIC)
          .monthOfFirstRegistration(12).yearOfFirstRegistration(2020).seats(5).build();

      repository.save(mokka);
      repository.save(zoe);
    };
  }
}
