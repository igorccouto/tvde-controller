package com.tvdecontroller.api.models.entities;

import com.tvdecontroller.api.models.enums.FuelType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@SuperBuilder
@Table(name = "car")
public class Car {
  @Id
  @GeneratedValue
  private Long id;
  @NotBlank
  private String brand;
  private String model;
  private Integer seats;
  private FuelType fuel;
  private String color;
  @Column(name = "car_value")
  private Long value;
  private Integer monthOfFirstRegistration;
  private Integer yearOfFirstRegistration;
  private String vin;
  private String plate;
  private LocalDate purchaseDate;
}
