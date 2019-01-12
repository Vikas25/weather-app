package com.example.weather.web.service.impl;

import com.example.weather.integration.ows.Weather;
import com.example.weather.integration.ows.WeatherForecast;
import com.example.weather.integration.ows.WeatherService;
import com.example.weather.web.converter.WeatherSummaryConverter;
import com.example.weather.web.dao.WeatherSummaryDao;
import com.example.weather.web.dto.WeatherSummaryDto;
import com.example.weather.web.service.WeatherApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherApiServiceImpl implements WeatherApiService{

    @Autowired
    private WeatherService weatherService;

    @Autowired
    private WeatherSummaryDao weatherSummaryDao;

    @Override
    public WeatherSummaryDto getWeather(String country, String city) {
        Weather weather = weatherService.getWeather(country, city);
        WeatherSummaryDto weatherSummaryDto = new WeatherSummaryDto(country, city, weather);
        weatherSummaryDao.save(WeatherSummaryConverter.dtoToEntity(weatherSummaryDto));
        return weatherSummaryDto;
    }

    @Override
    public WeatherForecast getWeatherForecast(String country, String city) {
        return weatherService.getWeatherForecast(country, city);
    }
}
