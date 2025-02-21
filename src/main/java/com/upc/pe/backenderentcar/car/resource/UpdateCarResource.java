package com.upc.pe.backenderentcar.car.resource;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class UpdateCarResource {
    private Long id;

    @NotNull
    @NotBlank
    @Size(max = 100)
    private String address;

    @NotNull
    @NotBlank
    @Size(max = 100)
    private String brand;

    private int year;

    @NotNull
    @NotBlank
    @Size(max = 50)
    private String model;

    private int mileage;

    private int seating;

    private String manual;

    private int carValueInDollars;

    @NotNull
    @NotBlank
    @Size(max = 500)
    private String extraInformation;

    private int rate;

    private int rentAmountDay;

    @NotNull
    @NotBlank
    @Size(max = 400)
    private String imagePath;

    @NotNull
    @NotBlank
    @Size(max = 20)
    private String category;

    @NotNull
    @NotBlank
    @Size(max = 20)
    private String mechanicConditions;
}
