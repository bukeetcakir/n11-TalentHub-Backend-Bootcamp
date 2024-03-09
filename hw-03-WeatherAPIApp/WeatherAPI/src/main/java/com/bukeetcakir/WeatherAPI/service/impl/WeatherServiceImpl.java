package com.bukeetcakir.WeatherAPI.service.impl;

import com.bukeetcakir.WeatherAPI.entity.Weather;
import com.bukeetcakir.WeatherAPI.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class WeatherServiceImpl implements WeatherService {
    private final RestTemplate restTemplate;

    @Value("${weatherAPI.baseUrl}")
    private String url;

    @Value("${weatherAPI.baseKey}")
    private String key;
    private String elements ="datetime,temp,humidity,feelslike,description";
    private String now = LocalDate.now().toString();

    @Override
    public Weather getDailyWeatherInfo(String city) {
        String endpoint = url + city + "/" + now + "?key=" + key + "&unitGroup=metric&include=days&elements=" + elements;
        ResponseEntity<Weather> weather = restTemplate.getForEntity(endpoint, Weather.class);
        return weather.getBody();
    }

    @Override
    public Weather getWeeklyWeatherInfo(String city) {
        String endpoint = url + city + "/next7days?key=" + key + "&unitGroup=metric&include=days&elements=" + elements;
        ResponseEntity<Weather> weatherAPIResponse = restTemplate.getForEntity(endpoint, Weather.class);
        return weatherAPIResponse.getBody();
    }

    @Override
    public Weather getMonthlyWeatherInfo(String city) {
        String endpoint = url + city + "/next30days?key=" + key + "&unitGroup=metric&include=days&elements=" + elements;
        ResponseEntity<Weather> weatherAPIResponse = restTemplate.getForEntity(endpoint, Weather.class);
        return weatherAPIResponse.getBody();
    }
}
