package com.example.weather.web.converter;

import com.example.weather.integration.ows.Weather;
import com.example.weather.web.dto.WeatherSummaryDto;
import com.example.weather.web.entity.WeatherSummary;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class WeatherSummaryConverter {

    public static WeatherSummary dtoToEntity(WeatherSummaryDto weatherSummaryDto) {
        WeatherSummary weatherSummary = new WeatherSummary();
        weatherSummary.setCountry(weatherSummaryDto.getCountry());
        weatherSummary.setCity(weatherSummaryDto.getCity());
        weatherSummary.setCode(weatherSummaryDto.getWeather().getWeatherId());
        weatherSummary.setIcon(weatherSummaryDto.getWeather().getWeatherIcon());
        weatherSummary.setTemperature(weatherSummaryDto.getWeather().getTemperature());
        weatherSummary.setTimestamp(weatherSummaryDto.getWeather().getTimestamp().toEpochMilli());
        return weatherSummary;
    }

    public static WeatherSummaryDto entityToDto(WeatherSummary weatherSummary) {
        WeatherSummaryDto weatherSummaryDto = new WeatherSummaryDto();

        Weather weather = new Weather();
        weather.setTimestamp(weatherSummary.getTimestamp());
        weather.setTemperature(weatherSummary.getTemperature());
        weather.setWeatherId(weatherSummary.getCode());
        weather.setWeatherIcon(weatherSummary.getIcon());
        weather.setName(weatherSummary.getCity());

        weatherSummaryDto.setCity(weatherSummary.getCity());
        weatherSummaryDto.setCountry(weatherSummary.getCountry());
        weatherSummaryDto.setWeather(weather);

        Timestamp timestamp = new Timestamp(weatherSummary.getTimestamp());
        DateFormat fmt = new SimpleDateFormat("MMMM dd, yyyy", Locale.US);
        weatherSummaryDto.setDate(fmt.format(timestamp));

        return weatherSummaryDto;
    }

}
