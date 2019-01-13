package com.example.weather.web.service;

import com.example.weather.integration.ows.WeatherForecast;
import com.example.weather.web.dto.WeatherSummaryDto;
import org.springframework.transaction.annotation.Transactional;

public interface WeatherApiService{

    public WeatherSummaryDto getWeather(String country, String city);

    public WeatherForecast getWeatherForecast(String country, String city);

    @Transactional
    public void deleteWeatherSummary(Integer id);

}
