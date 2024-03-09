package com.bukeetcakir.WeatherAPI.service;

import com.bukeetcakir.WeatherAPI.entity.Weather;

public interface WeatherService {
    Weather getDailyWeatherInfo(String city);

    Weather getWeeklyWeatherInfo(String city);

    Weather getMonthlyWeatherInfo(String city);
}
