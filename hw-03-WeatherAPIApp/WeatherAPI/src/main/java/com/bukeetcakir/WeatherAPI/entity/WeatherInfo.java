package com.bukeetcakir.WeatherAPI.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WeatherInfo {
    private String datetime;

    private double temp;

    private double feelslike;

    private double humidity;

    private String description;
}
