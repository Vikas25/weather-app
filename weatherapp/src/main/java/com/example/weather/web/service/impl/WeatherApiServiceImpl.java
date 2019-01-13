package com.example.weather.web.service.impl;

import com.example.weather.integration.ows.Weather;
import com.example.weather.integration.ows.WeatherForecast;
import com.example.weather.integration.ows.WeatherService;
import com.example.weather.web.converter.WeatherSummaryConverter;
import com.example.weather.web.dao.WeatherSummaryDao;
import com.example.weather.web.dto.WeatherSummaryDto;
import com.example.weather.web.service.WeatherApiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

@Service
public class WeatherApiServiceImpl implements WeatherApiService{

    @Autowired
    private WeatherService weatherService;

    @Autowired
    private WeatherSummaryDao weatherSummaryDao;

    private static final Logger logger = LoggerFactory.getLogger(WeatherService.class);

    @Override
    public WeatherSummaryDto getWeather(String country, String city) {
        Weather weather = weatherService.getWeather(country, city);

        logger.info("Getting current Weather for Country:{} , City:{}", country, city);

        WeatherSummaryDto weatherSummaryDto = new WeatherSummaryDto(country, city, weather);

        Timestamp timestamp = Timestamp.from(weather.getTimestamp());
        DateFormat fmt = new SimpleDateFormat("MMMM dd, yyyy", Locale.US);
        weatherSummaryDto.setDate(fmt.format(timestamp));
        weatherSummaryDto.setId(weatherSummaryDao.save(WeatherSummaryConverter.dtoToEntity(weatherSummaryDto)).getId());

        logger.info("Current Weather for Country:{} , City:{} => {}", country, city, weatherSummaryDto);

        return weatherSummaryDto;
    }

    @Override
    public WeatherForecast getWeatherForecast(String country, String city) {
        return weatherService.getWeatherForecast(country, city);
    }

    public void deleteWeatherSummary(Integer weatherSummaryId){
        weatherSummaryDao.deleteById(weatherSummaryId);
        return;
    }
}
