package com.tvdecontroller.api.models.entities;

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
@Table(name = "driver")
public class Driver {
  @Id
  @GeneratedValue
  private Long id;
  @NotBlank
  private String name;
  private LocalDate bithdate;
  private String residentNumber;
  @NotBlank
  private String nif;
  private String driverLicenseNumber;
  private String tvdeLicenseNumber;
}
