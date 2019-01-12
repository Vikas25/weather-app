package com.example.weather.web.service;

import com.example.weather.web.dto.WeatherSummaryDto;

import java.util.List;

public interface WeatherSummaryService {

    public List<WeatherSummaryDto> getAllCityWeather();
}
