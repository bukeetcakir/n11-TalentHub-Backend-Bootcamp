package com.bukeetcakir.WeatherAPI.controller;

import com.bukeetcakir.WeatherAPI.entity.Weather;
import com.bukeetcakir.WeatherAPI.service.WeatherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/weather")
public class WeatherController {
    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    //Daily Request
    @GetMapping("/daily/{city}")
    public ResponseEntity<Weather> getDailyWeatherInfo(@PathVariable String city) {
        Weather response = weatherService.getDailyWeatherInfo(city);
        return ResponseEntity.ok(response);
    }

    //Weekly Request
    @GetMapping("/weekly/{city}")
    public ResponseEntity<Weather> getWeeklyWeatherInfo(@PathVariable String city) {
        Weather response = weatherService.getWeeklyWeatherInfo(city);
        return ResponseEntity.ok(response);
    }

    //Monthly Request
    @GetMapping("/monthly/{city}")
    public ResponseEntity<Weather> getMonthlyWeatherInfo(@PathVariable String city) {
        Weather response = weatherService.getMonthlyWeatherInfo(city);
        return ResponseEntity.ok(response);
    }
}

