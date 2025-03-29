package com.tvdecontroller.api.configuration;

import com.tvdecontroller.api.models.entities.Car;
import com.tvdecontroller.api.models.enums.FuelType;
import com.tvdecontroller.api.repositories.CarRepository;
import java.time.LocalDate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadFakeDatabase {
  @Bean
  public CommandLineRunner initDatabase(CarRepository repository) {
    return args -> {
      Car mokka = Car.builder().brand("Opel").model("Mokka-e").color("green").fuel(FuelType.ELETRIC)
          .monthOfFirstRegistration(5).yearOfFirstRegistration(2021).seats(5).plate("VG87XR")
          .purchasePrice(13000L).purchaseDate(LocalDate.of(2025, 2, 4)).vin("JGTEKZKXZMW098630)")
          .purchaseMileage(23987).build();

      Car zoe = Car.builder().brand("Renault").model("Zoe").color("purple").fuel(FuelType.ELETRIC)
          .monthOfFirstRegistration(12).yearOfFirstRegistration(2020).seats(5).plate("BO98UT")
          .purchasePrice(10900L).purchaseDate(LocalDate.of(2024, 11, 7)).vin("VXKUKZKXZMW091749")
          .purchaseMileage(34875).build();

      repository.save(mokka);
      repository.save(zoe);
    };
  }
}
